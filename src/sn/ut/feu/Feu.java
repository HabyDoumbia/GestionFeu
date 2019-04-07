/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ut.feu;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Haby Doumbia
 */
public class Feu extends JPanel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//attribut
    Lampe lampe1,lampe2,lampe3;
    int a,b,c,d;
 
 
 
     //le dessin du feu tricolor
 
        @Override
   public void paintComponent(Graphics G){
       
       //      super.paintComponent(int,int,int,int);
        G.setColor(Color.BLACK);
        //dessin du rectangle noir
        G.fillRect(a,b,c,d);
        // dessin de la première lampe
        // definition de la couleur de la lampe 1
        G.setColor(lampe1.couleur);
        //definir le cercle (la lampe)
        G.fillOval(lampe1.a,lampe1.b,lampe1.c,lampe1.d);
        G.setColor(lampe2.couleur);
        G.fillOval(lampe2.a,lampe2.b,lampe2.c,lampe2.d); 
        G.setColor(lampe3.couleur);
        G.fillOval(lampe3.a,lampe3.b,lampe3.c,lampe3.d);
        G.setColor(lampe3.couleur);
 
 
    }
 
    //constructeur
       Feu(int a, int b,int c,int d){
           this.a=a;
           this.b=b;
           this.c=c;
           this.d=d;
           Lampe lampe1=new Lampe (Color.RED,a+10,b+20,c-20,c-20);
           Lampe lampe2=new Lampe (Color.ORANGE,a+10,b+80,c-20,c-20);
           Lampe lampe3=new Lampe (Color.GREEN,a+10,b+140,c-20,c-20);
 
       }
 
 
 
          public static void showOnFramem(JComponent component, String frameName) {
        JFrame frame = new JFrame(frameName);
        WindowAdapter wa = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        frame.addWindowListener(wa);
        frame.getContentPane().add(component);
        frame.pack();
        frame.setVisible(true);
        }
          
}


    


