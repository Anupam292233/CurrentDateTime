import java.util.Date;

public class CurrentDateTime {
	public static void main(String[] args) {
		
		// Current Date
//		
//		Date currentDate = new Date();
//		currentDate.setHours(0);
//		currentDate.setMinutes(0);
//		currentDate.setSeconds(0);
//		System.out.println("Current Date: " + currentDate);
//		
//		   // Current time
//		
//		Date  currentTime = new Date();
//		currentTime.setYear(2023);
//		currentTime.setMonth(7);
//		currentTime.setDate(10);
//		System.out.println("Current Time: " + currentTime);

		// Current year
		
		Date currentYear = new Date();
		int year = currentYear.getYear() + 1900;
		System.out.println("Current Year: " + year);
	
	
	}
}
