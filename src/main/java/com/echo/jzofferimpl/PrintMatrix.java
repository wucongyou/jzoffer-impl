package com.echo.jzofferimpl;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * 
 * 题目描述
 * 
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14
 * 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int rows = matrix.length;
		int cols = matrix[0].length;
		int numOfCircle = ((rows < cols ? rows : cols) + 1) >> 1;

		int maxScopeX = cols - 1;
		int maxScopeY = rows - 1;

		int count = 0;
		while (count < numOfCircle) {
			// 向右走
			for (int i = count; i <= maxScopeX; i++) {
				list.add(matrix[count][i]);
			}
			// 向下走
			for (int i = count + 1; i <= maxScopeY; i++) {
				list.add(matrix[i][maxScopeX]);
			}
			// 向左走
			// 当至少两行的时候才能向左走
			if (maxScopeY - count > 0)
				for (int i = maxScopeX - 1; i >= count; i--) {
					list.add(matrix[maxScopeY][i]);
				}
			// 向上走
			// 当至少两列的时候才能向上走
			if (maxScopeX - count > 0)
				for (int i = maxScopeY - 1; i > count; i--) {
					list.add(matrix[i][count]);
				}
			--maxScopeX;
			--maxScopeY;
			++count;
		}

		return list;
	}
}
