package com.techinterviews.trees;

import java.util.ArrayList;

public class DFSBinaryTree {

	public static class Node {
		public int value;
		public Node left, right;

		public Node(int data) {
			this.value = data;
			this.left = this.right = null;
		}
	}

	public ArrayList<Node> output = new ArrayList<Node>();
	public Node root;

	/**
	 * Given a tree (in NODE), traverse the tree inOrder.
	 * 
	 * @param node
	 *            the tree
	 * @param output
	 *            to log the output, use output.add(node.value);
	 */
	public void inOrderProcess(Node node) {
		// TODO: Insert code here
		if (node != null) {
			inOrderProcess(node.left);
			output.add(node);
			inOrderProcess(node.right);
		}
	}

	/**
	 * Given a tree (in NODE), traverse the tree preOrder.
	 * 
	 * @param node
	 *            the tree
	 * @param output
	 *            to log the output, use output.add(node.value);
	 */
	public void preOrderProcess(Node node) {
		// TODO: Insert code here
		if (node != null) {
			output.add(node);
			inOrderProcess(node.left);
			inOrderProcess(node.right);
		}
	}

	/**
	 * Given a tree (in NODE), traverse the tree postOrder.
	 * 
	 * @param node
	 *            the tree
	 * @param output
	 *            to log the output, use output.add(node.value);
	 */
	public void postOrderProcess(Node node) {
		// TODO: Insert code here
	}
	
	public ArrayList<Integer> breadthFirstPrint(Node node){
		java.util.Queue<Node> queue = new java.util.LinkedList<Node>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		queue.add(node);

		while(!queue.isEmpty()){
			Node n=queue.poll();
			list.add(n.value);
			if(n.left!=null)
				queue.add(n.left);
			if(n.right!=null)
				queue.add(n.right);
		}
		
		return list;
	}

	public static void main(String[] args) {
		DFSBinaryTree tree = new DFSBinaryTree();
		DFSBinaryTree.Node n1 = new DFSBinaryTree.Node(10);

		DFSBinaryTree.Node nleft = new DFSBinaryTree.Node(5);
		nleft.left = new DFSBinaryTree.Node(4);
		nleft.right = new DFSBinaryTree.Node(7);
		
		DFSBinaryTree.Node nr = new DFSBinaryTree.Node(13);
		nr.left = new DFSBinaryTree.Node(12);
		nr.right = new DFSBinaryTree.Node(14);
		
		n1.left=nleft;
		n1.right=nr;
		
		// tree.inOrderProcess(n1);
//		tree.preOrderProcess(n1);
//		for (DFSBinaryTree.Node l : tree.output) {
//			System.out.println(l.value);
//		}
		
		for(Integer i:tree.breadthFirstPrint(n1))
			System.out.println(i);

	}

}
