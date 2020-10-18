package dao.list;

import dao.TagDAO;
import dao.UserDAO;
import model.Tag;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TagDAOImpl extends AbstractDAO<Tag, UUID> implements TagDAO {
    public TagDAOImpl() { super(Tag.class, new ArrayList<>()); }

    @Override
    public List<Tag> findTags(String text, User user) {
        throw new UnsupportedOperationException("Not exists operation");
    }
}
