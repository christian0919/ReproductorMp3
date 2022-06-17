package reproductormp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	
	public void getQueueData(){
		
		/*
		 *
		 *
		 *
		 *Pendiente como poner la ruta de la base de datos que se encuentra en al proyecto
		 *
		 * 
		 * 
		*/
		String url="jdbc:sqlite:src/dataBase/reproductor.db";
		try {
			Connection connection = DriverManager.getConnection(url);
			String sql="SELECT * FROM Queue";
			
			Statement statement = connection.createStatement();
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String name= result.getString("Nombre");
				System.out.println("result: "+name);
			}
		}catch(SQLException e){
			System.out.println("Error connection to SQLite database");
			e.printStackTrace();
		}
	}


}
