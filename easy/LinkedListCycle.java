package easy;

public class LinkedListCycle {
	// Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		ListNode current = head;
		while (current != null) {
			current = current.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
