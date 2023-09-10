/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.enums.EventPriority;
import estgconstroi.exceptions.EventManagerException;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class EventManagerImpl implements EventManager {

    private Event[] events;
    private int numberOfEvents = 0;

    public EventManagerImpl(int numMaxOfEvents) {
        this.events = new Event[numMaxOfEvents];
        numberOfEvents = 0;
    }

    @Override
    public void addNotifier(Notifier ntfr) throws EventManagerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeNotifier(Notifier ntfr) throws EventManagerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportEvent(Event event) throws EventManagerException {
        try {
            for (int i = 0; i < numberOfEvents; i++) {
                if (events[i] != null && events[i].equals(event)) {
                    throw new EventManagerException("O evento ja foi reportado.");
                }
            }

            for (int i = 0; i < events.length; i++) {
                if (events[i] == null) {
                    events[i] = event;
                    numberOfEvents++;
                    return;
                }
            }

        } catch (EventManagerException e) {
            throw e;
        }
    }

    @Override
    public void removeAllEvents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeEvent(Event event) throws EventManagerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Event[] getEvent(EventPriority ep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Event[] getEvent(Class type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Event[] getEvent(LocalDate ld) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Event[] getEvent(LocalDate ld, LocalDate ld1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Event[] getEvent(String constructionSite) {
        Event[] result = new Event[numberOfEvents];
        int index = 0;

        for (Event event : events) {
            if (event != null && event.getConstructionSite().getName().equals(constructionSite)) {
                result[index] = event;
                index++;
            }
        }
        return result;
    }

    public Event[] getEvent() {
        Event[] result = new Event[numberOfEvents];
        int index = 0;

        for (Event event : events) {
            if (event != null) {
                result[index] = event;
                index++;
            }
        }
        return result;
    }

    /* public void sendReport(){
        Event[] result = new Event[numberOfEvents];
        int index = 0;
        
        for(Event event : events){
            if (event != null) {
                String jsonData = 
                        "{ \"groupname\":\"Grupo8\","
                        + "\"groupkey\":\"xpto\","
                        + "\"event\": {"
                        + "\"uuid\": " + event.getUuid()+","
                        + "\"data\": " + event.getDate()+","
                        + "\"priority\": " + event.getPriority() + ","
                        + "\"eventtype\": " + event.
                        + "\"title\": "Avaria de máquina",
                        + "\"constructionsitename\": "cs1",
                        + "\"details\": "...",
                        + "\"employeename\": "João"
                        + "}"
                        + "}";
            }
        }
    }*/
}
