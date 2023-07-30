package com.darwinlab.smaple.sample4J.repositories;

import com.darwinlab.smaple.sample4J.models.Logtests;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogtestsRepository extends MongoRepository<Logtests, String> {
    Logtests findBy_id(ObjectId _id);
}
