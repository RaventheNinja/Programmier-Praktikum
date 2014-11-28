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
	private int countedLetters;
	private  SortedMap<Character, Integer> lettersCountedMap = new TreeMap<Character, Integer>();
	
	
	public LetterCounter(){
		
	}
	
	public LetterCounter(String filename){
		this.filename = filename;
	}
	
	/**
	 * @return the countedLetters
	 */
	public int getCountedLetters() {
		return countedLetters;
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
		return lettersCountedMap;
	}
	
	private void initResultVectorAndMap (){
		
	}
	
	public void showStats(){
		
	}
}
