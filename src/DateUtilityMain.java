
public class DateUtilityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateUtility dt =new DateUtility();
		dt.setDay(1);
		dt.setMonth(5);
		dt.setYear(2016);
		

		System.out.println(dt.displayCalendar(dt.getDay(),dt.getMonth()));
		System.out.println(dt.getLastDayOfMonth(dt.getMonth(),dt.getYear()));
		System.out.println(dt.toString(dt.getMonth(), dt.getDay(), dt.getYear(), "\\"));
	}

}
