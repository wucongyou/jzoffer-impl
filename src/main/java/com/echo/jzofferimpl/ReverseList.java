package com.echo.jzofferimpl;

/**
 * 反转链表
 * 
 * 题目描述
 * 
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseList {
	public ListNode reverseList(ListNode head) {
		ListNode p = head;
		ListNode pPre = null;
		while (p != null) {
			ListNode pNext = p.next;
			p.next = pPre;
			// 原先的尾节点变成头节点
			if (pNext == null)
				return p;
			pPre = p;
			p = pNext;
		}
		return null;
	}
}
