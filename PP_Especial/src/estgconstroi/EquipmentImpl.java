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

import estgconstroi.enums.EquipmentStatus;
import estgconstroi.enums.EquipmentType;

/**
 *
 * @author guilhermeLira
 */
public class EquipmentImpl implements Equipment{
    
    private String name;
    private EquipmentType type;
    private EquipmentStatus status;

    public EquipmentImpl(String name, EquipmentType type, EquipmentStatus status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EquipmentType getType() {
        return type;
    }

    @Override
    public EquipmentStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(EquipmentStatus es) {
        this.status = es;
    }
    
    @Override
    public String toString(){
        return "Name: " + getName() + ", Type: " + getType() + ", Status: " + getStatus();
    }
    
}
