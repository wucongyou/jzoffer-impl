package com.echo.jzofferimpl;

/**
 * 跳台阶
 * 
 * 题目描述
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor {
	public static int jumpFloor(int target) {
		if (target <= 0)
			return 0;
		if (target == 1)
			return 1;

		int count = 2;
		int twoStep = 1;// 通过跳二阶
		int oneStep = 1;// 通过跳一阶

		while (count <= target) {
			int tmp = oneStep + twoStep;
			twoStep = oneStep;
			oneStep = tmp;
			++count;
		}
		return oneStep;
	}
}
