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

import estgconstroi.Employee;
import estgconstroi.enums.EmployeeType;

/**
 *
 * @author guilhermeLira
 */
public class EmployeeImpl extends Employee{
    
    private String name;
    private String uuid;
    private EmployeeType type;

    public EmployeeImpl(String name, String uuid, EmployeeType type) {
        this.name = name;
        this.uuid = uuid;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EmployeeType getType() {
        return type;
    }

    @Override
    public void setType(EmployeeType et) {
        this.type = et;
    }
    
    @Override
    public String getUUID() {
        return uuid;
    }
    
    @Override
    public String toString(){
        return "UUID: " + getUUID() + ", Name: " + getName() + ", Type: " + getType();
    }
    
}
