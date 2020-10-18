package service;

import model.Note;

import java.time.LocalDateTime;

public interface NoteService {
    void addNote(Note note);

    void editNote(Note note);

}
