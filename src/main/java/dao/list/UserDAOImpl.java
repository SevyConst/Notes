package dao.list;

import dao.UserDAO;
import model.User;

import java.util.ArrayList;
import java.util.UUID;

public class UserDAOImpl extends AbstractDAO<User, UUID> implements UserDAO {

    public UserDAOImpl() {
        super(User.class, new ArrayList<>());
    }

    @Override
    public boolean emailExist(String email) {
        throw new UnsupportedOperationException("Not exists operation");
    }

    @Override
    public User findUserByEmail(String name) {
        throw new UnsupportedOperationException("Not exists operation");
    }

}

