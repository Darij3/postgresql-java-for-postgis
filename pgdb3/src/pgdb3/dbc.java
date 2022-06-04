package pgdb3;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.util.PGobject;

import net.postgis.jdbc.PGgeometry;

	public class dbc { 

		public static void main(String[] args) throws ClassNotFoundException { 

		  java.sql.Connection conn; 

		  try { 
		    /* 
		    * Load the JDBC driver and establish a connection. 
		    */
		    Class.forName("org.postgresql.Driver"); 
		    String url = "jdbc:postgresql://localhost:5432/postgres"; 
		    conn = DriverManager.getConnection(url, "postgres", "Frida05Kalo");
		    System.out.println("Opened database successfully");
		  
		  } catch (SQLException e) {
			  e.printStackTrace();
			  }
			  }
			  @SuppressWarnings("deprecation")
			  public void getData() {
			  for (int i = 0; i < tblArray.length; i++) {
			  try {
			  Statement stmt = conn.createStatement();
			  String sql = "SELECT a.geometrija geom FROM "+ tblArray[i] + " a";
			  ResultSet rs = stmt.executeQuery(sql);
			  while (rs.next()) {
				  PGgeometry geom = (PGgeometry)rs.getObject(1); 
			       System.out.println(geom.toString()); 
			  result.add(geom);
			  }
			  } catch (SQLException e) {
			  e.printStackTrace();
			  }
			  }
			  }
			  public List<PGgeometry> getJList(){
			  return result;
			  }
			  private Connection conn;
			  private List<PGgeometry> result = new ArrayList<PGgeometry>(0);
			  private String[] tblArray = {"celi", "maja", "ietves", "darzs", "priedes", "gaisma"};
			  }
	
		    
