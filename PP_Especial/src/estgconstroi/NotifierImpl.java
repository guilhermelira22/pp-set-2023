/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

/**
 *
 * @author guilhermeLira
 */
public class NotifierImpl implements Notifier{
    private String notificationMode;

    public NotifierImpl(String notificationMode) {
        this.notificationMode = notificationMode;
    }
    
    
    @Override
    public boolean notify(Event event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
