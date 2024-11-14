package gameapi.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_belonging")
@Getter
@Setter
@NoArgsConstructor
public class Belonging {
    @EmbeddedId
	private BelongingPK id = new BelongingPK();

	private Integer position;
}
