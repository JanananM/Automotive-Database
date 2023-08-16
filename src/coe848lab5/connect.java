package coe848lab5;
import java.sql.*;
import java.util.Scanner;

public class connect {
	public static void main(String[] args) {
		Connection c = null;
		Statement stmnt = null;
		int input;
		int inputbid, inputBuyerCreditScore;
		String inputBuyerName, inputBuyerAddress;
		int inputpid, inputSellerRating; 
		String inputSellerName, inputSellerAddress;
		//ask for input
		//each try catch in case statements
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to AutoMarket | Buy and Sell Vehicles | Best Customer Service");
		System.out.println("Press 1 to get How many vehicles are sedans");
		System.out.println("Press 2 to get How many vehicles are sold by private sellers?");
		System.out.println("Press 3 to show all vehicles that are the colour black");
		System.out.println("Press 4 to show the cheapest vehicle");
		System.out.println("Press 5 to show the vehicle with the least amount of kilometers");
		System.out.println("Press 6 to show all the vehicles with 'Gas' Fuel Type");
		System.out.println("Press 7 to show all vehicles with 'automatic' transmission");
		System.out.println("Press 8 to show all sellers within the marketplace");
		System.out.println("Press 9 to show all vehicles that are sedans and black");
		System.out.println("Press 10 to show all vehicles that are trucks and white");
		System.out.println("Press 11 to Enter Private Seller Info");
		System.out.println("Press 12 to Enter Buyer Info");
		
		System.out.println("Enter your choice");
		input = in.nextInt();
		
		switch(input) {
		case 1:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT vid FROM vehicle WHERE vehicleType = 'sedan'";
				ResultSet rs = stmnt.executeQuery(sql);
				int numofVehicles = 0;
				while(rs.next()) {
					String car = rs.getString("vid");
					numofVehicles++;
					
				}
				System.out.println("There are " + numofVehicles + " vehicles that are sedans in this marketplace");
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
		
		case 2:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT make,model FROM vehicle WHERE price <= 10000";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("All these vehicles under 10000 are sold by private sellers because its cheap");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
					
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 3:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT make,model FROM vehicle WHERE vehicleColour = 'black'";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("All these vehicles are colour: Black");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
					
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 4:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT two.make, two.model FROM vehicle one, vehicle two WHERE one.price > two.price";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("This is the cheapest vehicle");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
					
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 5:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT two.make, two.model FROM vehicle one, vehicle two WHERE one.kilometers > two.kilometers";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("This is the vehicle with least amount of kilometers");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
					
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
			
		case 6:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT make, model FROM vehicle WHERE fuelType = 1";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("Vehicles with Gas Fuel Types");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
					
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 7:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT make, model FROM vehicle WHERE transmission = 'automatic'";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("Vehicles with Automatic Transmissions");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
					
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 8:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT dsellerName FROM dealershipSeller";
				String sql1 = "SELECT privateSellerName FROM privateSeller";
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("Names of all the sellers");
				while(rs.next()) {
					String sellerName = rs.getString("dsellerName");
					System.out.println(sellerName);
				
				}
				
				ResultSet rs1 = stmnt.executeQuery(sql1);
				while(rs1.next()) {
					String sellerName = rs1.getString("privateSellerName");
					System.out.println(sellerName);
				
				}
				
				
				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 9:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT make,model FROM vehicle WHERE vehicleColour = 'black' AND vehicleType = 'sedan'";
				
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("All vehicles that are a black sedan");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
				
				}

				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
			
		case 10:
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "SELECT make,model FROM vehicle WHERE vehicleColour = 'white' AND vehicleType = 'truck'";
				
				ResultSet rs = stmnt.executeQuery(sql);
				System.out.println("All vehicles that are a white truck");
				while(rs.next()) {
					String carMake = rs.getString("make");
					String carModel = rs.getString("model");
					System.out.println(carMake + " " + carModel);
				
				}

				stmnt.close();
				//c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Opened database successfully");
			break;
		
		case 11:
			//input private seller info
			
			//inputpid, inputSellerName, inputSellerAddress, inputSellerRating;
			
			System.out.println("Enter Seller ID");
			inputpid = in.nextInt();
			System.out.println(inputpid);
			System.out.println("Enter Seller Name");
			inputSellerName = in.next();
			System.out.println(inputSellerName);
			System.out.println("Enter Seller Address");
			inputSellerAddress = in.next();
			System.out.println(inputSellerAddress);
			System.out.println("Enter Seller Rating");
			inputSellerRating = in.nextInt();
			System.out.println(inputSellerRating);
			
			
			
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				
				c.setAutoCommit(false);
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "INSERT INTO privateSeller (pid,privateSellerName,privateSellerAddress,privateSellerRating) VALUES "
						+ "( "+ inputpid +"," + "'" + inputSellerName + "'" +"," + "'" +inputSellerAddress + "'" +"," + inputSellerRating + " )";
				
				
				
				stmnt.executeUpdate(sql);
				
				
				stmnt.close();
				c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Record entered successfully");
			
			break;
		case 12:
			//input buyer info
			//inputbid, inputBuyerName, inputBuyerAddress, inputBuyerCreditScore;
			
			System.out.println("Enter Buyer ID");
			inputbid = in.nextInt();
			System.out.println("Enter Buyer Name");
			inputBuyerName = in.next();
			System.out.println("Enter Buyer Address");
			inputBuyerAddress = in.next();
			System.out.println("Enter Buyer Credit Score");
			inputBuyerCreditScore = in.nextInt();
			
			try {
				//connect database
				Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:C:/Users/janan/Desktop/Engineering/coe848/lab5/market.db");
				c.setAutoCommit(false);
				
				//updating/inserting commands
				stmnt = c.createStatement();
				String sql = "INSERT INTO buyer (bid,buyerName,buyerAddress,buyerCreditScore) VALUES"
						+ "( "+ inputbid +"," + "'" + inputBuyerName + "'" +"," + "'" + inputBuyerAddress + "'" + "," + inputBuyerCreditScore + " )";
				
				stmnt.executeUpdate(sql);
				
				
				stmnt.close();
				c.commit();
				c.close();
			}
			catch(Exception e) {
				System.err.println("Problem encountered");
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Record entered successfully");
			
			break;
		default:
			System.out.println("Error");
		}
		

	}
}
