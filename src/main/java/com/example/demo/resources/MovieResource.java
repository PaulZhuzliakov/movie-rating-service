package com.example.demo.resources;

import com.example.demo.models.Rating;
import com.example.demo.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class MovieResource {

    @RequestMapping("{movieId}")
    public Rating getMovieInfo(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("5586", 1),
                new Rating("5813", 4)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
