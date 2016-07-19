package com.echo.jzofferimpl;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PrintMatrixTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] matrix={{1},{2},{3},{4},{5}};
		ArrayList<Integer> list = PrintMatrix.printMatrix(matrix);
		System.out.print("\nResult=");
		for (Integer e : list)
			System.out.print(e+" ");
	}

}
