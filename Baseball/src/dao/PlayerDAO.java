package dao;

import java.util.ArrayList;
import java.util.List;

import dto.*;

public class PlayerDAO {
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
