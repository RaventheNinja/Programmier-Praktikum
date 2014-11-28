/**
 * 
 */
package de.szut.bremen.ita13.LetterCounter;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author ita13stiefel
 *
 */
public class LetterCounter {
	private String filename;
	
	LetterCounter(){
		
	}
	
	LetterCounter(String filename){
		
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public void parseFile() {
		
	}
	
	public SortedMap<Character, Integer> getStats() {
		SortedMap<Character, Integer> countsOfChars = new TreeMap<Character, Integer>();
		return countsOfChars;
	}
	
	public void showStats(){
		
	}
}
