public class User {
    private String username;
    private Manager manager;
    private Player player;
    protected String Password;
    public User(String username, String Password, Manager m){
        this.username = username;
        this.Password = Password;
        this.manager = m;
    }
    public User(String username, String Password, Player p){
        this.username = username;
        this.Password = Password;
        this.player = p;
    }

    public Manager getManager() {
        return manager;
    }

    public Player getPlayer() {
        return player;
    }

    public String getUsername(){
        return username;
    }
}