package sort.algorithm;

/**
 * 希尔排序
 * <p>
 * Created by liming on 2017/8/10
 */
public class ShellSort {
	private static int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
//	private static int a[] = {4, 2, 3, 1};

	public static int[] shellSort() {
		double d1 = a.length;
		int temp = 0;
		while (true) {
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i += d) {
					int j = i - d;
					temp = a[i];

					for (; j >= 0 && temp < a[j]; j -= d) {
						a[j + d] = a[j];
					}
					a[j + d] = temp;
				}
			}
			if (d == 1) {
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
//		System.out.println(5/2);
//		System.out.println(Math.ceil(5/2));
		for (int a : shellSort()) {
			System.out.println(a);
		}

	}
}
