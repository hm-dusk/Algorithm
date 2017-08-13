package sort.algorithm;

/**
 * 冒泡排序
 * Created by liming on 2017/8/13
 */
public class BubbleSort {
	static int[] bubbleSort() {
		//int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
		int a[] = {4, 2, 3, 1};

		for (int i = a.length - 1; i > 0; i--) {
			//比较前面多少位
			for (int j = 0; j < i; j++) {
				//从第一位开始，把大的数往后冒
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		for (int a : bubbleSort()) {
			System.out.println(a);
		}
	}
}
