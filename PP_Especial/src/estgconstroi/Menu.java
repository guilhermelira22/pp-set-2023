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

import estgconstroi.exceptions.EventManagerException;
import estgconstroi.exceptions.TeamException;
import exceptions.ConstructionSiteExceptionImpl;
import exceptions.ConstructionSiteManagerExceptionImpl;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe que representa o menu principal
 * 
 * @author guilhermeLira
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    LoadData loadData = new LoadData();

    public void menuPrincipal() throws ConstructionSiteExceptionImpl, ConstructionSiteManagerExceptionImpl, TeamException, EventManagerException, IOException, InterruptedException {

        boolean exit = false;
        int option = 0;

        while (!exit) {

            System.out.println("1- Carregar dados");
            System.out.println("2- Listar Dados");
            System.out.println("3- Listar Inspecoes");
            System.out.println("4- Enviar Insurance Report");
            System.out.println("5- Obter dados da API Insurance Report");
            System.out.println("6- Apagar dados da API Insurance Report");
            System.out.println("0- Sair");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    loadData.data();
                    break;
                case 2:
                    loadData.listing();
                    break;
                case 3:
                    loadData.listInspection();
                    break;
                case 4:
                    loadData.sendReport();
                    break;
                case 5:
                    loadData.getReport();
                    break;
                case 6:
                    loadData.delReport();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcao invalida");

            }

        }

    }
}
