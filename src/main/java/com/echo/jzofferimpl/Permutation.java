package com.echo.jzofferimpl;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 字符串的排列
 * 
 * 题目描述
 * 
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,
 * bca,cab和cba。 结果请按字母顺序输出。 输入描述: 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Permutation {
	public ArrayList<String> permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		if (str == null || str.equals(""))
			return list;
		char[] array = str.toCharArray();
		TreeSet<String> set = new TreeSet<>();
		permutation(array, 0, set);
		list.addAll(set);
		return list;
	}

	public void permutation(char[] array, int index, TreeSet<String> result) {
		if (index == array.length - 1) {
			result.add(convertCahrArrayToString(array));
		} else {
			// 放置第index个位置的字符
			for (int i = index; i < array.length; i++) {
				char tmp = array[index];
				array[index] = array[i];
				array[i] = tmp;
				permutation(array, index + 1, result);
				tmp = array[index];
				array[index] = array[i];
				array[i] = tmp;
			}
		}
	}

	public String convertCahrArrayToString(char[] array) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		return sb.toString();
	}
}
