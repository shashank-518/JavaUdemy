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

    }


}
