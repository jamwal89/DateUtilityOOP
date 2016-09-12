import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateUtility {

	private int month, year, day;




	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	GregorianCalendar gc= new GregorianCalendar(year,month,1);

	public String displayCalendar(int month, int year){

		month = month -1;

		String Months []={"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		int Days []= {31,29,31,30,31,30,31,31,30,31,30,31};
		GregorianCalendar gc= new GregorianCalendar(year,month,1);


		int d = gc.get(Calendar.DAY_OF_WEEK);
		String Day=("S\t M\t T\t W\t Th\tF\t S");

		d= d-1;
		String b= "";
		String c= "";
		for (int i=0; i<d;i++){

			b=String.format("%s   ", b);

		}

		for (int j=1; j <= Days[month]; j++){
			c= String.format("%s %2d ",c,j);

			if ((j+d)% 7==0 || j== Days[month]) {
				c += "\n";

			}	
		}
		return String.format("\n        " + year +"    "+ Months[month] +"\n"+Day+"\n"+c+b);
	}


	public int getLastDayOfMonth(int month, int year){
		int lastDay= gc.getActualMaximum(month);
		return lastDay;
	}
	
	public String toString(int month, int day, int year, String delimiter){
		String date = month+delimiter+day+delimiter+year;
		return date;
		
	}
	
	}




