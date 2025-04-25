import java.util.*;
public class RandomStringChooser {
//use ArrayList so it can be changed in size
private ArrayList<String> words;
  public RandomStringChooser(String[] input) {
    //actually initialize the ArrayList + add all elements from the given array into the ArrayList
    words = new ArrayList<String>();
    for(int i = 0; i < input.length; i++) {
      words.add(input[i]);
    }
  }
  //returns a random string in the list or returns "NONE" if the index has no string
  public String getNext() {
    //no string to pick
    if(words.size() == 0) {
      return "NONE";
    }
    int index = (int)(Math.random()*words.size()); //random number from 0 to the size of the ArrayList
    return words.remove(index); //removes the string 
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
