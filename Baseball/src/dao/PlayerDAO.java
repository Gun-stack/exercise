package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Player;

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

	public static int insertPlayer(Connection conn, Player player) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		String sql = "INSERT INTO Player (NAME, backnum, teamnum) VALUES (?, ?, ?)";
		try {

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, player.getName());
			pstmt.setInt(2, player.getBacknum());
			pstmt.setInt(3, player.getTeamnum());
			cnt = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnt;

	}

	public static List<Player> selectPlayerByName(String name) {
		List<Player> playerList = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "SELECT * FROM Player WHERE NAME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer playerNum = rs.getInt(1);
				String playerName = rs.getString(2);
				Integer backNum = rs.getInt(3);
				Integer teamNum = rs.getInt(4);
				String teamName = TeamDAO.getTeamNameByNum(teamNum);

				Player player = new Player(playerNum, playerName, backNum, teamNum, teamName);

				playerList.add(player);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return playerList;
	}

	public static Player selectPlayerByNum(Connection conn, Integer num) {
		Player player = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from player where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Integer playerNum = rs.getInt(1);
				String playerName = rs.getString(2);
				Integer backNum = rs.getInt(3);
				Integer teamNum = rs.getInt(4);
				String teamname = TeamDAO.getTeamNameByNum(teamNum);
				player = new Player(playerNum, playerName, backNum, teamNum, teamname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return player;
	}

	public static List<Player> selectPlayerByBackNum(Connection conn, Integer backnum) {
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from player where backnum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, backnum);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Integer playerNum = rs.getInt(1);
				String playerName = rs.getString(2);
				Integer backNum = rs.getInt(3);
				Integer teamNum = rs.getInt(4);
				String teamname = TeamDAO.getTeamNameByNum(teamNum);
				Player player = new Player(playerNum, playerName, backNum, teamNum, teamname);

				playerList.add(player);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return playerList;
	}

	public static List<Player> selectPlayerByTeam(Connection conn, Integer teamNum) {
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM Player WHERE teamnum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, teamNum);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Integer playerNum = rs.getInt("num");
				String playerName = rs.getString("NAME");
				Integer backNum = rs.getInt("backnum");

				String teamname = TeamDAO.getTeamNameByNum(teamNum);
				Player player = new Player(playerNum,

						playerName, backNum, teamNum,

						teamname);

				playerList.add(player);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return playerList;
	}
}
