package dao;

import model.User;

import java.util.UUID;

public interface UserDAO extends GenericDAO<User, UUID> {
    boolean emailExist(String email);

    User findUserByEmail(String name);
}

