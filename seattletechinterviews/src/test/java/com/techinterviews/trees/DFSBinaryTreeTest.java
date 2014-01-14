package com.techinterviews.trees;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class DFSBinaryTreeTest {

	@Test
	public void testDepthOfOneLeftNodes() {
		DFSBinaryTree bt = new DFSBinaryTree();
		DFSBinaryTree.Node n1 = new DFSBinaryTree.Node(10);

		DFSBinaryTree.Node nleft = new DFSBinaryTree.Node(5);
		n1.left=nleft;
		int v = bt.isTreeeBalanced(n1);
		System.out.println(v);
		Assert.assertEquals(v, 1);
	}
	
	@Test
	public void testDepthOfTwoLeftNodes() {
		DFSBinaryTree bt = new DFSBinaryTree();
		DFSBinaryTree.Node n1 = new DFSBinaryTree.Node(10);

		DFSBinaryTree.Node nleft = new DFSBinaryTree.Node(5);
		nleft.left = new DFSBinaryTree.Node(3);
		n1.left=nleft;
		int v = bt.isTreeeBalanced(n1);
		System.out.println(v);
		Assert.assertEquals(v, 2);
	}
	
	@Test
	public void testDepthOf5LeftNodes() {
		DFSBinaryTree bt = new DFSBinaryTree();
		DFSBinaryTree.Node n1 = new DFSBinaryTree.Node(10);
		DFSBinaryTree.Node n = n1;
		for(int i=5;i>0;i--){
			n.left = new DFSBinaryTree.Node(i);
			n = n.left;
		}
		int v = bt.isTreeeBalanced(n1);
		System.out.println(v);
		Assert.assertEquals(v, 5);
	}
	
	@Test
	public void testDepthOf3Unbalanced() {
		DFSBinaryTree bt = new DFSBinaryTree();
		DFSBinaryTree.Node n1 = new DFSBinaryTree.Node(10);
		n1.left=new DFSBinaryTree.Node(5);
		DFSBinaryTree.Node n = n1;
		n.left=new DFSBinaryTree.Node(1);
		for(int i=0;i<3;i++){
			n.right = new DFSBinaryTree.Node(n.value+1);
			n = n.right;
		}
		int v = bt.isTreeeBalanced(n1);
		System.out.println("testDepthOf3Unbalanced: " + v);
		Assert.assertEquals(v, 2);
	}

}
