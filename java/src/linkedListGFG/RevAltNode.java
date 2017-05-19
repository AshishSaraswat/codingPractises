package linkedListGFG;

public class RevAltNode {

	NodeClass root;

	public static void main(String[] args) {
		RevAltNode rev = new RevAltNode();
		rev.insertNode(1);
		rev.insertNode(2);
		rev.insertNode(3);
		rev.insertNode(4);
		rev.insertNode(5);
		rev.insertNode(6);
		rev.insertNode(7);
		rev.insertNode(8);
		rev.insertNode(9);
		rev.displayData(rev.root);
		System.out.println();
		NodeClass root1 = rev.revNodeRec(rev.root,3);
		rev.displayData(root1);
//		NodeClass rootTemp = rev.revNodeIterAlt(rev.root);
		System.out.println();
//		rev.displayData(rootTemp);

	}

	public void displayData(NodeClass root) {
		NodeClass current = root;
		while (current != null) {
			System.out.print(current.data);
			System.out.print(" ");
			current = current.next;
		}
	}

	public NodeClass revNodeRec(NodeClass root) {
		if (root == null)
			return null;
		else if (root.next == null)
			return root;
		NodeClass temp = root.next;
		root.next = temp.next;
		temp.next = root;
		root = temp;
		root.next.next = revNodeRec(root.next.next);
		return root;
	}

	public NodeClass revNodeIterAlt(NodeClass root) {
		if (root == null)
			return null;
		NodeClass temp = null;
		NodeClass temp1 = null;
		NodeClass current = root;
		while (current != null && current.next != null) {
			if (temp1 != null) {
				temp1.next.next = current.next;
			}
			temp1 = current.next;
			current.next = current.next.next;
			temp1.next = current;
			// 1current = temp1;
			if (temp == null)
				temp = temp1;
			current = current.next;
		}
		return temp;
	}

	public NodeClass revNodeRec(NodeClass root, int count) {
		if (root == null)
			return null;
		NodeClass prev = null;
		NodeClass temp = null;
		NodeClass current = root;
		int k = 0;
		while (current != null && k < count) {
			temp = current.next;
			//temp.next = current;
			current.next = prev;
			prev=current;
			current = temp;
			k++;
		}
		if(temp!=null)
			root.next =revNodeRec(temp, count);
		return prev;
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

}
