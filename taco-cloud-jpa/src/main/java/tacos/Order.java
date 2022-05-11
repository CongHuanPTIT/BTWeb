package tacos;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Order {
	@NotBlank(message = "Name is required")
	private String name;
	@NotBlank(message = "Street is required")
	private String street;
	private Long id;
	private Date placedAt;
}