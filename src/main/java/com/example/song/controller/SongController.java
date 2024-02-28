package com.example.song.controller;

import com.example.song.model.*;
import com.example.song.repository.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    @Autowired
    public SongRepository songRepository;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songRepository.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songRepository.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songRepository.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songRepository.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId) {
        songRepository.deleteSong(songId);
    }
}

/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */