package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow, Long> {
    @Override
    Optional<MovieShow> findById(Long aLong);
}
