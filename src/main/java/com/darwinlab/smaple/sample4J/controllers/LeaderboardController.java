package com.darwinlab.smaple.sample4J.controllers;

import com.darwinlab.smaple.sample4J.models.Leaderboard;
import com.darwinlab.smaple.sample4J.repositories.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LeaderboardController {

    @Autowired
    private LeaderboardRepository repository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/leaderboard", method = RequestMethod.GET)
    public List<Leaderboard> getAll() {

        return repository.findAll();
    }
}
