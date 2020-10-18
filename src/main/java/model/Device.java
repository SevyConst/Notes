package model;

import java.sql.Time;
import java.util.UUID;

public class Device implements Identified<UUID> {

    private static final long serialVersionUID = 909862732695726244L;

    private UUID id;
    private User user;
    private Time time;

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
