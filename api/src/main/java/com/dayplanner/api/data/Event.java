package com.dayplanner.api.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table( name = "events")
public class Event {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "event_id")
    private UUID id;

    @Column( name = "title" )
    private String title;

    @Column( name = "event_date" )
    private LocalDate event_date;

    @Column( name = "start_time" )
    private LocalDateTime start_time;

    @Column( name = "end_time" )
    private LocalDateTime end_time;

    public Event() {
    }

    public Event(UUID id, String title, LocalDate event_date, LocalDateTime start_time, LocalDateTime end_time) {
        this.id = id;
        this.title = title;
        this.event_date = event_date;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEvent_date() {
        return event_date;
    }

    public void setEvent_date(LocalDate event_date) {
        this.event_date = event_date;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public LocalDateTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalDateTime end_time) {
        this.end_time = end_time;
    }
}
