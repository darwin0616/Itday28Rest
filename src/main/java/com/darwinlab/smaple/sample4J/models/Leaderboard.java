package com.darwinlab.smaple.sample4J.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Leaderboard {

    @Id
    public ObjectId _id;

    public Float rank;
    public String player;
    public String team;
    public Float level;
    public Float score;
    public Float battle;

    public Leaderboard() {
    }

    public Leaderboard(Float rank, String player, String team, Float level, Float score, Float battle) {
        this.rank = rank;
        this.player = player;
        this.team = team;
        this.level = level;
        this.score = score;
        this.battle = battle;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Float getRank() {
        return rank;
    }

    public void setRank(Float rank) {
        this.rank = rank;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Float getLevel() {
        return level;
    }

    public void setLevel(Float level) {
        this.level = level;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getBattle() {
        return battle;
    }

    public void setBattle(Float battle) {
        this.battle = battle;
    }
}
