package arrays;

import java.util.Arrays;

public class PrintDmultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,20,7}, {3,7,11}, {5,67,7}};
		//This function works for  3-dimensional arrays as well.
        System.out.println(Arrays.deepToString(array));
        //byte b=10;
        int columnNum=0;
        int minNum=0;
        int maxNum=0;
        for(int i=0;i<3;i++)
        {
        	 for(int j=0;j<3;j++)
        	 {
        		if(array[i][j]<=minNum)
        		{
        			minNum=array[i][j];
        			columnNum=j;
        		}
        	 }
        }
        System.out.println("minNum "+minNum);
        System.out.println(columnNum);
        for(int k=0;k<3;k++)
        {
        	if(array[k][columnNum]>maxNum)
        	{
        		maxNum=array[k][columnNum];
        	}
        }
        System.out.println("maxNum "+maxNum);
	}
}
