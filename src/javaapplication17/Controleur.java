/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Douglas Kamseu
 */
public class Controleur  implements ActionListener {
    
    Modele refModl;
	
	public Controleur(Modele m) {
		this.refModl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incrémente();
	}
}
