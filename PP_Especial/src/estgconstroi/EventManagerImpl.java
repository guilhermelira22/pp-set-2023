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

import estgconstroi.enums.EventPriority;
import estgconstroi.exceptions.EventManagerException;
import exceptions.EventManagerExceptionImpl;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class EventManagerImpl implements EventManager {

    private Event[] events;
    private EventImpl[] eventos;
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
    public void reportEvent(Event event) throws EventManagerExceptionImpl {
        try {
            for (int i = 0; i < numberOfEvents; i++) {
                if (events[i] != null && events[i].equals(event)) {
                    throw new EventManagerExceptionImpl("O evento ja foi reportado.");
                }
            }

            for (int i = 0; i < events.length; i++) {
                if (events[i] == null) {
                    events[i] = event;
                    numberOfEvents++;
                    return;
                }
            }

        } catch (EventManagerExceptionImpl e) {
            throw e;
        }
    }

    @Override
    public void removeAllEvents() {
        events = new Event[events.length];
        numberOfEvents = 0;      
    }

    @Override
    public void removeEvent(Event event) throws EventManagerExceptionImpl {
        try{
            boolean found = false;
            
            for(int i=0; i<numberOfEvents; i++){
                if (events[i] != null && events[i].equals(event)) {
                    for (int j=i; j<numberOfEvents-1; j++) {
                        events[j] = events[j+1];
                    }
                    events[numberOfEvents-1] = null;
                    numberOfEvents--; 
                    found = true; 
                    break;
                }
            }
            if (!found){
                throw new EventManagerExceptionImpl("O evento nao existe");
            }
        }catch (EventManagerExceptionImpl e){
            throw e;
        }
    }

    @Override
    public Event[] getEvent(EventPriority ep) {
        Event[] result = new Event[numberOfEvents];
        int index = 0;
        
        for(Event eventos : events){
            if (eventos != null && eventos.getPriority() == ep) {
                result[index] = eventos;
                index++;
            }
        }
        return result;
    }

    @Override
    public Event[] getEvent(Class type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public EventImpl[] getEventType(String type, EventImpl[] eventosList ){
        EventImpl[] result = new EventImpl[numberOfEvents];
        int index = 0;
        
        for(EventImpl evento : eventosList){
            if(evento != null && evento.getEventType().equals(type)){
                result[index] = evento;
                index++;
            }
        }
        return result;
    }

    @Override
    public Event[] getEvent(LocalDate ld) {
        Event[] result = new Event[numberOfEvents];
        int index = 0;
        
        for(Event eventos : events){
            if(eventos != null && eventos.getDate() == ld){
                result[index] = eventos;
                index++;
            }
        }
        return result;
    }

    @Override
    public Event[] getEvent(LocalDate ld, LocalDate ld1) {
        Event[] result = new Event[numberOfEvents];
        int index = 0;

        for (Event event : events) {
            if (event != null && isDateInRange(event.getDate(), ld, ld1)) {
                result[index] = event;
                index++;
            }
        }

        Event[] filteredEvents = new Event[index];
        System.arraycopy(result, 0, filteredEvents, 0, index);

        return filteredEvents;
    }
    
    private boolean isDateInRange(LocalDate date, LocalDate startDate, LocalDate endDate) {
        return !date.isBefore(startDate) && !date.isAfter(endDate);
    }

    /**
     * Retorna os eventos de um certo constructionSite
     * 
     * @param constructionSite
     * @return 
     */
    
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
    
    /**
     * Retorna todos os eventos
     * 
     * @return 
     */

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

}