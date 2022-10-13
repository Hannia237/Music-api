package com.example.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entity.Album;
import com.example.api.repository.AlbumsRepository;
import com.example.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
	
	@Autowired
	private AlbumsRepository repoAlbums;

	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	public void guardar(Album album) {
		repoAlbums.save(album);
	}

	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
	}

}
