package com.darwinlab.smaple.sample4J.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Logtests {

    @Id
    public ObjectId _id;

    public String who;
    public String logtime;

    public Logtests() {
    }

    public Logtests(ObjectId _id, String who, String logtime) {
        this._id = _id;
        this.who = who;
        this.logtime = logtime;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }
}
