package spelling;

import java.util.TreeSet;

/**
 * @author UC San Diego Intermediate MOOC team
 *
 */
public class DictionaryBST implements Dictionary 
{
   private TreeSet<String> dict;
   
   
   int size;
	
    // TODO: Implement the dictionary interface using a TreeSet.  
 	// You'll need a constructor here
   public DictionaryBST() {
	   dict = new TreeSet<String>();
   }
   
	
    
    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	// TODO: Implement this method
    	//Object 
    	String w =word.toLowerCase();
    	if(dict.isEmpty()) {
    		dict.add(word.toLowerCase());
    		size++;
    		return true;
    	}
    	else {
    		if(!dict.contains(w)){                         	
    			dict.add(word.toLowerCase());
    			size++;
    			return true;
    		}
    		else{
    			return false;
    		  
    		}
    	}
    	
    	
       // return false;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
    	// TODO: Implement this method
        return size;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	//TODO: Implement this method
    	String str = s.toLowerCase();
    	if(dict.contains(str)) {
    		return true;
    	}
    	else {
    		return false;
    		
    	}
    }
}


