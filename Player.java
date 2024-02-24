import java.text.SimpleDateFormat;
public class Player extends Person {
    private int PlayerNo;
    private Position position;
    private double price;
    public Player(String Fname, String Lname, char Gender, int No, Position p, double price){
        super(Fname, Lname, Gender);
        PlayerNo = No;
        this.position = p;
        this.price = price;
    }
    public Player(Player p){
        this(p.getFname(), p.getLname(), p.getGender(), p.PlayerNo, p.position, p.price);
    }
    public Player(Person p, int No, Position po, double price){
        this(p.getFname(), p.getLname(), p.getGender(), No, po, price);
    }

    public double getPrice() {
        return price;
    }

    public int getNo(){
        return PlayerNo;
    }
    public Position getP(){
        return position;
    }
    public String toString(){
        return (super.toString() + "\n Player Number: "+PlayerNo + "\n Player Position: "+position);
       
   }
}