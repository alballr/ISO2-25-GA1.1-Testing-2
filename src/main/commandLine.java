package es.uclm.esi.iso2.axx.command_Line_Interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class commandLine implements commandLineI {

	public static Scanner sc = new Scanner(System.in);
	
	public int readInt() {
		int num = 0;
		String input = sc.nextLine();
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Error. Input was not a number");
		}
		return num;
	}
	
	public double readDouble() {
		double num = 0;
		String input = sc.nextLine();
		try {
			num = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("Error. Input was not a number");
		}
		return num;
	}

	public Date readDate() {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		String input = sc.nextLine();
		try {
			date= sdf.parse(input);
		} catch (ParseException e) {
			System.out.println("❌ Invalid date. Use format dd/MM/yyyy");
		}
		return date;
	}
   

	
	public String readString() {
		return sc.next();
	}

	public String readLine() {
		return sc.nextLine();
	}

	public void printLine(String output) {
		System.out.println(output);		
	}
	
	public void print(String output) {
		System.out.print(output);
	}
	

}
