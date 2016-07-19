package com.echo.jzofferimpl;

import java.util.ArrayList;

public class PrintMatrixWithDebugInfo {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int rows = matrix.length;
		int cols = matrix[0].length;
		int numOfCircle = ((rows < cols ? rows : cols) + 1) >> 1;

		int maxScopeX = cols - 1;
		int maxScopeY = rows - 1;

		int count = 0;
		while (count < numOfCircle) {
			System.out.println("count=" + count);
			System.out.println("X=" + maxScopeX + ",Y=" + maxScopeY);
			// 向右走
			System.out.print("向右=");
			for (int i = count; i <= maxScopeX; i++) {
				System.out.print(matrix[count][i] + " ");
				list.add(matrix[count][i]);
			}
			// 向下走
			System.out.print("\n向下=");
			for (int i = count + 1; i <= maxScopeY; i++) {
				System.out.print(matrix[i][maxScopeX] + " ");
				list.add(matrix[i][maxScopeX]);
			}
			// 向左走
			System.out.print("\n向左=");
			// 当至少两行的时候才能左
			if (maxScopeY - count > 0)
				for (int i = maxScopeX - 1; i >= count; i--) {
					System.out.print(matrix[maxScopeY][i] + " ");
					list.add(matrix[maxScopeY][i]);
				}
			// 向上走
			System.out.print("\n向上=");
			// System.out.print("(from="+(maxScopeY-1)+",to="+(count+1)+")");
			// 当至少两列的时候才能向上
			if (maxScopeX - count > 0)
				for (int i = maxScopeY - 1; i > count; i--) {
					System.out.print(matrix[i][count] + " ");
					list.add(matrix[i][count]);
				}

			--maxScopeX;
			--maxScopeY;
			++count;
		}

		return list;
	}
}
