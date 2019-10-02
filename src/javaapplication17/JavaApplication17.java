/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication17;

import java.awt.Frame;
import java.util.Observer;


/**
 *
 * @author Douglas Kamseu
 */
public class JavaApplication17 extends Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		new JavaApplication17();
	}
	
	public JavaApplication17() {
		super();
		
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver((Observer) vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git");
		this.add(vue);
		this.pack();
		this.setVisible(true);
	}
    }
    
