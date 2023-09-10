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
public class EventImpl extends Event {

    private String uuid;
    private LocalDate date;
    private String details;
    private String message;
    private Employee employee;
    private Equipment equipment;
    private String eventType;

    public EventImpl(EventPriority priority, String title, Employee reporter, ConstructionSite constructionSite, String details, String message, String uuid, LocalDate date) {
        super(priority, title, reporter, constructionSite);
        this.uuid = uuid;
        this.date = date;
        this.details = details;
        this.message = message;
        this.eventType = "Incident";
    }

    public EventImpl(EventPriority priority, String title, Employee reporter, ConstructionSite constructionSite, String details, String message, String uuid, LocalDate date, Employee employee) {
        super(priority, title, reporter, constructionSite);
        this.uuid = uuid;
        this.date = date;
        this.details = details;
        this.message = message;
        this.employee = employee;
        this.eventType = "Accident";
    }

    public EventImpl(EventPriority priority, String title, Employee reporter, ConstructionSite constructionSite, String details, String message, String uuid, LocalDate date, Equipment equipment) {
        super(priority, title, reporter, constructionSite);
        this.uuid = uuid;
        this.date = date;
        this.details = details;
        this.message = message;
        this.equipment = equipment;
        this.eventType = "Failure";
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public String getEventType() {
        return eventType;
    }

    @Override
    public String getUuid() {
        return uuid;
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
    public String toString() {
        /* return "Construction Site: "
                + getConstructionSite()
                + "\n Reporter: "
                + getReporter()
                + "\n Date: "
                + getDate()
                + "\n Events uuid: "
                + getUuid()
                + "\n Priority: "
                + getPriority()
                + "\n Title: "
                + getTitle()
                + "\n Notification Message: "
                + getNotificationMessage()
                + "\n Details: "
                + getDetails()
                + "\n Event Type: "
                + getEventType(); */
        return "{ \"groupname\":\"Grupo8\","
                + "\"groupkey\":\"xpto\","
                + "\"event\": {"
                + "\"uuid\": \"" + getUuid() + "\","
                + "\"data\": \"" + getDate() + "\","
                + "\"priority\": \"" + getPriority() + "\","
                + "\"eventtype\": \"" + getEventType() + "\","
                + "\"title\": \"" + getTitle() + "\","
                + "\"constructionsitename\": \"" + getConstructionSite().getName() + "\","
                + "\"details\": \"" + getDetails() + "\","
                + "\"employeename\": \"" + getReporter().getName() + "\""
                + "}"
                + "}";
    }

}
