package tacos;
import javax.persistence.Entity; 
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.NoArgsConstructor; 
import lombok.RequiredArgsConstructor; 
import lombok.AccessLevel; 
import lombok.Data;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@EntityScan
public class Ingredient {
	@Id
	private final String id, name;
	@Enumerated(EnumType.STRING)
	private final Type type;
	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}
