package com.echo.jzofferimpl;

/**
 * 斐波那契数列
 * 
 * 指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、
 * 
 * 题目描述
 * 
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。 n<=39
 * 
 */
public class Fibonacci {

	/**
	 * 斐波那契数列递归实现
	 */
	public static int fibonacci_Recursively(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		return (fibonacci_Recursively(n - 1) + fibonacci_Recursively(n - 2));
	}

	/**
	 * 斐波那契数列非递归实现
	 */
	public static int fibonacci_Iterately(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;

		int count = 2;
		int fst = 0;
		int snd = 1;
		while (count <= n) {
			int tmp = fst + snd;
			fst = snd;
			snd = tmp;
			++count;
		}
		return snd;
	}
}
