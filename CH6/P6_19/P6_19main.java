package CH6.P6_19;

import javax.swing.JFrame;

public class P6_19main {
    public static int width = 10*64;
    public static int height = 10*64;
    public static void main(String[] args) {
        int[][] board = new int[64][64];//SnakeCode.board;
        //SnakeCode.printBoard(board);

        JFrame frame = new JFrame();
        frame.setSize(width+15, height+39);
        frame.setTitle("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P6_19 testRect = new P6_19();
        frame.add(testRect);

        frame.setVisible(true);

    }
}
