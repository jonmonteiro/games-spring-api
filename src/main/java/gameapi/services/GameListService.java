package gameapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gameapi.DTO.GameListDTO;
import gameapi.entities.GameList;
import gameapi.repositories.GameListRepository;

@Service
public class GameListService {

     @Autowired
    GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
}
