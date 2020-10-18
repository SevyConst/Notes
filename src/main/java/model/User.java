package model;

import java.util.List;
import java.util.Set;
import java.util.UUID;


public class User implements Identified<UUID> {

    private static final long serialVersionUID = -7931737332645464539L;

    private UUID id;
    private String password;
    private String email;
    private List<Note> notes;
    private List<Device> devices;


    public User() {
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}

