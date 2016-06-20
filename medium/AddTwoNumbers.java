package medium;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode c1 = l1;
		ListNode c2 = l2;
		ListNode result = new ListNode(0);
		ListNode r = result;

		int k = 0;

		while ((c1 != null && c1.next != null) && (c2 != null && c2.next != null)) {
			int val = c1.val + c2.val + k;
			if ((val - 10) > 0) {
				val = val - 10;
				k = 1;
			} else {
				k = 0;
			}

			ListNode node = new ListNode(val);

			r.next = node;
			c1 = c1.next;
			c2 = c2.next;
		}

		if (c1 == null || c1.next == null)
			r.next = c2;
		else
			r.next = c1;

		// result = result.next;
		return result;
	}

	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);

		ListNode r = addTwoNumbers2(node1, node2);
		System.out.println(r.val);

	}

}

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
