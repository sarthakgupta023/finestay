package com.finestay.practice.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class Journalnetrycontroller {
    private Map<Long, journalentry> journalentries = new HashMap<>();

    @GetMapping
    public List<journalentry> getall() {
        return new ArrayList<>(journalentries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody journalentry myentry) {
        journalentries.put(myentry.getId(), myentry);
        return true;
    }

    @GetMapping("id/{myid}")
    public journalentry getparticular(@PathVariable Long myid) {
        return journalentries.get(myid);
    }

    @PutMapping
    public boolean putJournalentry(@RequestBody journalentry myentry) {
        Long id = myentry.getId();
        journalentries.put(id, myentry);
        return true;
    }

    @DeleteMapping("id/{myid}")
    public String deletejournalentry(@PathVariable Long myid) {
        journalentries.remove(myid);
        return "object deleted";
    }

}
