
public class MergeRec {

    public static void MergeRec(int[]a,int i,int[]b,int j){
    if(i>=a.length && j>=b.length)
    	return;
    	if(i<a.length)
			System.out.print(a[i]+" ");
		if(j<b.length)
			System.out.print(b[j]+" ");
		  MergeRec(a,i+1,b,j+1);
    }

    public static void main(String[] args) {
		int[] arrayA1 = {1, 3, 5};
        int[] arrayB1 = {2, 4, 6,};
        System.out.print("Test 1 (Equal Length): ");
        MergeRec(arrayA1, 0, arrayB1, 0);
        System.out.println();

        int[] arrayA2 = {10, 30};
        int[] arrayB2 = {20, 40, 50, 60};
        System.out.print("Test 2 (A is shorter): ");
        MergeRec(arrayA2, 0, arrayB2, 0);
        System.out.println();

        // Test Case 3: Array A is longer than Array B
        int[] arrayA3 = {100, 300, 500, 700};
        int[] arrayB3 = {200, 400};
        System.out.print("Test 3 (A is longer) : ");
        MergeRec(arrayA3, 0, arrayB3, 0);
        System.out.println();


    }
}
