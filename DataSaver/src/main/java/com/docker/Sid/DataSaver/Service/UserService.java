package com.docker.Sid.DataSaver.Service;


import com.docker.Sid.DataSaver.DAO.UserDAO;
import com.docker.Sid.DataSaver.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public ResponseEntity<User> addUser(User userObject) {

        userDAO.addUser(userObject);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<User> getUser(int id) {
        User user =userDAO.getUser(id);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }
}
