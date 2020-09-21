package day2b.question2;

public class Invoice implements Paybale{

	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println("This is Invoice class");
		System.out.println(toString());
		return quantity*pricePerItem;
	}

	public String toString() {
		 return "part num = "+partNum+", part description = "+partDescription+", quantity = "+quantity+", price per item = "+pricePerItem;
	}
	
	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

}
