/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

/**
 *
 * @author guilhermeLira
 */
public class IncidentImpl implements Incident{
    
    private String details;
    private String message;

    public IncidentImpl(String details, String message) {
        this.details = details;
        this.message = message;
    }

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public String getNotificationMessage() {
        return message;
    }
    
    @Override
    public String toString(){
        return "Message: " + getNotificationMessage() + ", Details: " + getDetails();
    }
    
}
