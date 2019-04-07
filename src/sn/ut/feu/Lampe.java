/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ut.feu;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
 

/**
 *
 * @author Haby Doumbia
 */
public class Lampe extends JPanel{
 
	private static final long serialVersionUID = 1L;
	//attribut
	 
	     int a,b,c,d;
	    Color couleur;
	 
	 
	   Lampe(Color couleur,int a,int b,int c,int d){
	     //constructeur
	    this.couleur=couleur;
	    this.a=a;
	    this.b=b;
	    this.c=c;
	    this.d=d;
	    }
	 
	 
	    //Allumer la lampe rouge
	       public void allumerRouge(){
	          couleur=Color.RED;
	       }
	 
	      //Allumer la lampe verte
	       public void allumerVert(){
	           couleur=Color.GREEN;
	       }
	 
	      //Allumer la lampe orange
	       public void allumerOrange(){
	           couleur=Color.ORANGE;
	        }
	 
	       //Eteindre la lampe rouge
	       public void eteindreRouge(){
	           couleur=new Color(100,0,0);
	       //Eteindre la lampe verte
	        }
	       public void eteindreVert(){
	           couleur=new Color(10,80,10);
	       //Eteindre la lampe orange
	        }
	       public void eteindreOrange(){
	           couleur=new Color(200,120,50);
	 
	      }
	}



