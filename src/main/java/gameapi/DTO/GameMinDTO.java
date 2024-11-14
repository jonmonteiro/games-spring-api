package gameapi.DTO;

import gameapi.entities.Game;
import gameapi.projections.GameMinProjection;

public record GameMinDTO(
    Long id,
	String title,
	Integer year,
    String imgUrl,
	String shortDescription
) {

    public GameMinDTO(Game entity) {
        this(
            entity.getId(),
		    entity.getTitle(),
		    entity.getYear(),
		    entity.getImgUrl(),
		    entity.getShortDescription());
	}

	public GameMinDTO(GameMinProjection entity) {
        this(
            entity.getId(),
		    entity.getTitle(),
		    entity.getGameYear(),
		    entity.getImgUrl(),
		    entity.getShortDescription());
	}
}
