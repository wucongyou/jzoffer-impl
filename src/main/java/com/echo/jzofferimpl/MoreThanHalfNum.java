package com.echo.jzofferimpl;

/**
 * 数组中出现次数超过一半的数字
 * 
 * 题目描述
 * 
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum {
	public int moreThanHalfNum_Solution(int[] array) {
		if (array.length == 0)
			return 0;
		int num = array[0];
		int pos = 1;
		int count = 1;
		for (; pos < array.length; pos++) {
			// 判断当前元素是否与上一次相同
			// 相同则count自增
			if (array[pos] == num) {
				++count;
			}
			// 不同则count自减
			//当count自减后若变成0，则更新num
			else {
				--count;
				if (count == 0) {
					num = array[pos];
					count = 1;
				}
			}
		}
		//检查找出来出现次数最多的元素是否出现次数大于一半
		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				++count;
			}
		}
		if ((count << 2) <= array.length)
			return 0;
		return num;
	}
}
