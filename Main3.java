package day_4;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		int cardType;
		String details;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select the card....");
		System.out.printf("1.Payback Card\n2.Membership Card\n");
		cardType = scan.nextInt();
		System.out.printf("Enter card details separated by @...\n");
		details = scan.next();
		String cardDetails[] = details.split("@", 3);
		String holderName = cardDetails[0];
		String cardNumber = cardDetails[1];
		String expiryDate = cardDetails[2];
		if(cardType == 1) {
			System.out.println("Enter points...");
			int points = scan.nextInt();
			System.out.println("Enter amount...");
			int amount = scan.nextInt();
			PaybackCard_3 paybackcard = new PaybackCard_3(holderName,cardNumber,expiryDate,points,amount);
			System.out.println(paybackcard.getHolderName()+" Payback Card Details...");
			System.out.println("Card Number   ...: "+paybackcard.getCardNumber());
			System.out.println("Total Amount  ...: "+paybackcard.getTotalAmount());
		}
		else if(cardType == 2) {
			System.out.println("Enter rating...");
			int rating = scan.nextInt();
			MembershipCard_3 membership = new MembershipCard_3(holderName,cardNumber,expiryDate,rating);
			System.out.println(membership.getHolderName()+" Membership Card Details...");
			System.out.println("Card Number   ...: "+membership.getCardNumber());
			System.out.println("Total Amount  ...: "+membership.getRating());
		}
	}

}
