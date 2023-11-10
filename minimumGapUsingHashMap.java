package MinimumGap;

import java.util.HashMap;
import java.util.Map.Entry;

public class minimumGapHashMap {
	public static void main(String[] args) {
		int[] array = { 7, 1, 3, 4, 1, 7};

		System.out.println("Minimum gap in a list is " + findMinimumGap(array));
	}

	public static int findMinimumGap(int[] numbers) {
		HashMap<Integer, Integer> valuePositionPair = new HashMap<>();

		int minGap = Integer.MAX_VALUE;
		int previousIndex = 0, nextIndex = 0;
		int valueGap;

		for (int i = 0; i < numbers.length; i++) {

			if (valuePositionPair.containsKey(numbers[i])) {

				nextIndex = i;

				for (Entry<Integer, Integer> entry : valuePositionPair.entrySet()) {
					if (entry.getValue() == numbers[i]) {
						previousIndex = entry.getKey();
					}
				}
				valueGap = nextIndex - previousIndex;
				minGap = Math.min(minGap, valueGap);
			}

			valuePositionPair.put(numbers[i], i);

		}

		if (minGap == Integer.MAX_VALUE) {
			return -1;
		}
		return minGap;
	}
}