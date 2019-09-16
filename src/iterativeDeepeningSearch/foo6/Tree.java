package iterativeDeepeningSearch.foo6;

import java.util.LinkedList;

public class Tree{
	private Node root;
	private LinkedList<Node> accessed;
	private LinkedList<Node> visited;
	private LinkedList<Node> path;
	private int level;
	private int levelToStart;

	public Tree(Node root){
		this.root=root;
	}
	public Node getRoot(){
		return this.root;
	}
	private LinkedList<Node> buildPath(Node current){
		path.push(current);
		return path.peek()==root ? path : buildPath(current.getParent());
	}
	public LinkedList<Node> search(int valueToFind, int startFrom){
		path=null;
		level=levelToStart=startFrom;
		accessed=new LinkedList<Node>();
		visited=new LinkedList<Node>();

		for(;path==null;level++)
			depthLimitedSearch(root, valueToFind);

		return path;
	}
	private void depthLimitedSearch(Node current, int value){
		accessed.add(current);

		if(current.getLevel()==level||current.getChildren()==null||current.getChildren().isEmpty()){
			if(current.getLevel()>=levelToStart){
				visited.add(current);

				if(current.getValue()==value){
					path=new LinkedList<Node>();
					buildPath(current);
				}
			}
		}
		else{
			for(int i=0;path==null&&i<current.getChildren().size();i++)
				depthLimitedSearch(current.getChildren().get(i), value);
		}
	}
}
