package pojos;

public class Customer {
	private String custFirstName = null; 
	private String custMiddleName = null;
	private String custLastName= null;
	private String cc = null;
	private String custApt = null;
	private String custStreetName = null;
	private String custCity = null; 
	private String custState = null; 
	private String custZip = null;
	private String custCountry = null; 
	private long custPhone = 0; 
	private String custEmail = null;
	private long custSSN = 0;
	private String lastUpdated = null;
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustMiddleName() {
		return custMiddleName;
	}
	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public String getCustStreetName() {
		return custStreetName;
	}
	public void setCustStreetName(String custStreetName) {
		this.custStreetName = custStreetName;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public String getCustState() {
		return custState;
	}
	public void setCustState(String custState) {
		this.custState = custState;
	}
	public String getCustZip() {
		return custZip;
	}
	public void setCustZip(String custZip) {
		this.custZip = custZip;
	}
	public String getCustCountry() {
		return custCountry;
	}
	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}
	public long getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public long getCustSSN() {
		return custSSN;
	}
	public void setCustSSN(long custSSN) {
		this.custSSN = custSSN;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getCustApt() {
		return custApt;
	}
	public void setCustApt(String custApt) {
		this.custApt = custApt;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}

}
