package reproductormp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class DataBase {

 
	private String sql;
	
	
	
	

	private Connection connect(){
		String url="jdbc:sqlite:src/dataBase/reproductor.db";
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url);
		}catch(SQLException e) {
			System.out.println("Error connection to SQLite database");
			System.out.println(e.getMessage());

		}
		return conn;
	}

	public void getQueueData(){
		sql="SELECT * FROM Queue";
		try(Connection conn= this.connect();Statement statement = conn.createStatement();){
				statement.execute(sql);
				ResultSet result= statement.executeQuery(sql);
				while(result.next()){
					String name= result.getString("Nombre");
					System.out.println("Name: "+name);//debugging
				}
				conn.close();
			}catch(SQLException e){
				 System.out.println(e.getMessage());
			}
		
	}

	public void getPlaylistsData(){
		sql="SELECT * FROM Playlists";

		try(Connection conn= this.connect();Statement statement = conn.createStatement();){
			
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String playlist=result.getString("NamePlaylist");
				String name= result.getString("NombreCancion");
				System.out.println("Song: "+name+"|| Playlist: "+ playlist);//debugging
			}
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	
	public void getPlaylistData(){
		sql="SELECT * FROM Playlist";

		try(Connection conn= this.connect();Statement statement = conn.createStatement();){
			
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String playlist=result.getString("playlist");
				System.out.println("Playlist: "+ playlist);//debugging
			}
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	public void getSongstData(){
		sql="SELECT * FROM Songs";
		try(Connection conn= this.connect();Statement statement = conn.createStatement();){
			
			
			statement.execute(sql);
			ResultSet result= statement.executeQuery(sql);
			while(result.next()){
				String autor=result.getString("Autor");
				String name= result.getString("NombreCancion");
				String ruta=result.getString("Ruta");
				System.out.println("result: "+name+"|| Ruta: "+ ruta + " || Autor: " + autor);//debugging
			}
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	
	public void clearTable(String tableName){//Queue|Songs|Playlists|Playlist
		sql="DELETE FROM "+tableName;
		try(Connection conn= this.connect();Statement statement = conn.createStatement()){
			statement.execute(sql);
			System.out.println("Table "+tableName+" Cleared");//debugging
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	
	public void addSong(String name,String autor,String ruta){
		sql="INSERT INTO Songs (NombreCancion,Autor ,Ruta)	VALUES(?,?,?)";
		try(Connection conn= this.connect();PreparedStatement pstmt =conn.prepareStatement(sql)){
			pstmt.setString(1, name);
			pstmt.setString(2, autor);
			pstmt.setString(3, ruta);
			pstmt.executeUpdate();
			System.out.println("Song added successfully");//debugging
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
		
	}
	
	public void addToQueue(String name){
		sql="INSERT INTO Queue (Nombre)	VALUES(?)";
		try(Connection conn= this.connect();PreparedStatement pstmt =conn.prepareStatement(sql)){
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			System.out.println("Song added to Queue successfully");//debugging
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	
	public void addSongToPlaylist(String NamePlaylist,String NameSong){
		sql="INSERT INTO Playlists (NamePlaylist,NombreCancion)	VALUES(?,?)";
		try(Connection conn= this.connect();PreparedStatement pstmt =conn.prepareStatement(sql)){
			pstmt.setString(1, NamePlaylist);
			pstmt.setString(2, NameSong);
			pstmt.executeUpdate();
			System.out.println("Song added to playlist successfully");//debugging
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	
	public void addNewPlaylist(String NamePlaylist){
		sql="INSERT INTO Playlist (playlist)	VALUES(?)";
		try(Connection conn= this.connect();PreparedStatement pstmt =conn.prepareStatement(sql)){
			pstmt.setString(1, NamePlaylist);
			pstmt.executeUpdate();
			System.out.println("Playlist added successfully");//debugging
			conn.close();
		}catch(SQLException e){
			 System.out.println(e.getMessage());
		}
	}
	
	
}
