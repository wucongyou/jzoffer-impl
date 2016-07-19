package com.echo.jzofferimpl;

/**
 * 矩形覆盖
 * 
 * 题目描述
 * 
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 * 解析：斐波拉契数列的变形
 */
public class RectCover {
	public int rectCover(int target) {
		if (target <= 0)
			return 0;
		if (target == 1)
			return 1;

		int fst = 1;
		int snd = 1;

		int count = 2;
		while (count <= target) {
			int tmp = fst + snd;
			fst = snd;
			snd = tmp;
			++count;
		}
		return snd;
	}
}
