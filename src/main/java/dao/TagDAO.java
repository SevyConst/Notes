package dao;

import model.Tag;
import model.User;

import java.util.List;
import java.util.UUID;

public interface TagDAO extends GenericDAO<Tag, UUID> {
    List<Tag> findTags(String text, User user);
}
