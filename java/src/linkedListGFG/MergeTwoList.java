package linkedListGFG;

public class MergeTwoList {
	NodeClass root;

	public static void main(String[] args) {
		MergeTwoList nodeData = new MergeTwoList();
		nodeData.insertNode(1);
		nodeData.insertNode(2);
		// nodeData1.insertNode(4);
		// nodeData1.insertNode(7);
		nodeData.insertNode(3);
		nodeData.insertNode(5);
		nodeData.insertNode(6);
		nodeData.insertNode(8);
		nodeData.displayData(nodeData.root);
		System.out.println();
		nodeData.deleteMiddle(nodeData.root);
		nodeData.displayData(nodeData.root);
		// MergeTwoList nodeData1 = new MergeTwoList();
		// nodeData1.insertNode(1);
		// nodeData1.insertNode(2);
		// nodeData1.insertNode(4);
		// nodeData1.insertNode(7);
		// MergeTwoList nodeData3 = new MergeTwoList();
		// NodeClass node = nodeData3.mergeTwoList(nodeData.root,
		// nodeData1.root);
		// nodeData3.displayData(node);

	}

	private NodeClass mergeTwoList(NodeClass root2, NodeClass root3) {
		NodeClass result = null;
		if (root2 == null)
			return root3;
		else if (root3 == null)
			return root2;
		if (root2.data <= root3.data) {
			result = root2;
			result.next = mergeTwoList(root2.next, root3);
		} else {
			result = root3;
			result.next = mergeTwoList(root2, root3.next);
		}

		return result;
	}

	public void displayData(NodeClass root) {
		NodeClass current = root;
		while (current != null) {
			System.out.print(current.data);
			System.out.print(" ");
			current = current.next;
		}
	}

	public void insertNode(int data) {
		if (this.root == null) {
			this.root = new NodeClass(data);
			return;
		}
		NodeClass current = this.root;
		NodeClass parent = this.root;
		while (current != null) {
			parent = current;
			current = current.next;
			if (current == null) {
				parent.next = new NodeClass(data);
				return;
			}
		}
	}

	public void deleteMiddle(NodeClass node) {
		if (node == null)
			return;
		NodeClass slowPtr = node;
		NodeClass fastPtr = node;
		NodeClass prev = node;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			prev = slowPtr;
			slowPtr = slowPtr.next;
		}
		System.out.println(slowPtr.data);
		//if (fastPtr == null) {
			prev.next = slowPtr.next;
		//} else
		//	slowPtr.next = slowPtr.next.next;
	}

}
