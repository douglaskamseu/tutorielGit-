/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observer;


/**
 *
 * @author Douglas Kamseu
 */
public class JavaApplication17 extends Frame implements WindowListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		new JavaApplication17();
	}
	
	public JavaApplication17() {
		super();
		this.addWindowListener(this);
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver((Observer) vue);
		vue.addActionListener(ctrl);
		this.setTitle("Git GIT");
		this.add(vue);
		this.pack();
		this.setVisible(true);
                setLocationRelativeTo(null);
	}

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) { }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    }
    
