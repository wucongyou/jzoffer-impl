package com.echo.jzofferimpl;

/**
 * 复杂链表的复制
 * 
 * 题目描述
 * 
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，
 * 输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Clone {
	public static RandomListNode cloneComplexList(RandomListNode pHead) {
		if (pHead == null)
			return null;
		RandomListNode p = pHead;
		// 复制原始链表节点并插入到原节点之后
		while (p != null) {
			RandomListNode cloneNode = new RandomListNode(p.label);
			cloneNode.next = p.next;
			p.next = cloneNode;
			p = cloneNode.next;
		}
		// 调整复制完的新链表节点的random指向
		p = pHead;
		while (p != null) {
			RandomListNode tmp = p.random;
			if (tmp != null)
				p.next.random = tmp.next;
			p = p.next.next;
		}
		// 拆分新旧链表
		RandomListNode oriNode = pHead;// 原始链表当前节点
		RandomListNode cloneHead = pHead.next;// 新链表头
		RandomListNode cloneNode = cloneHead;// 新链表当前节点
		oriNode.next = cloneNode.next;
		oriNode = oriNode.next;
		while (oriNode != null) {
			cloneNode.next = oriNode.next;
			cloneNode = cloneNode.next;
			oriNode.next = cloneNode.next;
			oriNode = oriNode.next;
		}
		return cloneHead;
	}
}
