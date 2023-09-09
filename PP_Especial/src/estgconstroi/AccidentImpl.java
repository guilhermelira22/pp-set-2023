/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

/**
 *
 * @author guilhermeLira
 */
public class AccidentImpl extends IncidentImpl implements Accident{
    
    private Employee emp;

    public AccidentImpl(Employee emp, String details, String message) {
        super(details, message);
        this.emp = emp;
    }
    
    @Override
    public Employee getEmployee() {
        return emp;
    }
    
}
