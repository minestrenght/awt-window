package org.lotus;

import java.awt.Window;
import java.awt.EventQueue;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Window w = new Window(null);
				w.setSize(300, 200); //width, height
				w.setLocationRelativeTo(null); //put in center of screen
				w.setVisible(true); //show to the user
				System.out.println("Press ctrl + c to exit");
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
