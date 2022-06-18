package reproductormp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	private String url="jdbc:sqlite:src/dataBase/reproductor.db";

	
	private void errorConnection(SQLException e){
		System.out.println("Error connection to SQLite database");
		e.printStackTrace();
	}
	
	public void getQueueData(){

	try{
			Connection connection = DriverManager.getConnection(url);
			String sql="SELECT * FROM Queue";
			
			Statement statement = connection.createStatement();
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String name= result.getString("Nombre");
				System.out.println("Name: "+name);//debugging
			}
			connection.close();
		}catch(SQLException e){
		 errorConnection(e);
		}
		
	}

	public void getPlaylistData(){
		try{
			Connection connection = DriverManager.getConnection(url);
			String sql="SELECT * FROM Playlists";
			
			Statement statement = connection.createStatement();
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String playlist=result.getString("NamePlaylist");
				String name= result.getString("NombreCancion");
				System.out.println("Song: "+name+"|| Playlist: "+ playlist);//debugging
			}
			connection.close();
		}catch(SQLException e){
		 errorConnection(e);
		}
	}
	
	public void getSongstData(){
		try{
			Connection connection = DriverManager.getConnection(url);
			String sql="SELECT * FROM Songs";
			
			Statement statement = connection.createStatement();
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String autor=result.getString("Autor");
				String name= result.getString("NombreCancion");
				String ruta=result.getString("Ruta");
				System.out.println("result: "+name+"|| Ruta: "+ ruta + " || Autor: " + autor);//debugging
			}
			connection.close();
		}catch(SQLException e){
		 errorConnection(e);
		}
	}
	
	public void clearTable(String tableName){//Queue|Songs|Playlists
		try{
			Connection connection = DriverManager.getConnection(url);
			String sql="DELETE FROM "+tableName;
		
			Statement statement = connection.createStatement();
			statement.execute(sql);

				System.out.println("Table "+tableName+" Cleared");//debugging
			
			connection.close();
		}catch(SQLException e){
		 errorConnection(e);
		}
	}
	
	
	
	
}
