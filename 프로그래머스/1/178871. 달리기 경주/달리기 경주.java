import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rank = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            rank.put(players[i], i);
        }
        
        for(int j=0; j<callings.length; j++) {
            int index = rank.get(callings[j]);
            String temp = "";
            
            temp = players[index-1];
            players[index-1] = callings[j];
            players[index] = temp;
        
            rank.put(callings[j], index-1);
            rank.put(temp, index);
        }
        
        return players;
    }
}