/*
* Nome: <Guilherme Fonseca Lira de Meireles>
* Número: <8210415>
* Turma: <LSIRCT1>
*
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.enums.EmployeeType;
import estgconstroi.exceptions.TeamException;
import exceptions.TeamExceptionImpl;

/**
 *
 * @author guilhermeLira
 */
public class TeamImpl implements Team{
    
    private String teamName;
    private Employee leader;
    private Employee[] emp;
    private int numberOfEmployees = 0;
    private Equipments equipments;
    private final int MAX_EQUIPMENTS_PER_TEAM = 20;

    public TeamImpl(String teamName, Employee leader, int numMaxOfEmployees, Equipments equi, TeamImpl[] teams) {
        emp = new Employee[numMaxOfEmployees];
        this.teamName = teamName;
        this.leader = leader;
        this.equipments = equi;
        numberOfEmployees = 0;
        for(Team team : teams){
            if(team != null && team.getLeader() == leader){
                throw new IllegalArgumentException("Trabalhador ja esta noutra equipa!");
            }
        }
    }  

    @Override
    public String getName() {
        return teamName;
    }

    @Override
    public Employee getLeader() {
        return leader;
    }

    @Override
    public void setLeader(Employee empl) throws TeamExceptionImpl {
        try {
            if(empl.getType() != empl.getType().TEAM_LEADER){
                throw new TeamExceptionImpl("O trabalhador nao e Team Leader.");
            }
            
            this.leader = empl;
            
        }catch (TeamExceptionImpl e) {
            throw e;
        }
    }

    @Override
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public void addEmployees(Employee empl) throws TeamException {
        try{
            for (int i=0; i<numberOfEmployees; i++) {
                if (emp[i] != null && emp[i].equals(empl)) {
                    throw new TeamException("O trabalhador já está na equipa.");
                }
            }
            for(int i=0; i<emp.length; i++){
                if (emp[i] == null) {
                    emp[i] = empl;
                    numberOfEmployees++;
                    return;
                }
            }
        }catch (TeamException e) {
            throw e;
        }
    }

    @Override
    public void removeEmployee(Employee empl) throws TeamException {
        try{
            boolean found = false;
           
            for (int i=0; i<numberOfEmployees; i++) {
                if (emp[i] != null && emp[i].equals(empl)) {
                    for (int j=i; j<numberOfEmployees-1; j++) {
                        emp[j] = emp[j+1];
                    }
                    emp[numberOfEmployees-1] = null;
                    numberOfEmployees--; 
                    found = true; 
                    break;
                }
            }
            if (!found) {
                throw new TeamException("O equipamento não foi encontrado na obra.");
            }
        } catch (TeamException e) {
            throw e;
        }
    }

    @Override
    public Employee[] getEmployees(String string) {
        Employee[] result = new Employee[numberOfEmployees];
        int index = 0;
        
        for(Employee employee : emp){
            if (employee != null && employee.getName().equalsIgnoreCase(string)) {
                result[index] = employee;
                index++;
            }
        }
        return result;
    }

    @Override
    public Employee[] getEmployees(EmployeeType et) {
        Employee[] result = new Employee[numberOfEmployees];
        int index = 0;
        
        for(Employee employee : emp){
            if (employee != null && employee.getType() == et) {
                result[index] = employee;
                index++;
            }
        }
        return result;
    }

    @Override
    public Employee[] getEmployees() {
        Employee[] result = new Employee[numberOfEmployees];
        int index = 0;
        
        for(Employee employee : emp){
            if (employee != null) {
                result[index] = employee;
                index++;
            }
        }
        return result;
    }

    @Override
    public Equipments getEquipments() {
        return equipments;
    }
    
    public String toString(){
        return "Nome da equipa: " + getName() + ", Lider da equipa: " + getLeader();
    }
    
}
