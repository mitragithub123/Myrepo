package others;

import java.util.Scanner;

// Check if the year is divisible by 400 or divisible by 4 but not by 100
public class LeapYear {
	public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		}
		if (year % 100 != 0) {
			return false;
		}
		if (year % 400 == 0) {
			return false;
		}
		return false;
	}
	
	/*public boolean isLeapYear(int year) {
       
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }*/
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		if (ly.isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		sc.close();
	}
}
