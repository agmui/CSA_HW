package AP_FRQ.CH_7;

import java.util.*;
public class UserName{
      private ArrayList<String> possibleNames = new ArrayList<String>();
      public UserName(String firstName, String lastName)  {
          for(int i = 1; i < firstName.length()+1; i++){
              possibleNames.add(lastName+firstName.substring(0,i));
          }
      }
      public boolean isUsed(String name, String[] arr){
          for (String i : arr){
              if(i.equals(name)) return true;
          }
          return false;
      }
      public void setAvailableUserNames(String[] usedNames){
          for (int i = 0; i < possibleNames.size(); i++) {
              if (this.isUsed(possibleNames.get(i), usedNames)) {
                  System.out.println(possibleNames.get(i));
                  possibleNames.remove(possibleNames.get(i));
              }
          }
      }
       public static void main(String[] args) {
          UserName test = new UserName("mary", "hart");
          String[] used = {"harta", "hartm", "harty"};
          test.setAvailableUserNames(used);
      }
}
