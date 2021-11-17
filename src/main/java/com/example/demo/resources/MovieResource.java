package com.example.demo.resources;

import com.example.demo.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class MovieResource {

    @RequestMapping("{movieId}")
    public Rating getMovieInfo(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }
}
