package okaram.samples;

public class SwitchSamples {
	// assuming it is not a leap year
	public static int daysInMonth(int month) // 1=Jan, ... 12=Dec
	{
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28; // Feb, todo - leap years :)
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0; // just in case we got something outside our range :)
	}
	
	public static String dayName(int day) // 1=Sunday, ... 7=Saturday
	{
		switch(day) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return "Invalid day";
		}
	}
	
}
