package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.*;

public class PlayerDAO {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));

			Class.forName(db.getProperty("Driver"));

			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"),
					db.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int insertPlayer(Player player) {
		int cnt=0;
		return cnt;
		
	}
	

	
	public List <Player> selectPlayerByName(String name){
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
	
	public Player selectPlayerByNum(Integer num) {
		Player player = null;
		return player;
	}
	
	public List <Player> selectPlayerByTeam(String teamName){
		List<Player> playerList = new ArrayList<>();
		return playerList;
	}
}
