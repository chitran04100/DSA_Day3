package TheFeast;

import java.util.Scanner;

public class TheFeast {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bobby's initial amount of money: ");
		int money = scanner.nextInt();

		System.out.println("One chocolate bar costs: ");
		int oneBarCost = scanner.nextInt();

		System.out.println("The number of wrappers can turn in for a free bar: ");
		int wrapper = scanner.nextInt();

		System.out.println("The amount of chocolate that Bobby owns is " + theFeast(money, oneBarCost, wrapper));

	}

	public static int theFeast(int money, int oneBarCost, int wrapper) {
		int chocolate = money / oneBarCost;
		int chocolateCount = chocolate;

		while (chocolate >= wrapper) {
			int chocolateTrade = chocolate / wrapper;
			int chocolateTradeSpare = chocolate % wrapper;
			chocolate = chocolateTrade + chocolateTradeSpare;

			chocolateCount += chocolateTrade;
		}

		return chocolateCount;
	}
}
