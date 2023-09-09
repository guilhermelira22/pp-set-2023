/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.enums.EmployeeType;
import estgconstroi.exceptions.ConstructionSiteException;
import exceptions.ConstructionSiteExceptionImpl;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class ConstructionSiteImpl implements ConstructionSite{
    
    private String name;
    private String location;
    private String permit;
    private LocalDate permitExpirationDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Employee responsible;
    private Team[] teams; 
    private int numberOfteams = 0;
    private Equipments equipments;
    private final int MAX_EQUIPMENTS_PER_TEAM = 20;

    public ConstructionSiteImpl(String name, String location, String permit, LocalDate permitExpirationDate, LocalDate startDate, LocalDate endDate, Employee responsible, int numMaxOfTeams) {
        this.name = name;
        this.location = location;
        this.permit = permit;
        this.permitExpirationDate = permitExpirationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.responsible = responsible;
        teams = new Team[numMaxOfTeams];
        equipments = new EquipmentsImpls(MAX_EQUIPMENTS_PER_TEAM);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getPermit() {
        return permit;
    }

    @Override
    public LocalDate getPermitExpirationDate() {
        return permitExpirationDate;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public void setPermit(String string, LocalDate ld) {
        this.permit = string;
        this.permitExpirationDate = ld;
    }

    @Override
    public Employee getResponsible() {
        return responsible;
    }

    @Override
    public void setResponsible(Employee empl) throws ConstructionSiteExceptionImpl {
        try{
            if(empl.getType() != empl.getType().MANAGER){
                throw new ConstructionSiteExceptionImpl("O trabalhador nao e manager");
            }
            
            this.responsible = empl;
            
        }catch(ConstructionSiteExceptionImpl e){
            throw e;
        }
    }

    @Override
    public void addTeam(Team team) throws ConstructionSiteExceptionImpl {
        try{
            for(int i=0; i<numberOfteams; i++){
                if(teams[i] != null && teams[i].equals(team)){
                    throw new ConstructionSiteExceptionImpl("A equipa ja esta na obra");
                }
            }
            
            for(int i=0; i<teams.length; i++){
                if (teams[i] == null) {
                    teams[i] = team;
                    numberOfteams++;
                    return;
                }
            }
            
        }catch(ConstructionSiteExceptionImpl e){
            throw e;
        }
    }

    @Override
    public void removeTeam(Team team) throws ConstructionSiteException {
        try{
            boolean found = false;
            
            for(int i=0; i<numberOfteams; i++){
                if (teams[i] != null && teams[i].equals(team)) {
                    for (int j=i; j<numberOfteams-1; j++) {
                        teams[j] = teams[j+1];
                    }
                    teams[numberOfteams-1] = null;
                    numberOfteams--; 
                    found = true; 
                    break;
                }
            }
            if (!found){
                throw new ConstructionSiteException("A equipa nao esta na obra");
            }
        }catch (ConstructionSiteException e){
            throw e;
        }
    }

    @Override
    public Team[] getTeams(String string) {
        Team[] result = new Team[numberOfteams];
        int index = 0;
        
        for(Team team : teams){
            if (team != null && team.getName() == string) {
                result[index] = team;
                index++;
            }
        }
        return result;
    }

    @Override
    public Team[] getTeams() {
        Team[] result = new Team[numberOfteams];
        int index = 0;
        
        for(Team team : teams){
            if (team != null) {
                result[index] = team;
                index++;
            }
        }
        return result;
    }

    @Override
    public boolean isValid() {
        if(responsible.getType() != responsible.getType().MANAGER){
            return false;
        }
        if(numberOfteams == 0){
            return false;
        }
        return true;
    }

    @Override
    public Equipments getEquipments() {
        return equipments;
    }
    
}
