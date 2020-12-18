package CH4;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class P4_3 {
    public static void main(String[] args) {
        double[] l = {0,0,0,1,1,0};
        for (int i = 0; i < 6; i++) {
            l[i] = new Scanner(System.in).nextInt();
        }
        double len0 = Point2D.distance(l[0],l[1],l[2],l[3]), len1 = Point2D.distance(l[2],l[3],l[4],l[5]), len2 = Point2D.distance(l[0],l[1],l[4],l[5]);
        System.out.println("len1: "+ len0 +" len2: "+ len1 +" len3: "+ len2);

        double deg1 = Math.acos((Math.pow(len0,2)-Math.pow(len1,2)-Math.pow(len2,2))/(-2*len1*len2));
        double deg2 = Math.asin(len1*Math.sin(deg1)/len0);
        System.out.println("deg1: "+Math.toDegrees(deg1)+" deg2 "+Math.toDegrees(deg2)+" deg3 "+Math.toDegrees(Math.PI-(deg1+deg2)));

        System.out.println("perimeter: "+(len0+len1+len2));
        System.out.println("area: "+.5*len1*len2*Math.sin(deg1));
    }
}
