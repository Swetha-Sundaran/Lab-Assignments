package day_4;

abstract class Card_3 {
	String holderName;
	String cardNumber;
	String expiryDate;
	
	public Card_3(String holderName, String cardNumber, String expiryDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
