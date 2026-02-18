package com.finestay.practice.journalrepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.finestay.practice.entity.Journalentry;

public interface Journalrepo extends MongoRepository<Journalentry, String> {

}
