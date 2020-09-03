import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        char ar[]={'x','y','z'};
        System.out.println("Enter the number of employees");
        int n = in.nextInt();  // number of employees
        int cordinates[][] = new int[3][n]; // cordinates of employees
        System.out.println("Enter the position of cubicles in space separated format");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++)
                cordinates[j][i] = in.nextInt();
        }
        System.out.println("Position of cubicles sorted in ascending order is:");
        for (int i = 0; i < 3; i++) {
            Arrays.sort(cordinates[i]);
            System.out.println(ar[i]+"-> "+Arrays.toString(cordinates[i]));
        }
        int opta=cordinates[0][n/2];
        int optb=cordinates[1][n/2];
        int optc=cordinates[2][n/4];
        System.out.println("An Optimal point is");
        System.out.println(opta + " " + optb + " " + optc);
    }

}
