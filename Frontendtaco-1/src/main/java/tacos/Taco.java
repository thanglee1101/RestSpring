package tacos;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	@NotNull
	private Long id;
	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;
	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private Date createdAt;
	private List<Ingredient> ingredients;
}