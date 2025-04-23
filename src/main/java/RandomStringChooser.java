import java.util.*;
public class RandomStringChooser {
private Arraylist<String> words;
  public RandomStringChooser(String[] input) {
    words = new ArrayList<String>();
    for(int i i = 0; i < input.length; i++) {
      words.add(i);
    }
  }
  public String getNext() {
    if(words.size() == 0) {
      return "NONE";
    }
    int index = (int)(Math.random()*words.size());
    return words.remove(index);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
