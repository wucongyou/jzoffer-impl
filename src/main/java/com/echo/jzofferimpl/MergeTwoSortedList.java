package com.echo.jzofferimpl;

/**
 * 合并两个排序的链表
 * 
 * 题目描述
 * 
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeTwoSortedList {
	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode p1 = list1;
		ListNode p2 = list2;
		ListNode pHead = new ListNode(0);// 哨兵节点，指向合成后的链表表头
		ListNode pre = pHead;// 每一次向合并后链表添加元素时的前驱节点
		while (p1 != null && p2 != null) {
			// 在两个链表指针指向的节点中选择较小的节点加入到合并后的链表
			if (p1.val <= p2.val) {
				pre.next = p1;
				pre = p1;
				p1 = p1.next;

			} else {
				pre.next = p2;
				pre = p2;
				p2 = p2.next;
			}
		}
		// 处理结尾
		if (p1 == null)
			pre.next = p2;
		if (p2 == null)
			pre.next = p1;
		return pHead.next;
	}
}
