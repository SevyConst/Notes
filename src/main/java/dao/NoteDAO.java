package dao;

import model.Note;
import model.Tag;
import model.User;

import java.util.List;
import java.util.UUID;

public interface NoteDAO extends GenericDAO<Note, UUID> {
    List<Note> findNotesByText(String text, User user);
    List<Note> findNotesByTag(Tag tag, User user);
}
