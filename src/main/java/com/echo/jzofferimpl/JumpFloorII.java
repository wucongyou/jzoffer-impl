package com.echo.jzofferimpl;

/**
 * 变态跳台阶
 * 
 * 题目描述
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII {
	public static int jumpFloorII(int target) {
		if (target <= 0)
			return 0;
		if (target == 1)
			return 1;

		int[] array = new int[target + 1];

		for (int i = 0; i <= target; i++) {
			array[i] = 0;
		}
		array[0] = 1;
		array[1] = 1;
		int count = 2;
		// 求count阶次数
		for (int i = count; i <= target; i++) {
			System.out.println("i=" + i);
			// 第i阶次数（从count-1阶跳一阶+···+从0阶跳n阶）
			// 即array[i]=array[0]+array[1]+array[2]+···+array[i-2]+array[i-1]
			// 数学归纳法推导出：array[i]=2*array[i-1]
			array[i] = array[i - 1] << 1;
		}
		return array[target];
	}
}
