import java.util.Arrays;

public class Task25 {
    public static void main(String[] args) {
        int size = 5;
        int rows = size*2;
        int cols = size*2-1;

        int[][] arr = new int[rows][cols];

        for (int i=0; i<size; i++)
        for (int j=size-1; j<size-1+i+1; j++)
            arr[i][j] = j+1-i;

        for (int i=size; i<rows; i++)
            for (int j=i-size; j<size; j++)
                arr[i][j] = size-j+Math.abs(size-i);

        for (int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++)
                if (arr[i][j] == 0)
                    System.out.print("  ");
                else System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
