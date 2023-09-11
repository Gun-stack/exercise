package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	public static int insertTeam(Connection conn, Team team) {//팀등록
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "INSERT INTO team (NAME, LOCAL) VALUES (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLocal());
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
//팀등록

	public static Team selectTeam(Connection conn, String teamname) {// 팀조회 
		Team team = null;
		String sql = "SELECT * FROM team WHERE name = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamname);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				team = new Team(rs.getInt("num"), rs.getString("NAME"), rs.getString("LOCAL"));
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

		return team;
	}

	public List<Team> selectTeamList() { //모든 팀조회
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
				Team team = new Team(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3));
				teamList.add(team);
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

		return teamList;
	}
	
	public static String getTeamNameByNum(int teamNum) {//  팀번호로 팀이름 찾기 
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    String teamName = null;

	    try {
	        conn = getConnection();
	        String sql = "SELECT name FROM team WHERE num = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, teamNum);
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            teamName = rs.getString(1);
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

	    return teamName;
	}
	
	
	
}
