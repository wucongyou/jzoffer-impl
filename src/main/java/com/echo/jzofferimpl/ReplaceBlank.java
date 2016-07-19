package com.echo.jzofferimpl;

import java.util.Arrays;

/**
 * 替换空格
 * 
 * 题目描述
 * 
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceBlank {

	public static String replaceSpace(StringBuffer str) {
		if (str == null)
			return null;
		if (str.length() == 0)
			return "";
		int oldStrLength = str.length();// 原始字符串长度
		int countOfSpace = 0;// 原始字符串空格个数
		// 计算空格个数
		for (int i = 0; i < oldStrLength; i++) {
			if (str.charAt(i) == ' ') {
				++countOfSpace;
			}
		}
		int newStrLength = oldStrLength + (countOfSpace << 1);//转换后的新字符串的长度
		char[] newStr = new char[newStrLength];//转换后的字符数组
		int p1 = oldStrLength - 1;
		int p2 = newStrLength - 1;
		char c;
		while (p1 >= 0) {
			if ((c = str.charAt(p1)) == ' ') {
				newStr[p2--] = '0';
				newStr[p2--] = '2';
				newStr[p2--] = '%';
			} else {
				newStr[p2--] = c;
			}
			--p1;
		}
		StringBuffer sb = new StringBuffer();
		sb.append(newStr);
		return sb.toString();
	}
}
