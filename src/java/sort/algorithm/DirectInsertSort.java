package sort.algorithm;

/**
 * 直接插入排序
 *
 * Created by liming on 2017/8/9
 */
public class DirectInsertSort {
	//	private static int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
	private static int a[] = {4, 2, 3, 1};

	public static int[] insertSort() {
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			//第一次i是第二个元素，第一次是第二个元素和前面比较
			int j = i - 1;
			//temp为当前需要插入的元素
			temp = a[i];
			//j为temp之前的一个元素
			for (; j >= 0 && temp < a[j]; j--) {//如果j还指向数组中的元素（大于等于0），且大于temp
				a[j + 1] = a[j];          //将大于temp的值整体后移一个单位
			}
			a[j + 1] = temp;              //最后将temp放到自己应该存在的位置
		}
		return a;
	}

	public static void main(String[] args) {
		for (int a : insertSort()) {
			System.out.println(a);
		}
	}
}
