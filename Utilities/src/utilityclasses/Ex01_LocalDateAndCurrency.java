package utilityclasses;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Ex01_LocalDateAndCurrency {

	public static void main(String[] args) {
		Date d = new Date();

		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.hashCode());

		Calendar c = Calendar.getInstance();
		System.out.println(c.getAvailableLocales());
		System.out.println(Calendar.DATE);

		Currency m = Currency.getInstance(Locale.JAPAN);

		System.out.println(c.getActualMaximum(10));
		
		
		double amount = 12345.67;

		// Create a NumberFormat for the default locale (e.g., your computer's settings)

		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

		String formattedAmount = currencyFormat.format(amount);
		System.out.println("Formatted amount (Default Locale): " + formattedAmount);

		// Create a NumberFormat for a specific locale (e.g., US)

		NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);

		String usFormattedAmount = usCurrencyFormat.format(amount);
		System.out.println("Formatted amount (JAPAN Locale): " + usFormattedAmount);

	}
}
