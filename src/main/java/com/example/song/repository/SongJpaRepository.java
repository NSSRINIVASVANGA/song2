package com.example.song.repository;

import com.example.song.model.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SongJpaRepository extends JpaRepository<Song, Integer> {

}

/*
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */