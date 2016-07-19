package com.echo.jzofferimpl;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 
 * 题目描述
 * 
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
	public void reOrderArray(int[] array) {
		int[] newArray = new int[array.length];
		int p1 = 0;
		int p2 = 0;
		// 遍历原数组
		// 将奇数复制到原数组
		// 将偶数放在新数组
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				array[p1++] = array[i];
			} else {
				newArray[p2++] = array[i];
			}
		}
		for (int i = 0; i < p2; i++) {
			array[p1++] = newArray[i];
		}
	}
}
