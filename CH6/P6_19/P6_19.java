package CH6.P6_19;

import javax.swing.JComponent;
import java.awt.*;


public class P6_19 extends JComponent {
    public void paintComponent(Graphics g){
        int[][] board = new int[64][64];
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((j+i)%2 == 0){
                    g2.setColor(Color.BLACK);
                } else {
                    g2.setColor(Color.WHITE);
                }
                Rectangle box1 = new Rectangle(i*10, j*10, 10,10);
                g2.fill(box1);
            }
        }
    }
}