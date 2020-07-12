package 题库.寻找两个正序数组的中位数;

public class solution {
	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int nums2[] ={ 1, 5, 10, 16 };
		double i=findMedianSortedArrays(nums, nums2);
        System.out.print(i);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int[] num = new int[m + n];
		int count = 0;
		double mid = 0;
		int i = 0, j = 0;
		while (count != (m + n)) {
			if (nums1[i] < nums2[j]) {
				num[count++] = nums1[i++];
			} else {
				num[count++] = nums2[j++];
			}
			if (i == m) {
				while (j != n) {
					num[count++] = nums2[j++];
				}
				break;
			}
			if (j == n) {
				while (i != m) {
					num[count++] = nums1[i++];
				}
				break;
			}

		}

		if (count % 2 == 0) {
			int a = num[count / 2 - 1];
			int b = num[count / 2];
			mid = (a + b) / 2.0;
		} else {
			mid = num[count / 2];
		}
		return mid;
	}

}
