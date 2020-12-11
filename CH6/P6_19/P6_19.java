package CH6.P6_19;

import javax.swing.JComponent;
import java.awt.*;



public class P6_19 extends JComponent {
    public static Color grey = new Color(50, 50, 50);
    public static Color lgrey = new Color(110, 110, 110);
    public void paintComponent(Graphics g){
        int[][] board = new int[64][64];//SnakeCode.board;
        Graphics2D g2 = (Graphics2D) g;
        Rectangle background = new Rectangle(0, 0, P6_19main.width,P6_19main.height);
        g2.setColor(grey);
        g2.fill(background);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0){
                    g2.setColor(lgrey);
                } else {
                    g2.setColor(Color.WHITE);
                }
                Rectangle box1 = new Rectangle(i*10, j*10, 9,9);
                g2.fill(box1);
            }
        }
    }
}
