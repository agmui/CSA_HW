package other_projects.BinSearch;

import java.util.*;

public class SeqSearch {
    public static void main(String[] args) {
        int[] l = new int[100];
        for (int i = 0; i < 100; i++) {
            l[i] = i;
        }
        for (int j = 0; j < 6; j++) {
            int key = (new Random().nextInt(100))+1;
            for (int i : l) {
                if (i == key) break;
                l[0]++;
            }
            BinSearch.binarySearch(l, 0, 99, key);
            System.out.println(100 * Math.abs(l[0]- BinSearch.COUNTER)/l[0] + "% "+((key>5)?"faster":"slower"));
            BinSearch.COUNTER=l[0]=0;
        }
    }
}
