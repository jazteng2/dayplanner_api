package com.dayplanner.api.controller;

import com.dayplanner.api.data.Event;
import com.dayplanner.api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    @GetMapping("/{id}")
    public Event getEvent(@PathVariable("id") UUID id) {
        return eventService.getEvent(id);
    }

    @PostMapping
    public void addEvent(@RequestBody Event e) {
        eventService.addEvent(e);
    }

}
