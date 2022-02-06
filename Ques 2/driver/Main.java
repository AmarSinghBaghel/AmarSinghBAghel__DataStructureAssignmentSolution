package com.greatlearning.driver;
import com.greatlearning.model.*;
import com.greatlearning.model.model.Node;
import com.greatlearning.services.*;

public class Main {

	public static model.Node node ;
	static model.Node prevNode = null;
	static model.Node headNode = null;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Main tree = new Main();
		tree.node = new model.Node(50);
		tree.node.left = new model.Node(30);
		tree.node.right = new model.Node(60);
		tree.node.left.left = new model.Node(10);
		tree.node.right.left= new model.Node(55);
		
		int order = 0;
		
		services.getBSTtoSkewed(node, order );
		
	}

}
