
public class Moneyspend {
	int moneytype;
	String moneydate;
	int moneyamount;
	String moneydetail;
	
	public Moneyspend() {
	}
	
	public Moneyspend(int moneytype, String moneydate, int moneyamount) {
		this.moneytype = moneytype;
		this.moneydate = moneydate;
		this.moneyamount = moneyamount;
	}
	
	public Moneyspend(int moneytype, String moneydate, int moneyamount, String moneydetail) {
		this.moneytype = moneytype;
		this.moneydate = moneydate;
		this.moneyamount = moneyamount;
		this.moneydetail = moneydetail;
	}
	
	public void printInfo() {
		System.out.println("Type:" + moneytype + "Date:" + moneydate + "Amount:" + moneyamount + "Detail:" + moneydetail);
	}
}
