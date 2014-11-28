/**
 * 
 */
package de.szut.bremen.ita13.LetterCounter;

import java.awt.EventQueue;

/**
 * @author ita13stiefel
 *
 */
public class Main_LetterCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLetterCounter frame = new GuiLetterCounter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
