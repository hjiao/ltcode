package easy;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashSet<ListNode> h = new HashSet<ListNode>();
		ListNode current = headA;
		while (current != null) {
			h.add(current);
			current = current.next;
		}
		current = headB;
		while (current != null) {
			if (h.contains(current))
				return current;
			current = current.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
