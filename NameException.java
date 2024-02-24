/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humay
 */
public class NameException extends Exception{
    private String msg;
    
    public NameException(String msg){
        this.msg = msg;
    }
    
    public String toString(){
        return msg;
    }
    
}
