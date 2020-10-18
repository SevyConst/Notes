package model;

import java.util.List;
import java.util.UUID;

public class Tag implements Identified<UUID> {
    private static final long serialVersionUID = -195689212329377579L;

    private UUID id;
    private String name;
    private User user;
    private List<Note> notes;

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
