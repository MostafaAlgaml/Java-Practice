import java.util.*;
public class isSequence {

	public static boolean isSequence(int[][]m){
		boolean F=true;
		for(int i=0;i<m.length;i++){
			if(m[i].length!=i+1){
				F=false;
			}
		}
			for(int i=0;i<m.length;i++){
				for(int j=0;j<m[i].length-1;j++){
					if(m[i][j]!=m[i][j+1]){
						F=false;
					}
				}
			}
			return F;

		}


    public static void main(String[] args) {

    	int[][] test1 = {{1}};
        int[][] test2 = {{1}, {2, 2}};
        int[][] test3 = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        int[][] test4 = {{1}, {2, 2}, {3, 3, 3, 3}};
        int[][] test5 = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 3, 4}};

        System.out.println(isSequence(test1)); // true
        System.out.println(isSequence(test2)); // true
        System.out.println(isSequence(test3)); // true
        System.out.println(isSequence(test4)); // false
        System.out.println(isSequence(test5)); // false
    }
}
