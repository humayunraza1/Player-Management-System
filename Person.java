import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String Fname;
    private String Lname;
    private char Gender;
    public Person(String Fname, String Lname, char Gender){
        this.Fname = Fname;
        this.Lname = Lname;
        this.Gender = Gender;
    }
    public Person(Person a){
        this(a.Fname, a.Lname, a.Gender);
    }

    public boolean equals(Person p){
        if (p.Fname == Fname && p.Lname == Lname && p.Gender == Gender){
            return true;
        } else return false;
    }
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public String getName(){
        return (Fname + " " + Lname);
    }
    public char getGender(){
        return Gender;
    }
    public String toString(){
        return ("Name: "+Fname + " " + Lname + "\n Gender: "+Gender);
    }

    
}