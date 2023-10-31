package MinimumGap;

import java.util.Arrays;
import java.util.List;

public class MinimumGap {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(7, 1, 3, 4, 1, 7);

		System.out.println("Minimum gap in a list is " + findMinimumGap(arr));
	}

	public static int findMinimumGap(List<Integer> listInt) {
		int minGap = Integer.MAX_VALUE;
		int gap;
		
		for (int i = 0; i < listInt.size() - 1; i++) {
			for (int j = i + 1; j < listInt.size() - 1; j++) {
				if (listInt.get(i) == listInt.get(j)) {
					gap = j - i;
					minGap = Math.min(minGap, gap);
				}
			}
		}
		if (minGap == Integer.MAX_VALUE) {
			return -1;
		}
		return minGap;
	}
}