import java.util.*;
public class Matrixadd {

	public static int[][]add(int[][]a,int[][]b){
		int c[][]=new int[3][3];

		for (int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){


				c[i][j]=a[i][j]+b[i][j];
		}
		}

	return c;
	}

	public static boolean isequal(int[][]a,int[][]b){
		boolean F=true;
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				if(a[i][j]!=b[i][j]){
					F=false;
					return F;

				}
			}
		}
		return F;
	}


    public static void main(String[] args) {
    	int[][]a={
    	{1,1,1},
    	{1,1,1},
    	{1,1,1},
    	};
    	int[][]b={
    	{1,1,1},
    	{1,1,1},
    	{1,1,1},
    	};
    	int[][]k={
    	{2,2,2},
    	{2,2,2},
    	{2,2,2},
    	};
    	int c[][]=add(a,b);

    	if(isequal(c,k)==true){
    		System.out.println("K IS THE SUM OF A AND B");
    	}

    	}
}



