
public class SortedSearch {

	public static int CountNumbers(int[] array, int lessThan){
		int min = 0;
		int mid = 0; 
		int max = (array.length - 1);
		
		while(min <= max){
			if(array[max] < lessThan){
				return max +1;
			}
			mid = (min + max) / 2;
			if(array[mid] < lessThan){
				min = mid + 1;
			}else{
				max = mid - 1;
			}
		}
		return mid;
	}
}
