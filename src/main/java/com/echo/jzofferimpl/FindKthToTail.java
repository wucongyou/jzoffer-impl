package com.echo.jzofferimpl;

/**
 * 链表中倒数第k个结点
 * 
 * 题目描述
 * 
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
	public ListNode findKthToTail(ListNode head, int k) {
		ListNode p1 = head;
		ListNode p2 = head;
		// p2先走k步
		int count = 0;
		while (count < k && p2 != null) {
			p2 = p2.next;
			++count;
		}
		// 当p2=null且count=k
		if (p2 == null && count == k)
			return head;
		// 当p2=null且count<k
		if (p2 == null)
			return null;
		// 当p2不为空（一定有count=k）
		while (p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
