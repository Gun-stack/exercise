package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Team;

public class TeamDAO {
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

	public int insertTeam(Team team) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = getConnection();
			String sql = "INSERT INTO team (team_name, local) VALUES (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLocal());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}
//팀등록

	public Team selectTeam(String teamname) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Team team = null;

		try {
			conn = getConnection();
			String sql = "SELECT * FROM team WHERE teamname = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamname);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				team = new Team( rs.getString("teamname"), 
						rs.getString("local"));
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

		return team;
	}

	public List<Team> selectTeamList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Team> teamList = new ArrayList<>();

		try {
			conn = getConnection();
			String sql = "SELECT * FROM team";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Team team = new Team(null, rs.getString("teamname"),
						rs.getString("local"));
				teamList.add(team);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return teamList;
	}

}
