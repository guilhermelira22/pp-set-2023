/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_especial;

import estgconstroi.ConstructionSite;
import estgconstroi.ConstructionSiteImpl;
import estgconstroi.ConstructionSiteManagerImpl;
import estgconstroi.Employee;
import estgconstroi.EmployeeImpl;
import estgconstroi.Equipment;
import estgconstroi.EquipmentImpl;
import estgconstroi.Equipments;
import estgconstroi.EquipmentsImpls;
import estgconstroi.EventImpl;
import estgconstroi.IncidentImpl;
import estgconstroi.Team;
import estgconstroi.TeamImpl;
import estgconstroi.enums.EmployeeType;
import estgconstroi.enums.EquipmentStatus;
import estgconstroi.enums.EquipmentType;
import estgconstroi.enums.EventPriority;
import estgconstroi.exceptions.ConstructionSiteException;
import estgconstroi.exceptions.TeamException;
import exceptions.ConstructionSiteExceptionImpl;
import exceptions.ConstructionSiteManagerExceptionImpl;
import exceptions.TeamExceptionImpl;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class PP_Especial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ConstructionSiteExceptionImpl, TeamExceptionImpl, TeamException, ConstructionSiteException, ConstructionSiteManagerExceptionImpl {    

        EmployeeImpl emp1 = new EmployeeImpl("Lira", "123abc", EmployeeType.TEAM_LEADER);                                                 // EMPLOYEEIMPL     
        EmployeeImpl emp2 = new EmployeeImpl("Joao", "321cba", EmployeeType.MANAGER);                                                 // EMPLOYEEIMPL
        EmployeeImpl emp3 = new EmployeeImpl("Paulo", "abc123", EmployeeType.WORKER);                                                 // EMPLOYEEIMPL
        EmployeeImpl emp4 = new EmployeeImpl("Rodrigo", "cba321", EmployeeType.WORKER);                                                 // EMPLOYEEIMPL
        System.out.println(emp1);                                                                                        // EMPLOYEEIMPL   
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        System.out.println("");
        
        EquipmentImpl equi1 = new EquipmentImpl("Escavadora", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);     //EQUIPMENTIMPL
        EquipmentImpl equi2 = new EquipmentImpl("Martelo", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);             //EQUIPMENTIMPL
        EquipmentImpl equi3 = new EquipmentImpl("Capacete", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);        //EQUIPMENTIMPL
        EquipmentImpl equi4 = new EquipmentImpl("Colete", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);          //EQUIPMENTIMPL
        System.out.println(equi1);                                                                                      //EQUIPMENTIMPL
        System.out.println(equi2);                                                                                      //EQUIPMENTIMPL
        System.out.println(equi3);                                                                                      //EQUIPMENTIMPL
        System.out.println(equi4);                                                                                      //EQUIPMENTIMPL
        
        System.out.println("");
        
        IncidentImpl inc = new IncidentImpl("Escavadora avariou", "Escavadora caiu");                                   //INCIDENTIMPL
        System.out.println(inc);                                                                                        //INCIDENTIMPL
        
        System.out.println("");
        
        System.out.println("Todos os equipamentos adicionados:");                                                       //EQUIPMENTSIMPLS
        
        EquipmentsImpls equips = new EquipmentsImpls(10);    
        
        equips.addEquipment(equi1);
        equips.addEquipment(equi2);
        equips.addEquipment(equi3);
        equips.addEquipment(equi4);
        
        Equipment[] equipamentos = equips.getEquipment();
        for (Equipment equipamento : equipamentos) {
            if (equipamento != null) {
                System.out.println(equipamento);
            }
        }
        System.out.println("");
        System.out.println("Equipamentos por nome: ");
        Equipment[] equipamentosName = equips.getEquipment("Escavadora");
        for (Equipment equipamento : equipamentosName) {
            if (equipamento != null) {
                System.out.println(equipamento);
            }
        }
        System.out.println("");
        System.out.println("Equipamentos por status: ");
        Equipment[] equipamentosStatus = equips.getEquipment(EquipmentStatus.OPERATIVE);
        for (Equipment equipamento : equipamentosStatus) {
            if (equipamento != null) {
                System.out.println(equipamento);
            }
        }
        System.out.println("");
        System.out.println("Equipamentos por tipo: ");
        Equipment[] equipamentosType = equips.getEquipment(EquipmentType.EQUIPMENT);
        for (Equipment equipamento : equipamentosType) {
            if (equipamento != null) {
                System.out.println(equipamento);
            }
        }                                                                                                               //EQUIPMENTSIMPLS
        
        System.out.println("");
        TeamImpl team = new TeamImpl("Porto", emp1, 10, equips);                                                      //TEAMSIMPLS
        TeamImpl team2 = new TeamImpl("Benfica", emp1, 10, equips);
        TeamImpl team3 = new TeamImpl("Sporting", emp1, 10, equips);
        System.out.println("Team leader name: " + team.getLeader().getName());
        System.out.println("");
        
        team.addEmployees(emp1);
        team.addEmployees(emp2);
        team.addEmployees(emp3);
        team.addEmployees(emp4);
        
        team2.addEmployees(emp1);
        team2.addEmployees(emp2);
        team2.addEmployees(emp3);
        team2.addEmployees(emp4);
        
        team3.addEmployees(emp1);
        team3.addEmployees(emp2);
        team3.addEmployees(emp3);
        team3.addEmployees(emp4);
        
        System.out.println("Todos os trabalhadores da equipa: ");
        Employee[] employees = team.getEmployees();
        for(Employee employee : employees){
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println("");
        System.out.println("Trabalhadores por nome: ");
        Employee[] employeesName = team.getEmployees("Joao");
        for(Employee employee : employeesName){
            if(employee != null){
                System.out.println(employee);
            }
        }
        System.out.println("");
        System.out.println("Trabalhadores por tipo: ");
        Employee[] employeesTipo = team.getEmployees(EmployeeType.WORKER);
        for(Employee employee : employeesTipo){
            if(employee != null){
                System.out.println(employee);
            }
        }                                                                                                               //TEAMSIMPLS
        
        System.out.println("");
                                                                                                                        //CONSTRUCTIONSITEIMPLS
        ConstructionSiteImpl cons = new ConstructionSiteImpl("Projeto", "Penafiel", "Sim", LocalDate.of(2023, 9, 6), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp2, 5, equips);
        ConstructionSiteImpl cons2 = new ConstructionSiteImpl("Projeto", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp2, 5, equips);
        ConstructionSiteImpl cons3 = new ConstructionSiteImpl("Projeto", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp2, 5, equips);
        ConstructionSiteImpl cons4 = new ConstructionSiteImpl("Projeto", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp2, 5, equips);
        cons.setResponsible(emp2);
        
        cons.addTeam(team);
        cons.addTeam(team2);
        cons.addTeam(team3);
        
        cons2.addTeam(team);
        cons2.addTeam(team2);
        cons2.addTeam(team3);
        
        cons3.addTeam(team);
        cons3.addTeam(team2);
        cons3.addTeam(team3);
        
        cons4.addTeam(team);
        cons4.addTeam(team2);
        cons4.addTeam(team3);
        
        System.out.println("Equipas: ");
        Team[] teams = cons.getTeams();
        for(Team equipa : teams){
            if(equipa != null){
                System.out.println(equipa);
            }
        }
        System.out.println("");
        System.out.println("Equipas por nome: ");
        Team[] teamsName = cons.getTeams("Porto");
        for(Team equipa : teamsName){
            if(equipa != null){
                System.out.println(equipa);
            }
        }
        System.out.println("");
        System.out.println(cons.isValid());
        System.out.println("");
        System.out.println("Equipments: ");
        System.out.println(cons.getEquipments());
        
        
        ConstructionSiteManagerImpl csm = new ConstructionSiteManagerImpl(10);
        csm.add(cons);
        csm.add(cons2);
        csm.add(cons3);
        csm.add(cons4);
        System.out.println("");
        System.out.println("Working Teams: ");
        Team[] workingTeams = csm.getWorkingTeams();
        for(Team wkTeam : workingTeams){
            if(wkTeam != null){
                System.out.println(wkTeam);
            }
        }
        System.out.println("");
        System.out.println("Not working teams: ");
        Team[] notWorkingTeams = csm.getIddleTeams();
        for(Team nWkTeam : notWorkingTeams){
            if(nWkTeam != null){
                System.out.println(nWkTeam);
            }
        }
        System.out.println("");
        System.out.println("Equipments in use: ");
        Equipment[] equiInUse = csm.getEquipmentsInUse();
        for(Equipment eqpmtInUse : equiInUse){
            if(eqpmtInUse != null){
                System.out.println(eqpmtInUse);
            }
        }
        System.out.println("");
        System.out.println("Equipments not in use: ");
        Equipment[] equiNotInUse = csm.getIddleEquipments();
        for(Equipment eqpmtNotInUse : equiNotInUse){
            if(eqpmtNotInUse != null){
                System.out.println(eqpmtNotInUse);
            }
        }
        System.out.println("");
        System.out.println("Permits expired: ");
        ConstructionSite[] consPermit = csm.getConstructionSitesWithPermitExpired();
        for(ConstructionSite consPermitEx : consPermit){
            if(consPermitEx != null){
                System.out.println(consPermitEx);
            }
        }
        
        
        EventImpl event1 = new EventImpl(EventPriority.NORMAL, "Evento1", emp4, cons4);
        EventImpl event2 = new EventImpl(EventPriority.NORMAL, "Evento2", emp3, cons3);
        EventImpl event3 = new EventImpl(EventPriority.NORMAL, "Evento3", emp2, cons2);
        
    }
    
}
