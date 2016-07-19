package com.echo.jzofferimpl;

/**
 * 旋转数组的最小数字
 * 
 * 题目描述
 * 
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个不减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
	/**
	 * 旋转数组的最小数字
	 * 
	 * @param array 不减数组的一个旋转（可以不旋转即自身）
	 * @return 该数组中元素的最小值（如果数组大小为0，返回0作为默认值）
	 */
	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0)
			return 0;
		int p1 = 0;
		int p2 = array.length - 1;
		if (array[p2] > array[p1])
			return array[p1];
		int mid = 0;
		while (p2 - p1 > 1) {
			mid = (p1 + p2) >> 1;
			// p1所指元素一定大于等于p2
			// 中间元素等于p1元素，且等于p2元素,无法确定在哪一部分
			if (array[mid] == array[p1] && array[mid] == array[p2]) {
				int min = array[p1];
				for (int i = p1; i <= p2; i++) {
					if (array[i] < min)
						min = array[i];
				}
				return min;
			}
			// 中间元素大于等于p1元素（此时一定大于p2元素），在 前一部分
			if (array[mid] >= array[p1])
				p1 = mid;
			// 中间元素小于等于p2元素（此时一定小于p1），在后一部分
			else if (array[mid] <= array[p2])
				p2 = mid;

		}
		return array[p2];
	}
}
