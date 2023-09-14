/*
* Nome: <Guilherme Fonseca Lira de Meireles>
* Número: <8210415>
* Turma: <LSIRCT1>
*
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_especial;

import estgconstroi.Menu;
import estgconstroi.exceptions.ConstructionSiteException;
import estgconstroi.exceptions.EventManagerException;
import estgconstroi.exceptions.TeamException;
import exceptions.ConstructionSiteExceptionImpl;
import exceptions.ConstructionSiteManagerExceptionImpl;
import exceptions.TeamExceptionImpl;
import java.io.IOException;

/**
 *
 * @author guilhermeLira
 */
public class PP_Especial {

    /**
     * @param args the command line arguments
     * @throws exceptions.ConstructionSiteExceptionImpl
     * @throws exceptions.TeamExceptionImpl
     * @throws estgconstroi.exceptions.EventManagerException
     * @throws estgconstroi.exceptions.ConstructionSiteException
     * @throws exceptions.ConstructionSiteManagerExceptionImpl
     * @throws estgconstroi.exceptions.TeamException
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws ConstructionSiteExceptionImpl, TeamExceptionImpl, TeamException, ConstructionSiteException, ConstructionSiteManagerExceptionImpl, EventManagerException, IOException, InterruptedException {    
        
        Menu menu = new Menu();
        menu.menuPrincipal();
             
    }
    
}
