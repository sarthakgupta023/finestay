package com.finestay.practice.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finestay.practice.journalrepo.Journalrepo;

@RestController
@RequestMapping("/journal")
public class Journalnetrycontroller {
    @Autowired
    private Journalrepo journalrepo;

    @GetMapping
    public List<Journalentry> getall() {
        return journalrepo.findAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody Journalentry myentry) {
        journalrepo.save(myentry);
        return true;
    }

    @DeleteMapping("id/{myid}")
    public boolean get(@PathVariable String myid) {
        journalrepo.deleteById(myid);
        return true;
    }

}
