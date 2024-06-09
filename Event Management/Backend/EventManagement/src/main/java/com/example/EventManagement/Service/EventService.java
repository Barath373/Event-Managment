package com.example.EventManagement.Service;

import com.example.EventManagement.Model.Event;
import com.example.EventManagement.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepo erepo;

    public String createevent(Event event) {
        System.out.println("EventS"+event);
        erepo.save(event);
       return "event created...";
    }

    public List<Event> Allevents() {
        return erepo.findAll();
    }
}
