package medium;

public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode odd = head, even = head.next, evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}

	public static ListNode oddEvenList2(ListNode head) { // my
		int i = 1;
		ListNode oHead = head;
		ListNode odd = head;
		ListNode eHead = new ListNode(0);
		ListNode even = eHead;
		while (head != null && head.next != null) {
			i++;
			head = head.next;
			if (i % 2 == 0) {
				even.next = head;
				even = head;
			} else {
				odd.next = head;
				odd = head;
			}

		}
		eHead = eHead.next;
		if (even != null) {
			even.next = null;
		}
		if (odd != null) {//
			odd.next = eHead;
		}
		return oHead;

	}

	public static ListNode oddEvenList3(ListNode head) { // my
		int i = 1;
		ListNode oHead = head;
		ListNode oNext = head;
		ListNode eHead = new ListNode(0);
		ListNode eNext = eHead;
		while (head != null && head.next != null) {
			i++;
			head = head.next;
			if (i % 2 == 0) {
				eNext.next = head;
				eNext = head;
			} else {
				oNext.next = head;
				oNext = head;
			}

		}
		eHead = eHead.next;
		if (eNext != null) {
			eNext.next = null;
		}
		if (oNext != null) {//
			oNext.next = eHead;
		}
		return oHead;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode eHead = new ListNode(1);
		ListNode node = eHead;
		node.next = new ListNode(2);
		node = node.next;
		node.next = new ListNode(3);
		node = node.next;
		node.next = new ListNode(4);
		node = node.next;
		node.next = new ListNode(5);
		node = node.next;
		node.next = new ListNode(6);
		node = node.next;
		node.next = new ListNode(7);
		node = node.next;
		node.next = new ListNode(8);
		node = node.next;

		node.next = null;

		node = eHead;
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

		eHead = oddEvenList(eHead);

		while (eHead != null) {
			System.out.println(eHead.val);
			eHead = eHead.next;
		}

	}

}
