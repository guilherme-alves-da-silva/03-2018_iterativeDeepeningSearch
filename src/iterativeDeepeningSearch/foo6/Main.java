package iterativeDeepeningSearch.foo6;

public class Main{
	public static void main(String[] args){
		Tree t=new Tree(new Node(4));

		//test
		t.getRoot().addChild(new Node(5));
		t.getRoot().addChild(new Node(2));
		t.getRoot().addChild(new Node(8));

		t.getRoot().getChildren().get(0).addChild(new Node(3));
		t.getRoot().getChildren().get(0).addChild(new Node(1));

		t.getRoot().getChildren().get(1).addChild(new Node(4));
		t.getRoot().getChildren().get(1).addChild(new Node(9));

		Util.printTree(t.getRoot());
//		Util.printList(t.search(4, 1));
//		Util.printList(t.search(1, 2));
		Util.printList(t.search(9, 0));
	}
}
