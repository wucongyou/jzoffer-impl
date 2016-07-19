package com.echo.jzofferimpl;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * 
 * 题目描述
 * 
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class PrintListReversingly {

	/**
	 * 从尾到头打印链表(非递归)
	 * 
	 * @param listNode
	 *            链表的表头
	 * @return 需要打印的“新链表”的表头
	 */
	public ArrayList<Integer> printListFromTailToHead_Iteratively(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (listNode == null)
			return list;

		Stack<Integer> s = new Stack<Integer>();
		ListNode p = listNode;
		while (p != null) {
			s.push(p.val);
			p = p.next;
		}

		while (!s.isEmpty()) {
			list.add(s.pop());
		}
		return list;
	}

	public ArrayList<Integer> printListFromTailToHead_Recursively(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		printListFromTailToHead_Recursively(listNode, list);
		return list;
	}

	public void printListFromTailToHead_Recursively(ListNode listNode, ArrayList<Integer> list) {

		if (listNode != null) {
			printListFromTailToHead_Recursively(listNode.next, list);
			list.add(listNode.val);
		}
	}
}
