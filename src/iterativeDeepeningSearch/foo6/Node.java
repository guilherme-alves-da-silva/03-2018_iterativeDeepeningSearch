package iterativeDeepeningSearch.foo6;

import java.util.LinkedList;

public class Node{
	private int value;
	private Node parent;
	private int level;
	private LinkedList<Node> children;

	public Node(int value){
		this.value=value;
		this.children=null;
	}
	public Integer getValue(){
		return this.value;
	}
	public Node getParent(){
		return this.parent;
	}
	public void setParent(Node node){
		this.parent=node;
	}
	public Integer getLevel(){
		return this.level;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public void addChild(Node newChild){
		if(children==null) children=new LinkedList<Node>();

		newChild.setParent(this);
		newChild.setLevel(this.level+1);
		getChildren().add(newChild);
	}
	public LinkedList<Node> getChildren(){
		return this.children;
	}
}
