package day_4;

public class MembershipCard_3 extends Card_3{
private int rating;
	
	public MembershipCard_3(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
