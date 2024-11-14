package gameapi.DTO;

import gameapi.entities.GameList;

public record GameListDTO(
    Long id,
    String name
) {

  public GameListDTO(GameList data) {
    this(data.getId(), data.getName());
  }
}
