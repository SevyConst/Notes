package service;

import dao.NoteDAO;
import dao.UserDAO;
import model.Note;
import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class NoteServiceImpl implements NoteService {
    private static final Logger log = LogManager.getLogger(UserServiceImpl.class.getName());

    private NoteDAO noteDAO;


    public NoteServiceImpl(NoteDAO noteDAO) {
        log.info("createService");
        this.noteDAO = noteDAO;
    }

    @Override
    public void addNote(Note note) {
        log.info("now: " + LocalDateTime.now() +" NoteService: " + this.toString());
        noteDAO.save(note);

    }

    @Override
    public void editNote(Note note) {
        log.info("now: " + LocalDateTime.now() + " NoteService: " + this.toString());
        noteDAO.update(note);
    }
}
