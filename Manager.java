import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Manager extends Person {

    public Manager(String Fname, String Lname,  char Gender){
        super(Fname, Lname, Gender);
        
    }
    public Manager(Manager m){
        this(m.getFname(), m.getLname(),m.getGender());
    }
    public Manager(Person p){
        this(p.getFname(), p.getLname(), p.getGender());
    }
    public static void SubstitutePlayer(Manager m, Team t,int ActiveID, int SubID) throws CustomException {
        int index1=0;
        int index2=0;
        boolean a = false;
        boolean b = false;
        if (m.equals(t.getManager())){
            ArrayList<Player> p = t.getActivePlayers();
            ArrayList<Player> s = t.getSubstitutes();
            for (int i=0; i<p.size();i++){
                if (p.get(i).getNo() == ActiveID){
                    index1 = i;
                    a = true;
                    break;
                }
            }
            for (int i=0; i<s.size();i++){
                if (s.get(i).getNo() == SubID){
                    index2 = i;
                    b = true;
                    break;
                }
            }
            if (a && b){
            Player p1 = new Player(p.get(index1));
            Player p2= new Player(p.get(index2));
            p.remove(index1);
            p.add(index1, p2);
            s.remove(index2);
            s.add(index2, p1);
            t.setActivePlayers(p);
            t.setSubstitutes(s);
            }
            else throw new CustomException("ID not found");
        }
    }
    public static void SellPlayer(Manager m, Team T, int ID) throws CustomException {
        double price = 0;
        int index = 0;
        boolean found = false;
        if (m.equals(T.getManager())) {
            ArrayList<Player> s = T.getSubstitutes();
            for (int i=0; i<s.size();i++){
                if (s.get(i).getNo() == ID){
                    index = i;
                    found = true;
                    price = s.get(i).getPrice();
                    break;
                }
            }
            if (found){
                s.remove(index);
                T.addFunds(price);
            }
            else{
                throw new CustomException("ID not found");
            }
        }

    }
    
}