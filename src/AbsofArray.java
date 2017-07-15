
public class AbsofArray {

	public static long solution(int[] A){
		long left, right;
		long result = 0;
		int N = A.length -1;
		for( int index = 0; index < N; ++index){
			left = A[index];
			right = A[N];
			result =  Math.abs(left - right) < result ? result : Math.abs(left - right);
		}
		return result;
	}

}
