package sort.algorithm;

/**
 * 希尔排序
 * <p>
 * Created by liming on 2017/8/10
 */
public class ShellSort {
	//	private static int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
	private static int a[] = {4, 2, 3, 1};

	public static int[] shellSort() {
		int a[] = {4, 2, 3, 1};
		double d1 = a.length;
		int temp = 0;
		while (true) {
			//算出每一轮的增量
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;

			for (int x = 0; x < d; x++) {//该循环取得每个需要进行直接插入排序的数组，x为原始数组中的脚标，代表每个组中提取的第几个元素来组成新的分组进行排序
				for (int i = x + d; i < a.length; i += d) {//该循环为直接插入排序（只是排序的目标数组变成了角标相差为d的数所组成的数组）
					int j = i - d;
					temp = a[i];

					for (; j >= 0 && temp < a[j]; j -= d) {//直接插入排序的算法，只是将直接插入排序的1抽象为了d
						a[j + d] = a[j];        //将需要排序的组中大于temp的向后移（移动单位为d）
					}
					a[j + d] = temp;    //将temp放到它应该在的位置
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
