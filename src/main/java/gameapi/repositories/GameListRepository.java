package gameapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import gameapi.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
