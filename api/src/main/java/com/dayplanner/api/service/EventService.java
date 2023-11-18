package com.dayplanner.api.service;

import com.dayplanner.api.data.Event;
import com.dayplanner.api.repository.IEventRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventService {
    private final IEventRepository eventRepository;

    @Autowired
    public EventService(IEventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public Event getEvent(UUID id) {
        return eventRepository.findById(id).get();
    }

    public void addEvent(Event e) {
        eventRepository.save(e);
    }
}
