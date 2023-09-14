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

    private EmployeeImpl emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20, emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30, emp31, emp32, emp33, emp34, emp35, emp36, emp37, emp38, emp39, emp40, emp41, emp42, emp43, emp44, emp45, emp46, emp47, emp48, emp49, emp50, emp51, emp52;
    private EquipmentImpl equi1, equi2, equi3, equi4, equi5, equi6, equi7, equi8, equi9, equi10, equi11, equi12, equi13, equi14, equi15, equi16, equi17, equi18, equi19, equi20, equi21, equi22, equi23, equi24, equi25, equi26, equi27, equi28, equi29, equi30, equi31, equi32, equi33, equi34, equi35, equi36, equi37, equi38, equi39, equi40;
    private EquipmentsImpls equips, equips2, equips3, equips4, equips5, equips6, equips7, equips8, equips9, equips10, equips11, equips12, equips13, equips14, equips15, equips16, equips17, equips18, equips19, equips20;
    private TeamImpl team, team2, team3, team4, team5, team6, team7, team8, team9, team10, team11, team12, team13, team14, team15, team16;
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

        emp1 = new EmployeeImpl("Lira", "1", EmployeeType.TEAM_LEADER);
        emp2 = new EmployeeImpl("Fernando", "2", EmployeeType.TEAM_LEADER);
        emp3 = new EmployeeImpl("Filipe", "3", EmployeeType.TEAM_LEADER);
        emp4 = new EmployeeImpl("Tiago", "4", EmployeeType.TEAM_LEADER);
        
        emp11 = new EmployeeImpl("Diogo", "5", EmployeeType.TEAM_LEADER);
        emp12 = new EmployeeImpl("Martim", "6", EmployeeType.TEAM_LEADER);
        emp13 = new EmployeeImpl("Afonso", "7", EmployeeType.TEAM_LEADER);
        emp14 = new EmployeeImpl("Santiago", "8", EmployeeType.TEAM_LEADER);
        
        emp15 = new EmployeeImpl("Francisco", "9", EmployeeType.TEAM_LEADER);
        emp16 = new EmployeeImpl("Jorge", "10", EmployeeType.TEAM_LEADER);
        emp17 = new EmployeeImpl("Miguel", "11", EmployeeType.TEAM_LEADER);
        emp18 = new EmployeeImpl("Ricardo", "12", EmployeeType.TEAM_LEADER);
        
        emp19 = new EmployeeImpl("Ruben", "13", EmployeeType.TEAM_LEADER);
        emp20 = new EmployeeImpl("Bernardo", "14", EmployeeType.TEAM_LEADER);
        emp21 = new EmployeeImpl("Marco", "15", EmployeeType.TEAM_LEADER);
        emp22 = new EmployeeImpl("Rafael", "16", EmployeeType.TEAM_LEADER);
        
        emp5 = new EmployeeImpl("Joao", "17", EmployeeType.MANAGER);
        emp6 = new EmployeeImpl("Joaquim", "18", EmployeeType.MANAGER);
        emp7 = new EmployeeImpl("Hugo", "19", EmployeeType.MANAGER);
        emp8 = new EmployeeImpl("Roberto", "20", EmployeeType.MANAGER);
        
        emp9 = new EmployeeImpl("Paulo", "21", EmployeeType.WORKER);
        emp10 = new EmployeeImpl("Rodrigo", "22", EmployeeType.WORKER);
        
        emp23 = new EmployeeImpl("Ronaldo", "23", EmployeeType.WORKER);
        emp24 = new EmployeeImpl("Sergio", "24", EmployeeType.WORKER);
        
        emp25 = new EmployeeImpl("Tomas", "25", EmployeeType.WORKER);
        emp26 = new EmployeeImpl("Helder", "26", EmployeeType.WORKER);
        
        emp27 = new EmployeeImpl("Henrique", "27", EmployeeType.WORKER);
        emp28 = new EmployeeImpl("Eusebio", "28", EmployeeType.WORKER);
        
        emp29 = new EmployeeImpl("Mateus", "29", EmployeeType.WORKER);
        emp30 = new EmployeeImpl("Nuno", "30", EmployeeType.WORKER);
        
        emp31 = new EmployeeImpl("Guilherme", "31", EmployeeType.WORKER);
        emp32 = new EmployeeImpl("Domingos", "32", EmployeeType.WORKER);
        
        emp33 = new EmployeeImpl("Rogerio", "33", EmployeeType.WORKER);
        emp34 = new EmployeeImpl("Frederico", "34", EmployeeType.WORKER);
        
        emp35 = new EmployeeImpl("Agostinho", "35", EmployeeType.WORKER);
        emp36 = new EmployeeImpl("Dinis", "36", EmployeeType.WORKER);
        
        emp37 = new EmployeeImpl("Duarte", "37", EmployeeType.WORKER);
        emp38 = new EmployeeImpl("Goncalo", "38", EmployeeType.WORKER);
        
        emp39 = new EmployeeImpl("Pedro", "39", EmployeeType.WORKER);
        emp40 = new EmployeeImpl("Antonio", "40", EmployeeType.WORKER);
        
        emp41 = new EmployeeImpl("Carlos", "41", EmployeeType.WORKER);
        emp42 = new EmployeeImpl("Jose", "42", EmployeeType.WORKER);
        
        emp43 = new EmployeeImpl("Paulo", "43", EmployeeType.WORKER);
        emp44 = new EmployeeImpl("Luis", "44", EmployeeType.WORKER);
        
        emp45 = new EmployeeImpl("Bruno", "45", EmployeeType.WORKER);
        emp46 = new EmployeeImpl("Leonardo", "46", EmployeeType.WORKER);
        
        emp47 = new EmployeeImpl("Alexandre", "47", EmployeeType.WORKER);
        emp48 = new EmployeeImpl("Samuel", "48", EmployeeType.WORKER);
        
        emp49 = new EmployeeImpl("Xavier", "49", EmployeeType.WORKER);
        emp50 = new EmployeeImpl("Benjamin", "50", EmployeeType.WORKER);
        
        emp51 = new EmployeeImpl("Gabriel", "51", EmployeeType.WORKER);
        emp52 = new EmployeeImpl("Lúcio", "52", EmployeeType.WORKER);       

        equi1 = new EquipmentImpl("Escavadora", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi2 = new EquipmentImpl("Martelo", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);
        equi3 = new EquipmentImpl("Capacete", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi4 = new EquipmentImpl("Colete", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi5 = new EquipmentImpl("Chave de fendas", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi6 = new EquipmentImpl("Papel", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi7 = new EquipmentImpl("Serra eletrica", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi8 = new EquipmentImpl("Tijolo", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi9 = new EquipmentImpl("Trator", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi10 = new EquipmentImpl("Guindastes", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi11 = new EquipmentImpl("Betoneiras", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi12 = new EquipmentImpl("Compactadores", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi13 = new EquipmentImpl("Grupos geradores", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi14 = new EquipmentImpl("Plataformas elevatórias", EquipmentType.TRANSPORT, EquipmentStatus.OPERATIVE);
        equi15 = new EquipmentImpl("Caminhões basculantes", EquipmentType.TRANSPORT, EquipmentStatus.OPERATIVE);
        equi16 = new EquipmentImpl("Compactadoras de solo", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi17 = new EquipmentImpl("Bombas de concreto", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi18 = new EquipmentImpl("Escoras metálicas", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);
        equi19 = new EquipmentImpl("Niveladoras de asfalto", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi20 = new EquipmentImpl("Escadas de andaime", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi21 = new EquipmentImpl("Detectores de gás", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi22 = new EquipmentImpl("Alicate", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);
        equi23 = new EquipmentImpl("Rolo compactador vibratório", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi24 = new EquipmentImpl("Empilhadeiras", EquipmentType.TRANSPORT, EquipmentStatus.OPERATIVE);
        equi25 = new EquipmentImpl("Perfuradoras de solo", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi26 = new EquipmentImpl("Geradores de soldagem", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi27 = new EquipmentImpl("Placas vibratórias", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi28 = new EquipmentImpl("Lavadoras de pressão", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi29 = new EquipmentImpl("Bombas de água submersíveis", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi30 = new EquipmentImpl("Carros de transporte de materiais", EquipmentType.TRANSPORT, EquipmentStatus.OPERATIVE);
        equi31 = new EquipmentImpl("Sistemas de escoramento", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);
        equi32 = new EquipmentImpl("Detectores de metais", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);
        equi33 = new EquipmentImpl("Bombas de drenagem", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi34 = new EquipmentImpl("Cortadoras de concreto", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi35 = new EquipmentImpl("Martelos pneumáticos de demolição", EquipmentType.TOOLS, EquipmentStatus.OPERATIVE);
        equi36 = new EquipmentImpl("Equipamentos de escavação a vácuo", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi37 = new EquipmentImpl("Serras de concreto com fio diamantado", EquipmentType.OTHER, EquipmentStatus.OPERATIVE);
        equi38 = new EquipmentImpl("Carregadores frontais", EquipmentType.TRANSPORT, EquipmentStatus.OPERATIVE);
        equi39 = new EquipmentImpl("Varredoras de rua", EquipmentType.HEAVY_DUTY, EquipmentStatus.OPERATIVE);
        equi40 = new EquipmentImpl("Misturadores de argamassa", EquipmentType.EQUIPMENT, EquipmentStatus.OPERATIVE);

        equips = new EquipmentsImpls(10);
        equips2 = new EquipmentsImpls(10);
        equips3 = new EquipmentsImpls(10);
        equips4 = new EquipmentsImpls(10);
        equips5 = new EquipmentsImpls(10);
        equips6 = new EquipmentsImpls(10);
        equips7 = new EquipmentsImpls(10);
        equips8 = new EquipmentsImpls(10);
        equips9 = new EquipmentsImpls(10);
        equips10 = new EquipmentsImpls(10);
        equips11 = new EquipmentsImpls(10);
        equips12 = new EquipmentsImpls(10);
        equips13 = new EquipmentsImpls(10);
        equips14 = new EquipmentsImpls(10);
        equips15 = new EquipmentsImpls(10);
        equips16 = new EquipmentsImpls(10);
        equips17 = new EquipmentsImpls(10);
        equips18 = new EquipmentsImpls(10);
        equips19 = new EquipmentsImpls(10);
        equips20 = new EquipmentsImpls(10);

        equips.addEquipment(equi1);
        equips.addEquipment(equi2);
        
        equips2.addEquipment(equi3);
        equips2.addEquipment(equi4);
        
        equips3.addEquipment(equi5);
        equips3.addEquipment(equi6);
        
        equips4.addEquipment(equi7);
        equips4.addEquipment(equi8);
        
        equips5.addEquipment(equi9);
        equips5.addEquipment(equi10);
        
        equips6.addEquipment(equi11);
        equips6.addEquipment(equi12);
        
        equips7.addEquipment(equi13);
        equips7.addEquipment(equi14);
        
        equips8.addEquipment(equi15);
        equips8.addEquipment(equi16);
        
        equips9.addEquipment(equi17);
        equips9.addEquipment(equi18);
        
        equips10.addEquipment(equi19);
        equips10.addEquipment(equi20);
        
        equips11.addEquipment(equi21);
        equips11.addEquipment(equi22);
        
        equips12.addEquipment(equi23);
        equips12.addEquipment(equi24);
        
        equips13.addEquipment(equi25);
        equips13.addEquipment(equi26);
        
        equips14.addEquipment(equi27);
        equips14.addEquipment(equi28);
        
        equips15.addEquipment(equi29);
        equips15.addEquipment(equi30);
        
        equips16.addEquipment(equi31);
        equips16.addEquipment(equi32);
        
        equips17.addEquipment(equi33);
        equips17.addEquipment(equi34);
        
        equips18.addEquipment(equi35);
        equips18.addEquipment(equi36);
        
        equips19.addEquipment(equi37);
        equips19.addEquipment(equi38);
        
        equips20.addEquipment(equi39);
        equips20.addEquipment(equi40);
        
        TeamImpl[] teams = new TeamImpl[20];
        
        team = new TeamImpl("CITELUM GROUPE EDF", emp1, 10, equips, teams); 
        teams[0] = team;
        team2 = new TeamImpl("CIVILPROJ ", emp2, 10, equips2, teams);
        teams[1] = team2;
        team3 = new TeamImpl("CLAROS ", emp3, 10, equips3, teams);
        teams[2] = team3;
        team4 = new TeamImpl("CLEANWAVE ", emp4, 10, equips4, teams);
        teams[3] = team4;
        
        team5 = new TeamImpl("COATER ", emp11, 10, equips5, teams); 
        teams[4] = team5;
        team6 = new TeamImpl("COMPACO ", emp12, 10, equips6, teams);
        teams[5] = team6;
        team7 = new TeamImpl("CONCRETE ", emp13, 10, equips7, teams);
        teams[6] = team7;
        team8 = new TeamImpl("CONCRETIZE CONSTRUTORA", emp14, 10, equips8, teams);
        teams[7] = team8;
        
        team9 = new TeamImpl("CONEXO ", emp15, 10, equips9, teams); 
        teams[8] = team9;
        team10 = new TeamImpl("CONSTRAL ", emp16, 10, equips10, teams);
        teams[9] = team9;
        team11 = new TeamImpl("CONSTRESA LTDA", emp17, 10, equips11, teams);
        teams[10] = team11;
        team12 = new TeamImpl("CONSTRUART ", emp18, 10, equips12, teams);
        teams[11] = team12;
        
        team13 = new TeamImpl("CONSTRUARTE ", emp19, 10, equips13, teams); 
        teams[12] = team13;
        team14 = new TeamImpl("CONSTRUTIVA ", emp20, 10, equips14, teams);
        teams[13] = team14;
        team15 = new TeamImpl("CONSTRUTORA VALECAM", emp21, 10, equips15, teams);
        teams[14] = team15;
        team16 = new TeamImpl("CONSTRUTORA VALLE", emp22, 10, equips16, teams);
        teams[15] = team16;

        team.addEmployees(emp9);
        team.addEmployees(emp10);
        
        team2.addEmployees(emp23);
        team2.addEmployees(emp24);
        
        team3.addEmployees(emp25);
        team3.addEmployees(emp26);
        
        team4.addEmployees(emp27);
        team4.addEmployees(emp28);
        
        team5.addEmployees(emp29);
        team5.addEmployees(emp30);
        
        team6.addEmployees(emp31);
        team6.addEmployees(emp32);
        
        team7.addEmployees(emp33);
        team7.addEmployees(emp34);
        
        team8.addEmployees(emp35);
        team8.addEmployees(emp36);
        
        team9.addEmployees(emp37);
        team9.addEmployees(emp38);
        
        team10.addEmployees(emp39);
        team10.addEmployees(emp40);
        
        team11.addEmployees(emp41);
        team11.addEmployees(emp42);
        
        team12.addEmployees(emp43);
        team12.addEmployees(emp44);
        
        team13.addEmployees(emp45);
        team13.addEmployees(emp46);
        
        team14.addEmployees(emp47);
        team14.addEmployees(emp48);
        
        team15.addEmployees(emp49);
        team15.addEmployees(emp50);
        
        team16.addEmployees(emp51);
        team16.addEmployees(emp52);
        
        csm = new ConstructionSiteManagerImpl(10);
        
        cons = new ConstructionSiteImpl("Projeto1", "Penafiel", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp5, 4, equips17, csm);
        csm.add(cons);
        cons2 = new ConstructionSiteImpl("Projeto2", "Gaia", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp6, 4, equips18, csm);
        csm.add(cons2);
        cons3 = new ConstructionSiteImpl("Projeto3", "Vila mea", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp7, 4, equips19, csm);
        csm.add(cons3);
        cons4 = new ConstructionSiteImpl("Projeto4", "Felgueiras", "Sim", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 30), emp8, 4, equips20, csm);
        csm.add(cons4);

        cons.addTeam(team);
        cons.addTeam(team2);
        cons.addTeam(team3);
        cons.addTeam(team4);
        
        cons2.addTeam(team5);
        cons2.addTeam(team6);
        cons2.addTeam(team7);
        cons2.addTeam(team8);
        
        cons3.addTeam(team9);
        cons3.addTeam(team10);
        cons3.addTeam(team11);
        cons3.addTeam(team12);
        
        cons4.addTeam(team13);
        cons4.addTeam(team14);
        cons4.addTeam(team15);
        cons4.addTeam(team16); 

        EventImpl[] eventoslista = new EventImpl[10];
        event1 = new EventImpl(EventPriority.HIGH, "Avaria", emp10, cons, "Escavadora caiu", "Escavadora avariou", "qwerty", LocalDate.of(2023, 9, 20));
        eventoslista[0] = event1;
        event2 = new EventImpl(EventPriority.LOW, "Perda de material", emp31, cons2, "Trabalhador perdeu o martelo", "Martelo perdido", "abcdef", LocalDate.of(2023, 9, 22), emp32);
        eventoslista[1] = event2;
        event3 = new EventImpl(EventPriority.NORMAL, "Material partiu", emp37, cons3, "Escoras metálicas cairam e partiram", "Escoras metálicas partiram", "yuiop", LocalDate.of(2023, 9, 23), equi18);
        eventoslista[2] = event3;
        event4 = new EventImpl(EventPriority.NORMAL, "Trabalhador e maquina", emp44, cons3, "Trabalhador avariou maquina", "Maquina avariada", "asdfg", LocalDate.of(2023, 9, 26), emp43, equi24);
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
             
        ConstructionSite consSite[] = csm.getConstructionSites();
        for(ConstructionSite consSitee : consSite){
            if(consSitee != null){
                if(consSitee.isValid() == false){
                    throw new IllegalArgumentException("Obra invalida!");
                }
            }
            
        }
        
        if(csm.isValid() == false){
            throw new IllegalArgumentException("Obra invalida!");
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
    
    private void listEquipments(Equipments equipments) {
        Equipment[] equips = equipments.getEquipment();
        System.out.println("EQUIPAMENTOS: ");
        
        for(Equipment eqpmt : equips){
            if (eqpmt != null) {  
                System.out.println(eqpmt);
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
        Equipment[] equipamentos = team.getEquipments().getEquipment();
        System.out.println("EQUIPAMENTOS: ");
        for (Equipment equipamento : equipamentos) {
            if (equipamento != null) {  
                System.out.println(equipamento);
            }
        }
        System.out.println("EQUIPAS: ");
        for (Team equipa : teams) {
            if (equipa != null) {
                System.out.println(equipa);
                listEmployee(equipa);
                listEquipments(equipa.getEquipments());
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
     * Função para listar tudo 
     */

    public void listing() {
        listConstructionSites(csm);
    }

}
