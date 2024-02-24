/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humay
 */
public class CustomException extends Exception{
        private String s;
        public CustomException(String s){
                this.s = s;
        }
        public String toString(){
                return s;
        }
}