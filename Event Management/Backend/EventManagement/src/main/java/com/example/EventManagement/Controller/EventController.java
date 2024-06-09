package com.example.EventManagement.Controller;

import com.example.EventManagement.Model.Event;
import com.example.EventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/Createevent")
    public String createevent(@RequestBody Event event){
        System.out.println("EventC"+event);
        return eventService.createevent(event);
    }

    @GetMapping("/Allevents")
    public List<Event> ALlevents(){
        return eventService.Allevents();
    }

    @GetMapping("/event")
    public String event()
    {
        System.out.println("hii");
        return "event.html";
    }
    @GetMapping("/home")
    public String home()
    {
        System.out.println("hii");
        return "home.html";
    }


}
