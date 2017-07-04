
public class AbsofArray {

	public static int solution(int[] A){
		long left, right;
		int result = 0;
		int N = A.length -1;
		for( int index = 0; index < N; ++index){
			left = A[index];
			right = A[N];
			result =  (int) (Math.abs(left - right) < result ? result : Math.abs(left - right));
		}
		return result;
	}

}
