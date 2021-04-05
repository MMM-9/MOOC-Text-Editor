package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	 int size=0;
	
    // TODO: Add a constructor
	// TODO: Add a constructor
	public DictionaryLL() {
		//dict=null;
		dict = new LinkedList<String>();
	
//		size=0; 		
//	    head=new LLNode<String>(null);              
//		tail=new LLNode<String>(null);
//		head.next=tail;
//		tail.prev=head;
	}
	

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	// TODO: Implement this method
    	String w=word.toLowerCase();
    	
    	//getting a null pointer exception here
    	if(dict.isEmpty()) {
    		dict.add(w);
    		size++;
    		return true;
    	}
    	else {
    		if(!dict.contains(w)){                         	
    			dict.add(w);
    			size++;
    			return true;
    		}
    		else{
    			return false;
    		  
    		}
    	}
      //  return false;
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
      	boolean bool=false;
    //	LLNode<String> goal=head;		
      	if(dict.contains(str)){
      		bool = true;
      	}
      	else {
      		bool = false;
      	}
      	/*
		for(int i=0;i<dict.size();i++) {
			if(goal.equals(s)) {
				bool=true;
				break;
			}
			else{goal=goal.next;}				
		}	    		
        return bool;
    }*/

        return bool;
    }

    
}
