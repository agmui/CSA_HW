public class Del{
  public static void main(String[] args) {
     int[] l = {1,2,3,4,5};
      int n = l[1];
      int comp=1;//index of num
      for (int i = 0; i < l.length-1; i++) {
          comp ++;
          System.out.println(n==l[comp]);
          if (comp>l.length){
             comp = 0;
          }
          System.out.println(comp);
      }
     /*int n = l[0];
      for (int i: l) {
         if (n == i){
             System.out.println(1);
         }
      }*/
  }
}
