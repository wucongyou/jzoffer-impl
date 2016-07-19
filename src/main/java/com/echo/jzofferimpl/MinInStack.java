package com.echo.jzofferimpl;

import java.util.Stack;

/**
 * 包含min函数的栈
 * 
 * 题目描述
 * 
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class MinInStack {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		int min = Integer.MAX_VALUE;
		if (!stack2.isEmpty())
			min = stack2.peek();
		if (node < min) {
			min = node;
		}
		stack1.push(node);
		stack2.push(min);
	}

	public void pop() {
		stack1.pop();
		stack2.pop();
	}

	public int top() {
		return stack1.peek();
	}

	public int min() {
		return stack2.peek();
	}
}
