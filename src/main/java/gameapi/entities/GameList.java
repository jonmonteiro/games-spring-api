package gameapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "GameList")
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_game_list")
public class GameList {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	public GameList(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
