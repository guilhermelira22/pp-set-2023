/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.exceptions.ConstructionSiteManagerException;
import exceptions.ConstructionSiteManagerExceptionImpl;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author guilhermeLira
 */
public class ConstructionSiteManagerImpl implements ConstructionSiteManager{
    
    private ConstructionSite[] consS;
    private int numberOfConsS = 0;
    private final int MAX_TEAMS_PER_CONSTRUCTION_SITE = 10;
    private final int MAX_EQUIPMENTS_PER_CONSTRUCTION_SITE = 20;

    public ConstructionSiteManagerImpl(int maxConsS) {
        consS = new ConstructionSite[maxConsS];
        if (!isValid()) {
            throw new IllegalArgumentException("Obra invalida!");
        }
    }

    @Override
    public void add(ConstructionSite cs) throws ConstructionSiteManagerExceptionImpl {
        try{
            for(int i=0; i<numberOfConsS; i++){
                if(consS[i].equals(cs)){
                    throw new ConstructionSiteManagerExceptionImpl("A obra ja esta existe");
                }
            }
            
            for(int i=0; i<consS.length; i++){
                if (consS[i] == null) {
                    consS[i] = cs;
                    numberOfConsS++;
                    return;
                }
            }
            
        }catch(ConstructionSiteManagerExceptionImpl e){
            throw e;
        }
    }

    @Override
    public Team[] getWorkingTeams() {
        Team[] workingTeams = new Team[numberOfConsS * MAX_TEAMS_PER_CONSTRUCTION_SITE];
        int index = 0;

        for (ConstructionSite cs : consS) {
            if (cs != null && cs.isValid()) {
                Team[] teams = cs.getTeams();
                for (Team team : teams) {
                    if (team != null) {
                        workingTeams[index] = team;
                        index++;
                    }
                }
            }
        }

        return Arrays.copyOf(workingTeams, index);
    }

    @Override
    public Team[] getIddleTeams() {
        Team[] iddleTeams = new Team[numberOfConsS * MAX_TEAMS_PER_CONSTRUCTION_SITE];
        int index = 0;

        for (ConstructionSite cs : consS) {
            if (cs != null && !cs.isValid()) {
                Team[] teams = cs.getTeams();
                for (Team team : teams) {
                    if (team != null) {
                        iddleTeams[index] = team;
                        index++;
                    }
                }
            }
        }

        return Arrays.copyOf(iddleTeams, index);
    }

    @Override
    public Equipment[] getEquipmentsInUse() {
        Equipment[] equipmentsInUse = new Equipment[numberOfConsS * MAX_EQUIPMENTS_PER_CONSTRUCTION_SITE];
        int index = 0;

        for (ConstructionSite cs : consS) {
            if (cs != null && cs.isValid()) {
                Equipment[] equipment = cs.getEquipments().getEquipment();
                for (Equipment eq : equipment) {
                    if (eq != null) {
                        equipmentsInUse[index] = eq;
                        index++;
                    }
                }
            }
        }

        return Arrays.copyOf(equipmentsInUse, index);
    }

    @Override
    public Equipment[] getIddleEquipments() {
        Equipment[] iddleEquipments = new Equipment[numberOfConsS * MAX_EQUIPMENTS_PER_CONSTRUCTION_SITE];
        int index = 0;

        for (ConstructionSite cs : consS) {
            if (cs != null && !cs.isValid()) {
                Equipment[] equipment = cs.getEquipments().getEquipment();
                for (Equipment eq : equipment) {
                    if (eq != null) {
                        iddleEquipments[index] = eq;
                        index++;
                    }
                }
            }
        }

        return Arrays.copyOf(iddleEquipments, index);
    }

    @Override
    public ConstructionSite[] getConstructionSitesWithPermitExpired() {
        ConstructionSite[] expiredPermitSites = new ConstructionSite[numberOfConsS];
        int index = 0;

        for (ConstructionSite cs : consS) {
            if (cs != null && cs.getPermitExpirationDate().isBefore(LocalDate.now())) {
                expiredPermitSites[index] = cs;
                index++;
            }
        }

        return Arrays.copyOf(expiredPermitSites, index);
    }

    @Override
    public boolean isValid() {
        Equipment[] allEquipment = new Equipment[numberOfConsS * MAX_EQUIPMENTS_PER_CONSTRUCTION_SITE];
        Team[] assignedTeams = new Team[numberOfConsS * MAX_TEAMS_PER_CONSTRUCTION_SITE];
        Employee[] assignedEmployees = new Employee[numberOfConsS * MAX_TEAMS_PER_CONSTRUCTION_SITE * MAX_EQUIPMENTS_PER_CONSTRUCTION_SITE];
        int index = 0;      

        for (ConstructionSite cs : consS) {
            if (cs != null && cs.isValid()) {
                Equipment[] constructionSiteEquipment = cs.getEquipments().getEquipment();
                for (Equipment eq : constructionSiteEquipment) {
                    if (eq != null) {
                        allEquipment[index] = eq;
                        index++;
                    }
                }

                Team[] teams = cs.getTeams();
                for (Team team : teams) {
                    if (team != null) {
                        Equipment[] teamEquipment = team.getEquipments().getEquipment();
                        for (Equipment eq : teamEquipment) {
                            if (eq != null) {
                                allEquipment[index] = eq;
                                index++;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (allEquipment[i] != null && allEquipment[j] != null && allEquipment[i].equals(allEquipment[j])) {
                    return false;
                }
            }
        }
        
        for (ConstructionSite cs : consS) {
            if (cs != null && cs.isValid()) {
                Team[] teams = cs.getTeams();
                for (Team team : teams) {
                    if (team != null) {
                        boolean isTeamAlreadyAssigned = false;
                        for (int i = 0; i < index; i++) {
                            if (assignedTeams[i] != null && assignedTeams[i].equals(team)) {
                                isTeamAlreadyAssigned = true;
                                break;
                            }
                        }
                        if (isTeamAlreadyAssigned) {
                            return false; 
                        }
                        assignedTeams[index] = team;
                        index++;
                    }
                }
            }
        }
        
        for (ConstructionSite cs : consS) {
            if (cs != null && cs.isValid()) {
                Team[] teams = cs.getTeams();
                for (Team team : teams) {
                    if (team != null) {
                        Employee[] teamEmployees = team.getEmployees();
                        for (Employee employee : teamEmployees) {
                            if (employee != null) {
                                boolean isEmployeeAlreadyAssigned = false;
                                for (int i = 0; i < index; i++) {
                                    if (assignedEmployees[i] != null && assignedEmployees[i].equals(employee)) {
                                        isEmployeeAlreadyAssigned = true;
                                        break;
                                    }
                                }
                                if (isEmployeeAlreadyAssigned) {
                                    return false;
                                }
                                assignedEmployees[index] = employee;
                                index++;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
    
    public ConstructionSite[] getConstructionSites(){
        ConstructionSite[] result = new ConstructionSite[numberOfConsS];
        int index = 0;
        
        for(ConstructionSite constructionS : consS){
            if (constructionS != null) {
                result[index] = constructionS;
                index++;
            }
        }
        return result;
    }
    
}
