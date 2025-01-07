package com.docker.Sid.DataSaver.DAO;

import com.docker.Sid.DataSaver.DTO.User;

import java.util.List;

public interface UserDAO {
        int addUser(User user);
        User getUser(int id);
//        User getUserById(int id);
//        List<User> getAllUsers();
//
}

