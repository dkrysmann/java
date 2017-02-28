package FootballTeamGenerator;


import java.util.ArrayList;
import java.util.List;
public class Team {
    private String name;
    private List<Player> players;

    public Team(String name){
       this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name){
        if(name == null || name.trim().length() == 0){
            throw new CE("A name should not be empty.");
        }
        this.name = name;
    }
    public boolean addPlayer(Player player){
       return this.players.add(player);
    }
    public boolean removePlayer(String playerName){
        Player player = this.getPlayerByName(playerName);
        if(player == null){
            throw new CE(String.format("Player %s is not in %s team.",playerName,this.name));
        }
        return this.players.remove(player);
    }
    private double getRating(){
       return this.players.stream().mapToDouble(player -> player.getSkill()).average().orElse(0D);
    }
    private Player getPlayerByName(String name){
        return this.players.stream().filter(player -> player.getName().equals(name)).findFirst()
                .orElse(null);
    }

    public void printResult(){
        System.out.printf("%s - %0.f",this.name,this.getRating());
    }
}
