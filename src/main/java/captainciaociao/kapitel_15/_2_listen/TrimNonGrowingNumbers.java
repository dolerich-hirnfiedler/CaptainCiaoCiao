package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class TrimNonGrowingNumbers {
	
	static void trimNonGrowingNumbers(List<Double> numbers) {
		// Double biggestNumber = numbers.get(numbers.size() - 1);
		// for (int i = numbers.size() - 2; i > 0; i--) {
		// if (numbers.get(i) <= biggestNumber) {
		// biggestNumber = numbers.get(i);
		// } else if (numbers.get(i) > biggestNumber) {
		// numbers.remove(i + 1);
		// biggestNumber = numbers.get(i);
		// }
		// }
		
		// TODO finish ending indizes
		int index = numbers.size() - 1;
		
		for (int i = 0; i < numbers.size() - 2; i++) {
			if (numbers.get(i + 1) < numbers.get(i)) {
				index = i;
				break;
			}
		}
		for (int j = numbers.size() - 1; j > index; j--) {
			numbers.remove(j);
		}
	}
	
	public static void main(String[] args) {
		System.out.printf("%s%n%n", "First Test: ");
		double[] arr = {1, 2, 3, 4, 5};
		List<Double> list1 = new ArrayList<>(DoubleStream.of(arr).boxed().toList());
		
		trimNonGrowingNumbers(list1);
		for (Double num : list1) {
			System.out.printf("%s %n", num);
		}
		
		System.out.println("Second Test: \n");
		
		double[] arr1 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		List<Double> list2 = new ArrayList<>(DoubleStream.of(arr1).boxed().toList());
		
		trimNonGrowingNumbers(list2);
		for (Double num : list2) {
			System.out.printf("%s %n", num);
		}
		
	}
}
