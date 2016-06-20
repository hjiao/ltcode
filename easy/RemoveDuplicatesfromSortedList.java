package easy;

public class RemoveDuplicatesfromSortedList {

	// Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates_ok(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.next.val == current.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		if (current != null && current.next != null)
			if (current.val == current.next.val)
				current.next = current.next.next;
			else {
				current = current.next;
			}

		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
