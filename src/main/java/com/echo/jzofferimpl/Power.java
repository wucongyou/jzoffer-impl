package com.echo.jzofferimpl;

/**
 * 数值的整数次方
 * 
 * 题目描述
 * 
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {
	/**
	 * 计算一个double数的整数次方
	 * 
	 * @param base
	 *            底数
	 * @param exponent
	 *            指数
	 * 
	 * @exception RuntimeException("0的0次方无意义")
	 * @return result 结果
	 */
	public static double power(double base, int exponent) {
		double result = 1.0;

		if (exponent > 0)
			result = powerWithPositiveExponent(base, exponent);
		else if (exponent < 0)
			result = 1.0 / (powerWithPositiveExponent(base, -exponent));
		else {
			if (equlOfDouble(base, 0.0))
				throw new RuntimeException("0的0次方无意义");
		}
		return result;
	}

	/**
	 * 计算一个double数的正整数次方
	 * 
	 * @param base
	 *            底数
	 * @param exponent
	 *            指数
	 */
	private static double powerWithPositiveExponent(double base, int exponent) {
		double result = 1.0;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

	/**
	 * 判断两个double类型的数是否相等
	 * 
	 * @param num1
	 *            第一个数
	 * @param num2
	 *            第二个数
	 */
	private static boolean equlOfDouble(double num1, double num2) {
		double precision = 1e-5;
		if (num1 - num2 > -precision && num1 - num2 < precision)
			return true;
		return false;
	}
}
