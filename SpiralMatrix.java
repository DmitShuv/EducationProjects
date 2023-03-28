import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] a = new int[row][col];
        int minRow = 0, minCol = 0, maxRow = row - 1, maxCol = col - 1;
        int count = 1, max = row*col;
        while(count <= max){
            for(int i = minCol; i <= maxCol; i++){
                a[minRow][i] = count;
                count++;
            }
            minRow+=1;
            for(int i = minRow; i <= maxRow; i++){
                a[i][maxCol] = count;
                count++;
            }
            maxCol-=1;
            for(int i = maxCol; i >= minCol; i--){
                a[maxRow][i] = count;
                count++;
            }
            maxRow-=1;
            for(int i = maxRow; i >= minRow; i--){
                a[i][minCol] = count;
                count++;
            }
            minCol+=1;
        }
        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
