package data_types;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

class DisplayCurrency {
	public static String formatRupees(double value) {
		NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("en", "us"));
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(5);
		format.setRoundingMode(RoundingMode.HALF_EVEN);
		return format.format(value);
	}

	public static void main(String[] args) {
		BigDecimal tempBig = new BigDecimal(22.121457);
		System.out.println("tempBig = " + formatRupees(tempBig.doubleValue()));
	}
}