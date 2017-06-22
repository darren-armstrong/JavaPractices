import java.util.HashMap;

public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {
        if(list == null || list.length < 2){
        	return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int index = 0; index < list.length; index++){
        	map.put(list[index], index);
        }
        for (int count = 0; count < list.length; count++){
        	int diff = sum - list[count];
        	if(map.containsKey(diff) && count != map.get(diff)){
        		return new int[] {count, map.get(diff)};
        	}
        }
        return null;
    }
}
