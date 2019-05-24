import java.util.HashMap;

public class ApSeries {
	public static void main(String[] args) {
		
		new Prac().getA();

		int[] arr = { 1, 2, 1, 2, 1, 3, 2 };
		int n = 7;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			int frequency = map.get(arr[i]);

			if (frequency == 0) {

				map.put(arr[i], 1);

			} else {

				map.put(arr[i], frequency + 1);

			}

		}

		int pairs = 0;
		for (int frequency : map.values()) {

			if (frequency >= 2) {

				pairs++;

			}

		}

		System.out.println(pairs);
	}

}