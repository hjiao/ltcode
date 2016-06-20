package easy;

public class MyList {

	public static ListNode createList() {

		ListNode head = new ListNode(0);
		ListNode node = head;
		node.next = new ListNode(1);
		node = node.next;
		node.next = new ListNode(2);
		node = node.next;
		node.next = new ListNode(3);
		node = node.next;
		node.next = new ListNode(4);
		node = node.next;
		
		return head;

	}

	public static ListNode createList2() {

		ListNode head = null;
		ListNode c = null;

		for (int i = 0; i < 10; i++) {
			ListNode node = new ListNode(i);
			if (i == 0) {
				head = node;
				c = head;
			}
			c.next = node;
			c = node;

		}
		return head;

	}

	public static void main(String[] args) {
		ListNode list = createList();
		ListNode c = list;
		while (c != null) {
			System.out.println(c.val);
			c = c.next;
		}

	}

}

// Definition for singly-linked list.
// class ListNode {
// int val;
// ListNode next;
//
// ListNode(int x) {
// val = x;
// }
// }
