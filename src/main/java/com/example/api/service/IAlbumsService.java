package com.example.api.service;

import java.util.List;
import com.example.api.entity.Album;

public interface IAlbumsService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);

}
