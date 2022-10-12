package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
