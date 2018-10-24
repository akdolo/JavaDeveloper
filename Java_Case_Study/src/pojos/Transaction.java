package pojos;

public class Transaction {
	private long transID;
	private short day;
	private short month;
	private short year;
	private String cc=null;
	private long custSSN =0;
	private int branchCode =0;
	private String transType = null;
	private double transValue = 0.0;
	private String dollarValue = null;
	private String date = null;
	public long getTransID() {
		return transID;
	}
	public void setTransID(long transID) {
		this.transID = transID;
	}
	public short getDay() {
		return day;
	}
	public void setDay(short day) {
		this.day = day;
	}
	public short getMonth() {
		return month;
	}
	public void setMonth(short month) {
		this.month = month;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public long getCustSSN() {
		return custSSN;
	}
	public void setCustSSN(long custSSN) {
		this.custSSN = custSSN;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public double getTransValue() {
		return transValue;
	}
	public void setTransValue(double transValue) {
		this.transValue = transValue;
	}
	public String getDollarValue() {
		return dollarValue;
	}
	public void setDollarValue(String dollarValue) {
		this.dollarValue = dollarValue;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}



}
