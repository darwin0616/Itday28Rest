package com.darwinlab.smaple.sample4J.repositories;

import com.darwinlab.smaple.sample4J.models.Leaderboard;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeaderboardRepository extends MongoRepository<Leaderboard, String> {
    Leaderboard findBy_id(ObjectId _id);
}
