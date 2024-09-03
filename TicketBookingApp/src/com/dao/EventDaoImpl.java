package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dto.EventBookedDto;
import com.dto.EventRevenueDto;
import com.enums.EventType;
import com.exception.InvalidIdException;
import com.model.Customer;
import com.model.Event;

import com.mysql.jdbc.PreparedStatement;
import com.util.DBUtil;

public class EventDaoImpl implements EventDao{

	public List<EventRevenueDto> getRevenueByEvent() throws SQLException {
		Connection conn = DBUtil.getDBconn();
        List<EventRevenueDto> list= new ArrayList<>();
      //step 1:prepare the statement
      		String sql="select event_name, SUM(((total_seats-available_seats)* ticket_price)) as total_revenue "
      				+ "from event"
      				+ " group by event_name";
      		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
      		// execute the statement
      		ResultSet rst =pstmt.executeQuery();
      		//Iterate over the object 
      		while(rst.next()) {
      		   String eventName = rst.getString("event_name");
			   double totalRevenue  = rst .getDouble("Total_revenue");
			   EventRevenueDto dto = new  EventRevenueDto (eventName , totalRevenue);
			   list.add(dto);
      		}
      		DBUtil.dbclose();
		return list;
	}

	public List<EventBookedDto> getTicketsBookedByEvent() throws SQLException {
		Connection conn = DBUtil.getDBconn();
        List<EventBookedDto> list= new ArrayList<>();
      //step 1:prepare the statement
        String sql= "select event_name , SUM(total_seats-available_seats) as total_tickets_booked from event group by event_name ";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
  		// execute the statement
  		ResultSet rst =pstmt.executeQuery();		
  	//Iterate over the object 
  		while(rst.next()) {
  		   String eventName = rst.getString("event_name");
		   int totalTicketsBooked  = rst .getInt("total_tickets_booked");
		   EventBookedDto dto = new  EventBookedDto (eventName , totalTicketsBooked);
		   list.add(dto);
  		}
        DBUtil.dbclose();
		return list;
	}

	public Customer validateCustomerId(int customerId) throws SQLException ,InvalidIdException{
		Connection conn = DBUtil.getDBconn();
		String sql = "select * from customer where id=?";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        // Attach the value to ?
		pstmt.setInt(1,customerId);
		// execute the statement
		ResultSet rst =pstmt.executeQuery();
		// Iterate over the result set and read db column 
		if(rst.next()) {// if id is present show the data else Invalididexception
				int id = rst.getInt("id");
				String customerName = rst.getString("customer_name");
				String email = rst .getString("email");
				String phoneNumber = rst.getString("phone_number");
				// save it in object 
				Customer customer = new Customer(id ,customerName , email , phoneNumber);
				return customer;
				}
		DBUtil.dbclose();
		throw new InvalidIdException(sql);
		
	}

	public List<Event> fetAllEvents() throws SQLException {
		List<Event> list = new ArrayList<>();
		Connection conn = DBUtil.getDBconn();
		//step 1:prepare the statement
		String sql="select * from event";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		// execute the statement
		ResultSet rst =pstmt.executeQuery();		
		// Iterate over the result set and read db column 
		while(rst.next()) {
			int id = rst.getInt("id");
			String eventName = rst.getString("event_name");
//			int totalSeats = rst .getInt("total_seats");
			int availableSeats= rst.getInt("available_seats");
			double ticketPrize= rst.getDouble("ticket_price");
			String eventType = rst.getString("event_type");
//			int venueId = rst.getInt("venue_id");
			// save it in object 
			Event event = new Event( );
			event.setId(id);
			event.setEventName(eventName);
			event.setAvailableSeats(availableSeats);
			event.setTicketPrize(ticketPrize);
			event.setEventType(EventType.valueOf(eventType.toUpperCase()));
			// add this obj to the list
			list.add(event);
		}
		DBUtil.dbclose();
		return list;		
		
	}


	@Override
	public void insertRecordInBooking( int customerId, int eventId, int numberOfTickets, double totalCost , LocalDate date) throws SQLException {
		Connection conn = DBUtil.getDBconn();
		//step 1:prepare the statement
		String sql="insert into booking values (?,?,?,?,?)";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, eventId);
		pstmt.setInt(2, customerId);
		pstmt.setInt(3, numberOfTickets);
		pstmt.setDouble(4, totalCost);
        pstmt.setString(5, date.toString());	
        
        
        pstmt.executeUpdate();
        DBUtil.dbclose();
		
	}

	public void updateAvailableSeats(int eventId, int newVal ) throws SQLException{
		Connection conn = DBUtil.getDBconn();
		//step 1:prepare the statement
		String sql="update event set available_seats=? where id=? ";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1,newVal);
		pstmt.setInt(2, eventId);
		
		pstmt.executeUpdate();
		
		DBUtil.dbclose();
		
	}

}
