package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	
	//RestService a = new RestService();

	public void datidb(String nome, String cognome) throws SQLException{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pippo", 
				"root", "admin");
		Statement stm = connection.createStatement();
		
		
		
		stm.executeUpdate("INSERT INTO prova(nome,cognome) VALUES ('"+nome+"','"+cognome+"')");
		ResultSet rs = stm.executeQuery("select * from prova order by id");
		
				
		while (rs.next()) {
			String usern=rs.getString("nome");
			String userc=rs.getString("cognome");
			System.out.println(usern+userc);
		}


	}
	
	
}
