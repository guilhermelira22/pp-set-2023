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

    private EmployeeImpl emp1, emp2, emp3, emp4, a, b, c, d, e, f;
    private EquipmentImpl equi1, equi2, equi3, equi4, equi5, equi6, equi7, equi8;
    private EquipmentsImpls equips, equips2, equips3, equips4, equips5, equips6, equips7, equips8;
    private TeamImpl team, team2, team3, team4;
    private ConstructionSiteImpl cons, cons2, cons3, cons4;
    private ConstructionSiteManagerImpl csm;
    private EventImpl event1, event2, event3, event4;
    private NotifierImpl notifier1, notifier2, notifier3;
    private EventManagerImpl eventM;
    private Inspection inspection1, inspection2, inspection3, inspection4;

    /**
     * Função para carregar todos os dados
     * 
     * @throws ConstructionSiteExceptionImpl
     * @throws TeamException
     * @throws ConstructionSiteManagerExceptionImpl
     * @throws EventManagerException 
     */
    
    public void data() throws ConstructionSiteExceptionImpl, TeamException, ConstructionSiteManagerExceptionImpl, EventManagerException {

        emp1 = new EmployeeImpl("Lira", "123abc", EmployeeType.TEAM_LEADER);
        d = new EmployeeImpl("Fernando", "5", EmployeeType.TEAM_LEADER);
        e = new EmployeeImpl("Filipe", "6", EmployeeType.TEAM_LEADER);
        f = new EmployeeImpl("Tiago", "7", EmployeeType.TEAM_LEADER);
        emp2 = new EmployeeImpl("Joao", "321cba", EmployeeType.MANAGER);
        a = new EmployeeImpl("Joaquim", "2", EmployeeType.MANAGER);
        b = new EmployeeImpl("Hugo", "3", EmployeeType.MANAGER);
        c = new EmployeeImpl("Roberto", "4", EmployeeType.MANAGER);
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
        
        TeamImpl[] teams = new TeamImpl[10];

        
        team = new TeamImpl("Porto", emp1, 10, equips, teams); 
        teams[0] = team;
        team2 = new TeamImpl("Benfica", d, 10, equips2, teams);
        teams[1] = team2;
        team3 = new TeamImpl("Sporting", e, 10, equips3, teams);
        teams[2] = team3;
        team4 = new TeamImpl("Juventus", f, 10, equips4, teams);
        teams[3] = team4;

        team.addEmployees(emp1);
        team2.addEmployees(emp2);
        team3.addEmployees(emp3);
        team4.addEmployees(emp4);
        
        csm = new ConstructionSiteManagerImpl(10);
        
        cons = new ConstructionSiteImpl("Projeto1", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), emp2, 5, equips5, csm);
        csm.add(cons);
        cons2 = new ConstructionSiteImpl("Projeto2", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), a, 5, equips6, csm);
        csm.add(cons2);
        cons3 = new ConstructionSiteImpl("Projeto3", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), b, 5, equips7, csm);
        csm.add(cons3);
        cons4 = new ConstructionSiteImpl("Projeto4", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 29), c, 5, equips8, csm);
        csm.add(cons4);

        cons.addTeam(team);
        cons2.addTeam(team2);
        cons3.addTeam(team3);
        cons4.addTeam(team4);

        // csm = new ConstructionSiteManagerImpl(10);

        // csm.add(cons);
        //csm.add(cons2);
        //csm.add(cons3);
        //csm.add(cons4);

        //notifier1 = new NotifierImpl("E-mail");
        //notifier2 = new NotifierImpl("SMS");
        //notifier3 = new NotifierImpl("Console");

        //Notifier[] notifiers = {notifier1, notifier2};    

        EventImpl[] eventoslista = new EventImpl[10];
        event1 = new EventImpl(EventPriority.HIGH, "Avaria", emp1, cons, "Escavadora caiu", "Escavadora avariou", "qwerty", LocalDate.of(2023, 9, 20));
        eventoslista[0] = event1;
        event2 = new EventImpl(EventPriority.LOW, "Perda de material", emp2, cons2, "Perdeu se o martelo", "Martelo perdido", "abcdef", LocalDate.of(2023, 9, 22), emp1);
        eventoslista[1] = event2;
        event3 = new EventImpl(EventPriority.NORMAL, "Avaria", emp3, cons3, "Serra eletrica parou de funcionar", "Serra eletrica avariou", "yuiop", LocalDate.of(2023, 9, 23), equi1);
        eventoslista[2] = event3;
        event4 = new EventImpl(EventPriority.NORMAL, "Trabalhador e maquina", emp3, cons3, "Trabalhador avariou maquina", "Maquina avariada", "asdfg", LocalDate.of(2023, 9, 26), emp2, equi1);
        eventoslista[3] = event4;

        eventM = new EventManagerImpl(10);

        eventM.reportEvent(event1);
        eventM.reportEvent(event2);
        eventM.reportEvent(event3);
        eventM.reportEvent(event4);
        
        inspection1 = new EquipmentInspection(LocalDate.of(2023, 9, 22), AvaliationType.APROVED, equi2);
        inspection2 = new EquipmentInspection(LocalDate.of(2023, 9, 23), AvaliationType.NOT_APROVED, equi1, "Escavadora avariada");
        inspection3 = new EmployeeInspection(LocalDate.of(2023, 9, 24), AvaliationType.APROVED, emp3, "Mario", 1234);
        inspection4 = new EmployeeInspection(LocalDate.of(2023, 9, 24), AvaliationType.NOT_APROVED, emp4, "Mario", 1234, 10, ProblemType.MENTAL);  
               
        if(csm.isValid() == false){
            throw new IllegalArgumentException("Obra invalida!");
        }
        
        Event[] eventos = eventM.getEventType("Accident", eventoslista);
        for(Event eventoslist : eventos){
            if(eventoslist != null){
                System.out.println(eventoslist);
            }
        }
        
    }
    
    /**
     * Função para listar todas as inspeções
     */
    
    public void listInspection(){
        Inspection[] inspections = {inspection1, inspection2, inspection3, inspection4};
        for(Inspection insp : inspections){
            if(insp != null){
                System.out.println(insp);
            }
        }
    }

    /**
     * Função para listar todos os equipamentos
     * 
     * @param equipment
     * @param equipments 
     */
    
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
    
    /**
     * Função para listar todos os trabalhadores
     * 
     * @param employee 
     */

    private void listEmployee(Team employee) {
        Employee[] employees = employee.getEmployees();
        System.out.println("TRABALHADORES: ");
        for (Employee employeeList : employees) {
            if (employeeList != null) {   
                System.out.println(employeeList);
            }
        }
    }
    
    /**
     * Função para listar todas as equipas
     * 
     * @param team 
     */

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
    
    /**
     * Função para listar todos os constructionSites
     * 
     * @param constructionSite 
     */

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
    
    /**
     * Função para listar todos os eventos
     * @param event
     * @param constructionSite 
     */

    private void listEvents(EventManagerImpl event, String constructionSite) {
        Event[] events = event.getEvent(constructionSite);
        System.out.println("EVENTOS: ");
        for (Event evento : events) {
            if (evento != null) {             
                System.out.println(evento);
            }
        }
    }
    
    /**
     * Função para enviar todos os eventos para o mongoDb
     * 
     * @throws IOException
     * @throws InterruptedException 
     */

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
    
    /**
     * Função para receber todos os eventos do mongoDb
     * 
     * @throws IOException
     * @throws InterruptedException 
     */

    public void getReport() throws IOException, InterruptedException {
        InsuranceReporter report = new InsuranceReporter();
        String result = report.getEvents("xpto", "Grupo8");
        System.out.println(result);
    }
    
    /**
     * Função para eliminar todos os eventos do mongoDb
     * 
     * @throws IOException
     * @throws InterruptedException 
     */

    public void delReport() throws IOException, InterruptedException {
        InsuranceReporter report = new InsuranceReporter();
        String result = report.resetEvents("xpto", "Grupo8");
        System.out.println(result);
    }
    
    /**
     * Função para listar tudo organizadamente
     */

    public void listing() {
        listConstructionSites(csm);
    }

}
