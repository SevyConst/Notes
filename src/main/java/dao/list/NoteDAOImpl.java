package dao.list;

import dao.NoteDAO;
import model.Note;
import model.Tag;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NoteDAOImpl extends AbstractDAO<Note, UUID> implements NoteDAO {

    public NoteDAOImpl() {
        super(Note.class, new ArrayList<>());
    }

    @Override
    public List<Note> findNotesByText(String text, User user) {
        throw new UnsupportedOperationException("Not exists operation");
    }

    @Override
    public List<Note> findNotesByTag(Tag tag, User user) {
        throw new UnsupportedOperationException("Not exists operation");
    }
}
