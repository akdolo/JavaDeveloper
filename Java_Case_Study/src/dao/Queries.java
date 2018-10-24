package dao;

public class Queries {
	
	public final static String transZip = "select cc.TRANSACTION_ID,cc.DAY,cc.MONTH,cc.YEAR,cc.CREDIT_CARD_NO,cc.CUST_SSN,cc.BRANCH_CODE,cc.TRANSACTION_TYPE, format(cc.TRANSACTION_VALUE,2) from cdw_sapp_creditcard cc inner join cdw_sapp_customer cu on cc.CUST_SSN = cu.SSN where cu.cust_zip = ? and  cc.month = ? and cc.year = ? order by cc.day desc";
	
	public final static String transType = "select count(transaction_id), format(sum(transaction_value),2) from cdw_sapp_creditcard where transaction_type = ?";
	
	public final static String transState = "select count(c.transaction_id), format(sum(c.transaction_value),2)\r\n" + 
			"from cdw_sapp_creditcard c inner join cdw_sapp_branch b\r\n" + 
			"on c.branch_code = b.branch_code\r\n" + 
			"where b.branch_state = ?";
	
	public final static String getCustDetails = "select cdw_sapp_customer.FIRST_NAME, cdw_sapp_customer.MIDDLE_NAME, cdw_sapp_customer.LAST_NAME, cdw_sapp_customer.CREDIT_CARD_NO, cdw_sapp_customer.APT_NO, cdw_sapp_customer.STREET_NAME, cdw_sapp_customer.CUST_CITY, cdw_sapp_customer.CUST_STATE, cdw_sapp_customer.CUST_ZIP, cdw_sapp_customer.CUST_COUNTRY,cdw_sapp_customer.CUST_PHONE, cdw_sapp_customer.CUST_EMAIL, cdw_sapp_customer.LAST_UPDATED from cdw_sapp_customer where cdw_sapp_customer.SSN = ?";
	
	public final static String updateCustDetails1 = "update cdw_sapp_customer set ";
	public final static String updateCustDetails2 = " = ? where cdw_sapp_customer.ssn = ?";
	
	public final static String getMonthlyBill = "select format(sum(cdw_sapp_creditcard.TRANSACTION_VALUE),2) from cdw_sapp_creditcard where cdw_sapp_creditcard.CREDIT_CARD_NO=? and cdw_sapp_creditcard.MONTH = ? and cdw_sapp_creditcard.YEAR = ?";
	
	public final static String getTransBetweenDates = "select cdw_sapp_creditcard.TRANSACTION_ID, concat_ws('/',cdw_sapp_creditcard.MONTH,cdw_sapp_creditcard.DAY,cdw_sapp_creditcard.YEAR), cdw_sapp_creditcard.CREDIT_CARD_NO, cdw_sapp_creditcard.BRANCH_CODE, cdw_sapp_creditcard.TRANSACTION_TYPE, format(cdw_sapp_creditcard.TRANSACTION_VALUE,2) from cdw_sapp_creditcard where cdw_sapp_creditcard.CUST_SSN= ? and str_to_date(concat_ws(',',cdw_sapp_creditcard.MONTH,cdw_sapp_creditcard.DAY,cdw_sapp_creditcard.YEAR),'%m,%d,%Y') between str_to_date(concat_ws(',',?,?,?),'%m,%d,%Y') and str_to_date(concat_ws(',',?,?,?),'%m,%d,%Y') order by cdw_sapp_creditcard.YEAR desc, cdw_sapp_creditcard.MONTH desc, cdw_sapp_creditcard.DAY desc";
	
}
