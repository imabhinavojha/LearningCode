package LeetCodeEasy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}

		// Append any remaining nodes from either list
		if (l1 != null) {
			current.next = l1;
		} else if (l2 != null) {
			current.next = l2;
		}

		return dummyHead.next;
	}

	public static void main(String[] args) {
		// Create two sorted lists
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);

		// Merge the two sorted lists
		MergeTwoSortedLists merger = new MergeTwoSortedLists();
		ListNode mergedList = merger.mergeTwoLists(l1, l2);

		// Print the merged list
		System.out.print("Merged List: ");
		while (mergedList != null) {
			System.out.print(mergedList.val + " ");
			mergedList = mergedList.next;
		}
	}
}
