package arrays;

import java.util.Arrays;

public class PrintMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[][][] a = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8,9 } }, { { 12, 23 }, { 54, 24,9 } }  };
		System.out.println(Arrays.deepToString(a));
		
		for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                for (int z = 0; z < a[i][j].length; z++)
                    System.out.println("arr[" + i
                                       + "]["
                                       + j + "]["
                                       + z + "] = "
                                       + a[i][j][z]);
	}

}
