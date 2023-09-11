/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import enums.AvaliationType;
import enums.ProblemType;
import estgconstroi.enums.EmployeeType;
import estgconstroi.enums.EquipmentStatus;
import estgconstroi.enums.EquipmentType;
import estgconstroi.enums.EventPriority;
import estgconstroi.exceptions.EventManagerException;
import estgconstroi.exceptions.TeamException;
import exceptions.ConstructionSiteExceptionImpl;
import exceptions.ConstructionSiteManagerExceptionImpl;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class LoadData {

    // as viariaveis
    private EmployeeImpl emp1, emp2, emp3, emp4;
    private EquipmentImpl equi1, equi2, equi3, equi4, equi5, equi6, equi7, equi8;
    private EquipmentsImpls equips, equips2, equips3, equips4, equips5, equips6, equips7, equips8;
    private TeamImpl team, team2, team3, team4;
    private ConstructionSiteImpl cons, cons2, cons3, cons4;
    private ConstructionSiteManagerImpl csm;
    private EventImpl event1, event2, event3, event4;
    private NotifierImpl notifier1, notifier2, notifier3;
    private EventManagerImpl eventM;
    private Inspection inspection1, inspection2, inspection3, inspection4;

    public void data() throws ConstructionSiteExceptionImpl, TeamException, ConstructionSiteManagerExceptionImpl, EventManagerException {

        emp1 = new EmployeeImpl("Lira", "123abc", EmployeeType.TEAM_LEADER);
        emp2 = new EmployeeImpl("Joao", "321cba", EmployeeType.MANAGER);
        emp3 = new EmployeeImpl("Paulo", "abc123", EmployeeType.WORKER);
        emp4 = new EmployeeImpl("Rodrigo", "cba321", EmployeeType.WORKER);

        equi1 = new EquipmentImpl("Escavadora", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi2 = new EquipmentImpl("Martelo", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);
        equi3 = new EquipmentImpl("Capacete", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi4 = new EquipmentImpl("Colete", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi5 = new EquipmentImpl("Chave de fendas", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi6 = new EquipmentImpl("Papel", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi7 = new EquipmentImpl("Serra eletrica", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);//EQUIPMENTIMPL
        equi8 = new EquipmentImpl("Tijolo", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);//EQUIPMENTIMPL

        equips = new EquipmentsImpls(10);
        equips2 = new EquipmentsImpls(10);
        equips3 = new EquipmentsImpls(10);
        equips4 = new EquipmentsImpls(10);
        equips5 = new EquipmentsImpls(10);
        equips6 = new EquipmentsImpls(10);
        equips7 = new EquipmentsImpls(10);
        equips8 = new EquipmentsImpls(10);

        equips.addEquipment(equi1);
        equips2.addEquipment(equi2);
        equips3.addEquipment(equi3);
        equips4.addEquipment(equi4);
        equips5.addEquipment(equi5);
        equips6.addEquipment(equi6);
        equips7.addEquipment(equi7);
        equips8.addEquipment(equi8);

        team = new TeamImpl("Porto", emp1, 10, equips);                                                      //TEAMSIMPLS
        team2 = new TeamImpl("Benfica", emp1, 10, equips2);
        team3 = new TeamImpl("Sporting", emp1, 10, equips3);
        team4 = new TeamImpl("Juventus", emp1, 10, equips4);

        team.addEmployees(emp1);
        team2.addEmployees(emp2);
        team3.addEmployees(emp3);
        team4.addEmployees(emp4);

        cons = new ConstructionSiteImpl("Projeto1", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), emp2, 5, equips5);
        cons2 = new ConstructionSiteImpl("Projeto2", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), emp2, 5, equips6);
        cons3 = new ConstructionSiteImpl("Projeto3", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), emp2, 5, equips7);
        cons4 = new ConstructionSiteImpl("Projeto4", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), emp2, 5, equips8);

        cons.setResponsible(emp2);
        cons.addTeam(team);
        cons2.addTeam(team2);
        cons3.addTeam(team3);
        cons4.addTeam(team4);

        csm = new ConstructionSiteManagerImpl(10);

        csm.add(cons);
        csm.add(cons2);
        csm.add(cons3);
        csm.add(cons4);

        notifier1 = new NotifierImpl("E-mail");
        notifier2 = new NotifierImpl("SMS");
        notifier3 = new NotifierImpl("Console");

        Notifier[] notifiers = {notifier1, notifier2};    

        event1 = new EventImpl(EventPriority.HIGH, "Avaria", emp1, cons, "Escavadora caiu", "Escavadora avariou", "qwerty", LocalDate.of(2023, 9, 20));
        // event2 = new EventImpl(EventPriority.LOW, "Acidente", emp2, cons, "Trabalhador partiu o pe", "Trabalhador lesionado", "abcdef", LocalDate.of(2023, 9, 22));
        // event3 = new EventImpl(EventPriority.NORMAL, "Avaria", emp3, cons3, "serra eletrica estragou", "Serra eletrica avariou", "yuiop", LocalDate.of(2023, 9, 25));
        event2 = new EventImpl(EventPriority.LOW, "Perda de material", emp2, cons2, "Perdeu se o martelo", "Martelo perdido", "abcdef", LocalDate.of(2023, 9, 22), emp1);
        event3 = new EventImpl(EventPriority.NORMAL, "Avaria", emp3, cons3, "Serra eletrica parou de funcionar", "Serra eletrica avariou", "yuiop", LocalDate.of(2023, 9, 23), equi1);
        event4 = new EventImpl(EventPriority.NORMAL, "Trabalhador e maquina", emp3, cons3, "Trabalhador avariou maquina", "Maquina avariada", "asdfg", LocalDate.of(2023, 9, 26), emp2, equi1);

        eventM = new EventManagerImpl(10);

        eventM.reportEvent(event1);
        eventM.reportEvent(event2);
        eventM.reportEvent(event3);
        eventM.reportEvent(event4);
        
        inspection1 = new Inspection(LocalDate.of(2023, 9, 22), AvaliationType.APROVED, equi2);
        inspection2 = new Inspection(LocalDate.of(2023, 9, 23), AvaliationType.NOT_APROVED, equi1, "Escavadora avariada");
        inspection3 = new Inspection(LocalDate.of(2023, 9, 24), AvaliationType.APROVED, emp3, "Mario", 1234);
        inspection4 = new Inspection(LocalDate.of(2023, 9, 24), AvaliationType.NOT_APROVED, emp4, "Mario", 1234, 10, ProblemType.MENTAL);  

    }
    
    public void listInspection(){
        Inspection[] inspections = {inspection1, inspection2, inspection3, inspection4};
        for(Inspection insp : inspections){
            if(insp != null){
                System.out.println(insp);
            }
        }
    }

    private void listEquipments(Equipments equipment, Equipments equipments) {
        Equipment[] equipamentos = equipment.getEquipment();
        Equipment[] equips = equipments.getEquipment();
        System.out.println("EQUIPAMENTOS: ");
        for (Equipment equipamento : equipamentos) {
            for(Equipment eqpmt : equips){
                if (equipamento != null && eqpmt != null) {  
                    System.out.println(equipamento);
                    System.out.println(eqpmt);
                }
            }
        }
    }

    private void listEmployee(Team employee) {
        Employee[] employees = employee.getEmployees();
        System.out.println("TRABALHADORES: ");
        for (Employee employeeList : employees) {
            if (employeeList != null) {   
                System.out.println(employeeList);
            }
        }
    }

    private void listTeams(ConstructionSite team) {
        Team[] teams = team.getTeams();
        System.out.println("EQUIPAS: ");
        for (Team equipa : teams) {
            if (equipa != null) {
                System.out.println(equipa);
                listEmployee(equipa);
                listEquipments(team.getEquipments(), equipa.getEquipments());
            }
        }
    }

    private void listConstructionSites(ConstructionSiteManagerImpl constructionSite) {
        ConstructionSite[] constructionS = constructionSite.getConstructionSites();
        for (ConstructionSite constructionSites : constructionS) {
            if (constructionSites != null) {
                System.out.println("\nCONSTRUCTION SITE: ");
                System.out.println(constructionSites);
                listTeams(constructionSites);
                listEvents(eventM, constructionSites.getName());
            }
        }
    }

    private void listEvents(EventManagerImpl event, String constructionSite) {
        Event[] events = event.getEvent(constructionSite);
        System.out.println("EVENTOS: ");
        for (Event evento : events) {
            if (evento != null) {             
                System.out.println(evento);
            }
        }
    }

    public void sendReport() throws IOException, InterruptedException {
        // System.out.println(event1);
        Event[] events = eventM.getEvent();
        for (Event evento : events) {

            if (evento != null) {
                InsuranceReporter report = new InsuranceReporter();
                String result = report.addEvent(evento.toString());
                System.out.println(result);
            }
        }

    }

    public void getReport() throws IOException, InterruptedException {
        InsuranceReporter report = new InsuranceReporter();
        String result = report.getEvents("xpto", "Grupo8");
        System.out.println(result);
    }

    public void delReport() throws IOException, InterruptedException {
        InsuranceReporter report = new InsuranceReporter();
        String result = report.resetEvents("xpto", "Grupo8");
        System.out.println(result);
    }

    public void listing() {
        listConstructionSites(csm);
    }

}
