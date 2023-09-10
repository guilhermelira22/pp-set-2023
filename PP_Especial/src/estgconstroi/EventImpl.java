/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.enums.EventPriority;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class EventImpl extends Event{
    
    private String uuid;
    private LocalDate date;
    private EventPriority priority;
    private String title;
    private Employee reporter;
    private ConstructionSite constructionSite;

    public EventImpl(EventPriority priority, String title, Employee reporter, ConstructionSite constructionSite) {
        super(priority, title, reporter, constructionSite);
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public EventPriority getPriority() {
        return priority;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Employee getReporter() {
        return reporter;
    }

    @Override
    public ConstructionSite getConstructionSite() {
        return constructionSite;
    }

    @Override
    public String getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNotificationMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
