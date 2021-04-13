package other_projects.RecursionAssignment;

public class ColorGrid {
    private String[][] myPixels;
    private int myRows;
    private int myCols;

    /*
    Creates numRows by numCols Colorgrid from string s
    @param s string contating colors for the grid
     */
    public ColorGrid(String s, int numRows, int numCols){
        myPixels = new String[numCols][numRows];
        myRows = numRows;
        myCols = numCols;
        int count=0;
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                myPixels[i][j] = s.substring(count, count+1);
                count++;
            }
        }
    }
    public void paintRegion(int row, int col, String newColor, String oldColor){
        if (newColor.equals(myPixels[col][row])){
            return;
        }
        printGrid();
        if (row > 0 && myPixels[col][row - 1].equals(oldColor)) {//left
           myPixels[col][row] = newColor;
           this.paintRegion(row-1, col, newColor, oldColor);
        }
        if (row<myRows-1&&myPixels[col][row + 1].equals(oldColor)) {//right
            myPixels[col][row] = newColor;
            this.paintRegion(row+1, col, newColor, oldColor);
        }
        if (col>0&&myPixels[col - 1][row].equals(oldColor)) {//up
            myPixels[col][row] = newColor;
            this.paintRegion(row, col-1, newColor, oldColor);
        }
        if (col<myCols -1&& myPixels[col + 1][row].equals(oldColor)) {//down
            myPixels[col][row] = newColor;
            this.paintRegion(row, col+1, newColor, oldColor);
        }
        myPixels[col][row] = newColor;
    }
    public void printGrid(){
        for (String[] myPixel : this.myPixels) {
            for (String s : myPixel) {
                System.out.print(s + ' ');
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String x =
                "rrbgyy" +
                "brbyrr" +
                "ggrrrb" +
                "yrryrb";
        ColorGrid test = new ColorGrid(x, 6, 4);
        test.paintRegion(2,3,"b","r");
        test.printGrid();
    }
}
