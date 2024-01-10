/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int countSundy = 0;
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
		
	 	while (true) {
	 		//// Write the body of the while 	
			// if(dayOfWeek == dayOfMonth){
			// 	System.out.println("sunday");
			// }
			
	 		advance();
	 		debugDaysCounter++;
			// if(debugDaysCounter < 60){
			// 	break;
			// }
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (year >= 1999 && month >= 12 && dayOfMonth > 31) { 
	 			break;
	 		}
        }
		System.out.println(countSundy);
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// Replace this comment with your code
		
		if(dayOfMonth > nDaysInMonth(month, year)){
			month++;
			dayOfMonth = 1;
		}
		if(month > 12){
			year++;
			month = 1;
		}
			
		if(dayOfWeek % 8 == 0){
			dayOfWeek = 1;
			if(dayOfMonth == 1){
				countSundy++;
			}
		}
		
		if(dayOfWeek == 1){
			System.out.println(dayOfMonth + "/" + month + "/" + year + " sunday");
		}else{
			System.out.println(dayOfMonth + "/" + month + "/" + year);
		}

		dayOfMonth++;
		dayOfWeek++;
		}
		//System.out.println("During the 20th century," + countSundy + "Sundays fell on the first day of the month");
	
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
		boolean leapYear = false;
		leapYear = ((year % 400) == 0);
		leapYear = leapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return leapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1:
				month = 31;
				break;
			case 2:
				if(isLeapYear(year)){
				month = 29;
				}else{
				month = 28;
				}
				break;
			case 3:
				month = 31;
				break;
			case 4:
				month = 30;
				break;
			case 5:
				month =31;			
				break;
			case 6:
				month = 30 ;
				break;
			case 7:
				month = 31 ;
				break;
			case 8:
				month = 31 ;
				break;
			case 9:
				month = 30 ;
				break;
			case 10:
				month = 31 ;
				break;
			case 11:
				month = 30 ;
				break;
			case 12:
				month = 31 ;
				break;
			default:
			month = -1;
			break;
			}
			return month;
	}
}