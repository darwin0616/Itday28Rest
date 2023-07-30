package com.darwinlab.smaple.sample4J.controllers;

import com.darwinlab.smaple.sample4J.models.Logtests;
import com.darwinlab.smaple.sample4J.repositories.LogtestsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class LogtestsController {
    @Autowired
    private LogtestsRepository repository;

    @CrossOrigin
    @RequestMapping(value = "/logtests", method = RequestMethod.GET)
    public List<Logtests> getAll() {
        return repository.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/logtests", method = RequestMethod.POST)
    public Logtests createPet(@Valid @RequestBody Logtests logtests) {
        logtests.set_id(ObjectId.get());
        repository.save(logtests);
        return logtests;
    }
}
