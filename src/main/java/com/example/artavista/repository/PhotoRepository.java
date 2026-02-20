package com.example.artavista.repository;

import com.example.artavista.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class PhotoRepository extends JpaRepository<Photo, Integer> {

    List<Photo> findAllByDisableDateIsNull();
}
