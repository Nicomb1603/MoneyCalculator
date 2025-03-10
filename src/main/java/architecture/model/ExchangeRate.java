package architecture.model;

import java.time.LocalDate;
import java.util.Date;

public record ExchangeRate(Currency from, Currency to, double rate, Date date) {
}
