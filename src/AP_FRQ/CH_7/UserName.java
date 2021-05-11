import java.util.*;
public class UserName{
  private ArrayList<String> possibleNames = new ArrayList<String>();
  public UserName(String firstName, String lastName)  {
    for(int i = 1; i < firstName.length()+1; i++){
      possibleNames.add(lastName+firstName.substring(0,i));
    }
  }
  public boolean isUsed(String name, String[] arr){
      return possibleNames.contains(arr);
  }
  public void setAvailableUserNames(String[] usedNames){
    for (String i : usedNames) {
      if (this.isUsed("hi", usedNames)) {
        possibleNames.remove(i);
      System.out.println(i);}
    }
  }
   public static void main(String[] args) {
     UserName test = new UserName("firstName", "lastName");
     String[] used = {"harta", "hartm", "harty"};	
     test.setAvailableUserNames(used);
   }
}
