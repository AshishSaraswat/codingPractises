package linkedListGFG;

public abstract class InsertNode {
	NodeClass root;

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
