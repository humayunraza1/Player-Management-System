import java.util.ArrayList;
import java.util.Iterator;

public class Team {
    private ArrayList<Player> ActivePlayers = new ArrayList<Player>();
    private ArrayList<Player> Substitutes = new ArrayList<Player>();
    private Manager Manager;
    private String Team_Name;
    private double Team_Balance;
    public Team(Manager M, String Name, double Team_Balance){
        Manager = M;
        Team_Name = Name;
        this.Team_Balance = Team_Balance;
    }
    public double getTeam_Balance(){
        return Team_Balance;
    }
    protected void addFunds(double Amount){
        Team_Balance += Amount;
    }
    protected void RemoveFunds(double Amount){
        Team_Balance -= Amount;
    }
    public Manager getManager(){
        return Manager;
    }
    public String getName(){
        return Team_Name;
    }

    public ArrayList<Player> getActivePlayers() {
        return ActivePlayers;
    }

    public ArrayList<Player> getSubstitutes() {
        return Substitutes;
    }
    protected void setActivePlayers(ArrayList<Player> p){
        ActivePlayers = p;
    }
    protected void setSubstitutes(ArrayList<Player> s){
        Substitutes = s;
    }

    public String toString(){
        String str = "";
        Iterator itr = ActivePlayers.iterator();
        while (itr.hasNext()){
            str = str + "\n "+itr.next();
        }
        return ("Team Name: "+Team_Name + "\n Manager: "+Manager + "\n Roaster: "+str);
    }
}