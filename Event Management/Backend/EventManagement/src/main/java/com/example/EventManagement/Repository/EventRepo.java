package com.example.EventManagement.Repository;

import com.example.EventManagement.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepo extends JpaRepository<Event,String> {

    List<Event> findAll();
}
