package com.docker.Sid.DataSaver.DAO;

import com.docker.Sid.DataSaver.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDAOImpl implements  UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addUser(User user) {
       String sql = "INSERT INTO users (name, address, contact) VALUES (?, ?, ?)";
       return jdbcTemplate.update(sql, user.getName(),user.getAddress(),user.getContact() );
    }

    public User getUser(int id)
    {
        String sql = "SELECT * FROM users WHERE id = ?";

        // Using queryForMap to get the result as a Map
        Map<String, Object> result = jdbcTemplate.queryForMap(sql, id);

        // Manually map the result to a User object
        if (result != null && !result.isEmpty()) {
            User user = new User();
            user.setId((Integer) result.get("id"));
            user.setName((String) result.get("name"));
            user.setContact((String) result.get("contact"));
            user.setAddress((String) result.get("address"));
            // Add other fields if required
            return user;
        }

        return null;  // Return null if no user is found
    }

    }



