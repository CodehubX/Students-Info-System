/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

/**
 *
 * @author Viraj Dissanayake
 */
public class Start_screen_Class {
    public static void main(String[] args){
        Start_screen sc=new Start_screen();
        sc.setVisible(true);
        Welcome w=new Welcome();
    for(int i=0; i<=100; i++){
                 try {
                    Thread.sleep(50);
                    if(i==100){
                      sc.setVisible(false);
                      w.setVisible(true);
                      
                    }
                  } catch (Exception ex) {
                }
    }
}
}
