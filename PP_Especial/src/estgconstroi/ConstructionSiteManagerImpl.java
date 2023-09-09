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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
