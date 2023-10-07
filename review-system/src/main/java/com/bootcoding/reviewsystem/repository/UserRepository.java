package com.bootcoding.reviewsystem.repository;

import com.bootcoding.reviewsystem.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
@Repository
public class UserRepository {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public UserRepository(DataSource dataSource,JdbcTemplate jdbcTemplate){
        this.dataSource=dataSource;
        this.jdbcTemplate=jdbcTemplate;
    }
    public void save (User user){
        try {
            String query = "Insert into review_user " + "values ('" + user.getUsername() + "'," +
                    "'" +  user.getEmailId() +  "'," + user.getPhone() + ")";
            jdbcTemplate.update(query);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
