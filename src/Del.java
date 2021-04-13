import java.awt.*;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Del{
    public static void main(String[] args) {
        int x = 0;
        for(int i = 0, j = 10; i < 10 && j < 20; i++, j++){
            x++;
        }
        System.out.println(x);
    }
}