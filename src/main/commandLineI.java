package es.uclm.esi.iso2.axx.command_Line_Interface;

import java.util.Date;

public interface commandLineI {
	
	int readInt();
	double readDouble();
	Date readDate();
	String readString();
	String readLine();
	
	void printLine(String output);
	void print(String output);

}
