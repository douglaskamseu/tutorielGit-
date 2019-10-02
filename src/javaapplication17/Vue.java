/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.awt.Button;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Douglas Kamseu
 */
public class Vue extends Button implements Observer{
    public Vue() {
		super();
		this.setLabel("0");
		this.setPreferredSize(new Dimension(120,50));
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setLabel((String)arg);
	}
}
