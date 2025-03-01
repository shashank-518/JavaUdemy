package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    private String TeamName;
    private List<BaseBallPlayers> TeamMembers = new ArrayList<>();
    private int TotalWins = 0;
    private int TotalLoss = 0;
    private int TotalTies = 0;

    public BaseballTeam(String teamName){
        this.TeamName = teamName;
    }

    public void AddPlayers(BaseBallPlayers Players){
        if(!(TeamMembers.contains(Players))){
            TeamMembers.add(Players);
        }
    }

    public void TeamMembers(){

        System.out.println(TeamName + "Roaster");
        System.out.println(TeamMembers);
    }

    public int rankings(){
        return ((TotalLoss*2) + TotalTies +1 );
    }

    public String setScore(int ourScore , int theirScore){
        String message = "Lost to";

        if(ourScore > theirScore){
            message = "beat";
            TotalWins++;
        } else if(ourScore == theirScore) {
message = "tied";
TotalTies++;
        }
        else{
            TotalLoss++;
        }

        return  message;

    }


}
