package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import pojos.Customer;
import pojos.Transaction;

public class DAO {

	private static Connection con;
	private static String url = "jdbc:mysql://localhost/cdw_sapp?useSSL=false" ;
	private static String username = "root" ;
	private static String password = "root" ;
	
	public static boolean connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public void close() {
		try {
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Transaction> getTransZip(String zip, short month, short year) throws SQLException, ClassNotFoundException {

        List<Transaction> list= new ArrayList<Transaction>();
		
		PreparedStatement pst = con.prepareStatement(Queries.transZip);
		pst.setString(1, zip);
		pst.setShort(2, month);
		pst.setShort(3, year);
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			Transaction trans = new Transaction();
			trans.setTransID(rs.getLong(1));
			trans.setDay(rs.getShort(2));
			trans.setMonth(rs.getShort(3));
			trans.setYear(rs.getShort(4));
			trans.setCc(rs.getString(5));
			trans.setCustSSN(rs.getLong(6));
			trans.setBranchCode(rs.getInt(7));
			trans.setTransType(rs.getString(8));
			trans.setTransValue(rs.getDouble(9));
			list.add(trans);
		}
		
		rs.close();
		pst.close();
		con.close();
		
		return list;
	}
	
	public Transaction getTransType(short choice) throws SQLException, ClassNotFoundException {

        Transaction trans= new Transaction();
		String transType = null;
		
		PreparedStatement pst = con.prepareStatement(Queries.transType);
		switch (choice) {
		case 1: {transType = "Bills";
			break;
			}
		case 2: {transType = "Education";
			break;
			}
		case 3: {transType = "Entertainment";
			break;
			}
		case 4: {transType = "Gas";
			break;
			}
		case 5: {transType = "Grocery";
			break;
			}
		case 6: {transType = "Healthcare";
			break;
			}
		case 7: {transType = "Test";
			break;
			}
		}
		pst.setString(1, transType);
		trans.setTransType(transType);
		ResultSet rs = pst.executeQuery();
		
		rs.next();
			
		trans.setTransID(rs.getLong(1));
		trans.setDollarValue(rs.getString(2));

		rs.close();
		pst.close();
		
		return trans;
	}
	public Transaction getTransSt(String state) throws SQLException, ClassNotFoundException {

        Transaction trans= new Transaction();
        PreparedStatement pst = con.prepareStatement(Queries.transState);

		pst.setString(1, state);
		
		ResultSet rs = pst.executeQuery();
		rs.next();
			
		trans.setTransID(rs.getLong(1));
		trans.setDollarValue(rs.getString(2));

		rs.close();
		pst.close();
		
		
		return trans;
	}
	
	public Customer getCustDetails(long custSSN) throws SQLException, ClassNotFoundException {

        Customer cust = new Customer();
	
		
		PreparedStatement pst = con.prepareStatement(Queries.getCustDetails);

		pst.setLong(1, custSSN);
		
		ResultSet rs = pst.executeQuery();
		
		rs.next();
			
		cust.setCustFirstName(rs.getString(1));
		cust.setCustMiddleName(rs.getString(2));
		cust.setCustLastName(rs.getString(3));
		cust.setCc(rs.getString(4));
		cust.setCustApt(rs.getString(5));
		cust.setCustStreetName(rs.getString(6));
		cust.setCustCity(rs.getString(7));
		cust.setCustState(rs.getString(8));
		cust.setCustZip(rs.getString(9));
		cust.setCustCountry(rs.getString(10));
		cust.setCustPhone(rs.getLong(11));
		cust.setCustEmail(rs.getString(12));
		cust.setLastUpdated(rs.getString(13));
		
		
		rs.close();
		pst.close();
		
		return cust;
	}
	
	public boolean updateCustDetails(String field,long update,long custSSN) throws SQLException, ClassNotFoundException {

        boolean success = false;
		
        String query = Queries.updateCustDetails1 + field + Queries.updateCustDetails2;
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setLong(1, update);
		pst.setLong(2, custSSN);
		
		int count = pst.executeUpdate();
		
		if(count == 1)
			success = true;
		else
			success = false;
		
		pst.close();
		return success;
	}
	
	public boolean updateCustDetails(String field,String update,long custSSN) throws SQLException, ClassNotFoundException {

         boolean success = false;
        
        String query = Queries.updateCustDetails1 + field + Queries.updateCustDetails2;
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, update);
		pst.setLong(2, custSSN);
	
		int count = pst.executeUpdate();
		
		if(count == 1)
			success = true;
		else
			success = false;
		
		pst.close();
		return success;
	}
	
	public Transaction getMonthlyBill(String ccNumber, short month, short year ) throws SQLException, ClassNotFoundException {

	    Transaction trans= new Transaction();
	    PreparedStatement pst = con.prepareStatement(Queries.getMonthlyBill);

		pst.setString(1, ccNumber);
		pst.setShort(2, month);
		pst.setShort(3, year);

		ResultSet rs = pst.executeQuery();
		
		rs.next();
		trans.setDollarValue(rs.getString(1));

		rs.close();
		pst.close();
	
		return trans;
	}
	
	public List<Transaction> getTransBetweenDates(long custSSN, short month1, short day1, short year1, short month2, short day2, short year2) throws SQLException, ClassNotFoundException {

        List<Transaction> list= new ArrayList<Transaction>();
        
		PreparedStatement pst = con.prepareStatement(Queries.getTransBetweenDates);
		pst.setLong(1, custSSN);
		pst.setShort(2, month1);
		pst.setShort(3, day1);
		pst.setShort(4, year1);
		pst.setShort(5, month2);
		pst.setShort(6, day2);
		pst.setShort(7, year2);
		
		ResultSet rs = pst.executeQuery();
		
		
		while(rs.next()) {
			Transaction trans = new Transaction();
			trans.setTransID(rs.getLong(1));
			trans.setDate(rs.getString(2));
			trans.setCc(rs.getString(3));
			trans.setBranchCode(rs.getInt(4));
			trans.setTransType(rs.getString(5));
			trans.setTransValue(rs.getDouble(6));
			list.add(trans);
		}
		
		rs.close();
		pst.close();
		con.close();
		
		return list;
	}

	
}

