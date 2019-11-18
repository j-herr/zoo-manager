package util;

import java.util.Scanner;

public abstract class TicketMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int NumTickets;
		int SumTickets;
		System.out.print("Please choose Adult, Child, or Senior.");
		String NumAdults = scanner.nextLine();
		String NumChild = scanner.nextLine();
		String NumSenior = scanner.nextLine();
		int AdultPrice = 15;
		int ChildPrice = 5;
		int SeniorPrice = 10;		
		System.out.print("How many tickets would you like");
		NumTickets = NumAdults + NumChild + NumSenior;
		int TotalPrice = NumAdults * AdultPrice + NumChild * ChildPrice + NumSenior * SeniorPrice;
		SumTickets = SumTickets + NumTickets;
		return TotalPrice;
	}
}
