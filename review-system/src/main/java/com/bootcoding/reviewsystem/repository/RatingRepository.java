package com.bootcoding.reviewsystem.repository;

import com.bootcoding.reviewsystem.model.Rating;
import com.bootcoding.reviewsystem.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class RatingRepository {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public RatingRepository(DataSource dataSource,JdbcTemplate jdbcTemplate){
        this.dataSource=dataSource;
        this.jdbcTemplate=jdbcTemplate;
    }

    public void save (Rating rating){
        try {
            String query = "Insert into rating " + "values ('" + rating.getRatingValue() + "'," +
                    "'" +  rating.getUserName() +  "'," + rating.getItemId() + ")";
            jdbcTemplate.update(query);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
