package com.echo.jzofferimpl;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用两个队列实现栈
 * 
 * 题目描述
 * 
 * 用两个队列来实现一个栈，完成栈的Push和Pop操作。 栈中的元素为int类型。
 */
public class StackWithTwoQueues {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();

	public void push(int item) {
		if (!queue1.isEmpty() && !queue2.isEmpty())
			throw new RuntimeException("队列状态错误");
		Queue<Integer> toQueue = null;// 保存到的队列
		if (queue2.isEmpty())
			toQueue = queue1;
		else if (queue1.isEmpty())
			toQueue = queue1;
		toQueue.offer(item);
	}

	public int pop() {
		// 两个队列全为空，则返回默认值0
		if (queue1.isEmpty() && queue2.isEmpty())
			return 0;
		// 两个队列都不为空
		if (!queue1.isEmpty() && !queue2.isEmpty())
			throw new RuntimeException("队列状态错误");
		Queue<Integer> fromQueue;// 不空队列
		Queue<Integer> toQueue;// 空队列

		// 确定不空队列和空队列
		if (!queue1.isEmpty()) {
			fromQueue = queue1;
			toQueue = queue2;
		} else {
			fromQueue = queue2;
			toQueue = queue1;
		}
		// 将非空队列元素除去最后一个之外全部转移到空队列，最后一个返回，作为栈弹出的元素
		int item = 0;
		while (!fromQueue.isEmpty()) {
			item = fromQueue.poll();
			if (fromQueue.isEmpty())
				return item;
			else
				toQueue.offer(item);
		}
		return item;
	}
}
