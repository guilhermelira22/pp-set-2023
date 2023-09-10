/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.enums.EmployeeType;
import estgconstroi.enums.EquipmentStatus;
import estgconstroi.enums.EquipmentType;
import estgconstroi.exceptions.TeamException;
import exceptions.ConstructionSiteExceptionImpl;
import exceptions.ConstructionSiteManagerExceptionImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author guilhermeLira
 */
public class Menu {
    
    Scanner sc = new Scanner(System.in); 
    LoadData loadData = new LoadData();
    
    
    public void menuPrincipal() throws ConstructionSiteExceptionImpl, ConstructionSiteManagerExceptionImpl, TeamException{
        
        boolean exit = false;
        int option = 0;
        
        while(!exit){
            
            System.out.println("1- Carregar dados");
            System.out.println("2- Listar Dados");
            System.out.println("3- Sair");
            
            option = sc.nextInt();
            
            switch(option){
                case 1: 
                    loadData.data();
                    break;
                case 2:
                    loadData.listing();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    
            }
            
        }
        
    }
    
    
    
    /*public void RegistoObra() throws ConstructionSiteExceptionImpl, ConstructionSiteManagerExceptionImpl, TeamException{
        
        boolean exit = false;
        EquipmentsImpls equips = null;
        ConstructionSiteManagerImpl consSiteManager = new ConstructionSiteManagerImpl(10);
        
        sc.nextLine();
        System.out.println("Insira o nome da obra: ");
        String consSName = sc.nextLine();
        System.out.println("Insira a localizacao da obra: ");
        String consSLocation = sc.nextLine();
        System.out.println("Permissao: ");
        String consSPermit = sc.nextLine();
        System.out.println("Insira a data de expiracao da permissao: (yyyy/MM/dd)");
        String consSPermitExpirationDateString = sc.nextLine();
        System.out.println("Insira a data de inicio da obra: ");
        String consSStartDateString = sc.nextLine();
        System.out.println("Insira a data de fim da obra: ");
        String consSEndDateString = sc.nextLine();
        System.out.println("Insira o responsavel pela obra: ");
        System.out.println("\tNome: ");
        String responsibleName = sc.nextLine();
        System.out.println("\tUuid: ");
        String responsibleUuid = sc.nextLine();
        System.out.println("Insira o numero maximo de equipamentos: ");
        int equiNumMaxOfEquipments = sc.nextInt();
        System.out.println("Insira os equipamentos para a obra: ");
        sc.nextLine();
        while (!exit) {
            sc.nextLine();
            System.out.println("\tNome do equipamento: ");
            String equiName = sc.nextLine();
            System.out.println("Escolha o tipo do equipamento: ");
            for (EquipmentType choice : EquipmentType.values()) {
                System.out.println(choice.ordinal() + ": " + choice);
            }
            int equiType = sc.nextInt();
            if (equiType >= 0 && equiType < EquipmentType.values().length) {
                             
                EquipmentImpl equip = new EquipmentImpl(equiName, EquipmentType.values()[equiType], EquipmentStatus.OPERATIVE);

                if (equips == null) {
                    equips = new EquipmentsImpls(equiNumMaxOfEquipments);
                }               
                equips.addEquipment(equip);
            } else {
                System.out.println("Escolha inválida.");
            }

            System.out.println("Quer inserir mais equipamentos? (y/n)");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                exit = true;
            }
        }
        
        System.out.println("Insira o numero maximo de equipas: ");
        int consSNumMaxOfTeams = sc.nextInt();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate consSPermitExpirationDate = LocalDate.parse(consSPermitExpirationDateString, formatter);
        LocalDate consSStartDate = LocalDate.parse(consSStartDateString, formatter);
        LocalDate consSEndDate = LocalDate.parse(consSEndDateString, formatter);
        
        EmployeeImpl employee = new EmployeeImpl(responsibleName, responsibleUuid, EmployeeType.MANAGER);
        ConstructionSiteImpl constructionSite = new  ConstructionSiteImpl(consSName, consSLocation, consSPermit, consSPermitExpirationDate, consSStartDate, consSEndDate, employee, consSNumMaxOfTeams, equips);
        consSiteManager.add(constructionSite);
        
        RegistoEquipas(equips, equiNumMaxOfEquipments, constructionSite);
        
    }
    
    public void RegistoEquipas(EquipmentsImpls equips, int equiNumMaxOfEquipments, ConstructionSiteImpl consSite) throws ConstructionSiteExceptionImpl, TeamException{
        
        boolean exit = false;
        EquipmentsImpls equipments = null;
        
        
        System.out.println("Adicionar equipas a obra");
        sc.nextLine();
        System.out.println("Nome da equipa: ");
        String teamName = sc.nextLine();
        System.out.println("Insira o lider de equipa: ");
        System.out.println("\tNome: ");
        String leaderName = sc.nextLine();
        System.out.println("\tUuid: ");
        String leaderUuid = sc.nextLine();
        System.out.println("Insira o numero maximo de trabalhadores: ");
        int teamNumMaxOfEmployees = sc.nextInt();
        System.out.println("Equipamentos disponiveis: ");
        Equipment[] equipamentos = equips.getEquipment();
        for (Equipment equipamento : equipamentos) {
            if (equipamento != null) {
                System.out.println(equipamento);
            }
        }
        System.out.println("Insira os equipamentos para a equipa: ");
        sc.nextLine();
        while(!exit){
            sc.nextLine();
            System.out.println("\tNome do equipamento: ");
            String equiName = sc.nextLine();
            System.out.println("Escolha o tipo do equipamento: ");
            for (EquipmentType choice : EquipmentType.values()) {
                System.out.println(choice.ordinal() + ": " + choice);
            }
            int equiType = sc.nextInt();
            if (equiType >= 0 && equiType < EquipmentType.values().length) {
                    EquipmentImpl equip = new EquipmentImpl(equiName, EquipmentType.values()[equiType], EquipmentStatus.OPERATIVE);

                    if (equipments == null) {
                        equipments = new EquipmentsImpls(equiNumMaxOfEquipments);
                    }               
                    equipments.addEquipment(equip);
                    
                    if (!EquipamentoDisponivel(equiName, equips)) {
                        System.out.println("Equipamento não está disponível");
                        equipments.removeEquipment(equip);
                    }
        
            } else {
                System.out.println("Escolha inválida.");
            }
            
            System.out.println("Quer inserir mais equipamentos? (y/n)");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                exit = true;
            }
        }
        
        EmployeeImpl employee = new EmployeeImpl(leaderName, leaderUuid, EmployeeType.TEAM_LEADER);
        TeamImpl team = new TeamImpl(teamName, employee, teamNumMaxOfEmployees, equipments);
        consSite.addTeam(team);
            
        RegistoTrabalhador(team, consSite, equips, equiNumMaxOfEquipments);
            
    }
    
    public void RegistoTrabalhador(Team team, ConstructionSiteImpl consSite, EquipmentsImpls equips, int equiNumMaxOfEquipments) throws TeamException, ConstructionSiteExceptionImpl{
        
        System.out.println("Adicionar trabalhadores a equipa: ");
        sc.nextLine();
        System.out.println("Nome: ");
        String workerName = sc.nextLine();
        System.out.println("Uuid: ");
        String workerUuid = sc.nextLine();
        
        EmployeeImpl employee = new EmployeeImpl(workerName, workerUuid, EmployeeType.WORKER);
        team.addEmployees(employee);
        
        System.out.println("Quer inserir mais trabalhadores? (y/n)");
            char choice = sc.next().charAt(0);
            if (choice == 'y') {
                RegistoTrabalhador(team, consSite, equips, equiNumMaxOfEquipments);
            }
        
        
        
    }
    
    private boolean EquipamentoDisponivel(String equipName, Equipments equips) {
        Equipment[] availableEquipments = equips.getEquipment();
        for (Equipment equipment : availableEquipments) {
            if (equipment != null && equipment.getName().equals(equipName)) {
                return true;
            }
        }
        return false;
    }*/
    
    public void Eventos(){
        
    }
    
}
