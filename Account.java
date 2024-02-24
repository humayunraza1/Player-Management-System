/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humay
 */
import java.util.ArrayList;

public class Account {
    private  ArrayList<User> users = new ArrayList<User>();
    public void SignUp(User p){
        boolean found = false;
        for (int i=0; i< users.size(); i++){
            if (users.get(i).getUsername().equals(p.getUsername())){
                found = true;
                break;
            }
        }
        if (!found){
            users.add(p);
        }
        else if (found){
            // Redirects back to signup page saying user already exists
//            throw new CustomException("User already exists");
            return;
        }
    }
    
    public ArrayList<User> getUsers(){
        return users;
    }
    
    public boolean login(String username, String IPassword) {
        int index = 0;
        boolean found = false;
        for (int i=0; i< users.size(); i++){
            if (users.get(i).getUsername().equals(username)){
                found = true;
                index = i;
                break;
            }
        }
        if (found && users.get(index).Password.equals(IPassword)){
            //LOGIN ACTION PERFORMED
            return true;
        }
        else if (!found && !users.get(index).Password.equals(IPassword)){
            // Either username incorrect or password
//            throw new CustomException("Incorrect User or Password. Try again");
        return false;
        }
        return false;
    }
}
