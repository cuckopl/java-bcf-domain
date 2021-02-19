package pawelcudzilo.pl.domain.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.math.BigDecimal;


@Setter
@Getter
@Embeddable
public class Money {

    public BigDecimal amount;

    public String currency;

}
