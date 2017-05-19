package linkedListGFG;

public class DecimalEquivalent {

	NodeClass root;

	public static void main(String[] args) {
		DecimalEquivalent equivalent = new DecimalEquivalent();
		equivalent.insertNode(0);
		equivalent.insertNode(0);
		equivalent.insertNode(0);
		equivalent.insertNode(1);
		equivalent.insertNode(1);
		equivalent.insertNode(0);
		equivalent.insertNode(0);
		equivalent.insertNode(1);
		equivalent.insertNode(0);
		equivalent.findDecimalEquivalent();

	}

	private void findDecimalEquivalent() {
		if (root == null) {
			System.out.println(0);
			return;
		}
		NodeClass current = root;
		String s = "";
		int length = 0;
		while (current != null) {
			s += current.data;
			current = current.next;
			length++;
		}
		int num=0;int check =length-1;
		for(int i=0;i<length;i++){
			int charNum = (s.charAt(i)-'0')*2;
			//System.out.println(charNum);
			if(charNum!=0)
			num+=(int)Math.pow(charNum, check-i);
		}
		System.out.println(num);
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
