
public class EquilibriumIndex {

	public static int solution(int[] A){
		long leftSum, rightSum;
		long n = A.length;
		for( int index = 0; index < n; ++index){
			leftSum = 0;
			rightSum = 0;
			for(int count = 0; count < index; count++)
				leftSum += A[count];
			for(int count = index+1;count < n; count++)
				rightSum += A[count];
			if(leftSum == rightSum)
				return index;
		}
		return -1;
	}

}
