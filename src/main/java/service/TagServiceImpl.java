package service;

import dao.NoteDAO;
import dao.TagDAO;
import model.Tag;

import java.time.LocalDateTime;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TagServiceImpl implements TagService {

    private TagDAO tagDAO;

    public void addTag(Tag tag) {
        tagDAO.save(tag);
    }

    void setTag(TagDAO tagDAO) {
        this.tagDAO = tagDAO;
    }
}
