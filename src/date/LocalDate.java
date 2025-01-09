package date;

public class LocalDate {

	public static void main(String[] args) {
		java.time.LocalDate date = java.time.LocalDate.now();
		System.out.println("Yesterday Date: " + date.minusDays(1));
		System.out.println("Tomorrow Date: " + date.plusDays(1));
		System.out.println("Next Month Date: " + date.plusMonths(1));
		System.out.println("Next Year Date: " + date.plusYears(1));
		System.out.println("Previous Month Date: " + date.minusMonths(1));
		System.out.println("Previous Year Date: " + date.minusYears(1));
		System.out.println("Day of Week: " + date.getDayOfWeek());
		System.out.println("Day of Month: " + date.getDayOfMonth());
		System.out.println("Day of Year: " + date.getDayOfYear());
		System.out.println("Month: " + date.getMonth());
		System.out.println("Year: " + date.getYear());
	}
}
