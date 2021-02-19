package pawelcudzilo.pl.domain.comunication.dto;

import java.math.BigDecimal;

public interface MoneyDtoInterface {

    public String getCurrency();

    public void setCurrency(String currency);

    public BigDecimal getAmount();

    public void setAmount(BigDecimal amount);

}
