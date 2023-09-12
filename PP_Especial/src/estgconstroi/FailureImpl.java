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

/**
 *
 * @author guilhermeLira
 */
public class FailureImpl extends IncidentImpl implements Failure{
    
    private Equipment equi;

    public FailureImpl(Equipment equi, String details, String message) {
        super(details, message);
        this.equi = equi;
    }

    @Override
    public Equipment getEquipment() {
        return equi;
    }
    
}
