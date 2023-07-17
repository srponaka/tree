package com.srponaka.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {

	public BinaryNode root;

	// time complexity =O(1)
	// Space complexity = O(1)
	public BinaryTreeLinkedList() {
		this.root = null;
	}

	// time complexity =O(n)
	// Space complexity = O(1)
	void preOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.err.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// time complexity =O(n)
	// Space complexity = O(1)
	void inOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.err.print(node.value + " ");
		inOrder(node.right);
	}

	// time complexity =O(n)
	// Space complexity = O(1)
	void postOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.err.print(node.value + " ");
	}

	// time complexity =O(n)
	// Space complexity = O(n)
	void LevelOrderTraversal(BinaryNode node) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.err.println(presentNode.value + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}

	// time complexity =O(n)
	// Space complexity = O(n)
	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.value == value) {
				System.err.println(presentNode.value + " is found");
				return ;
			} else {
				if (presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if (presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
		}
		System.err.println(value + " is not found");
	}

	// time complexity =O(n)
	// Space complexity = O(n)
	public void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if (root == null) {
			root = newNode;
			System.err.println(value + " is Inserted");
			return;
		} else {
			Queue<BinaryNode> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				if (presentNode.left == null) {
					presentNode.left = newNode;
					System.err.println(value + " is Inserted");
					return;
				} else if (presentNode.right == null) {
					presentNode.right = newNode;
					System.err.println(value + " is Inserted");
				} else {
					queue.add(presentNode.left);
					queue.add(presentNode.right);
				}

			}
		}
	}

	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		return presentNode;
	}

	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode previousNode = null;
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if (presentNode.left == null) {
				previousNode.right = null;
				return;
			} else if (presentNode.right == null) {
				presentNode.left = null;
				return;
			} else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}

	}

	// time complexity =O(n)
	// Space complexity = O(n)
	public void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.value == value) {
				presentNode.value = getDeepestNode().value;
				deleteDeepestNode();
				System.err.println("The node  is deleted");
			} else {
				if (presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if (presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
		}
		System.err.println("The node  is does not exist in the tree");
	}

	// time complexity =O(1)
	// Space complexity = O(1)
	public void delete() {
		root.value = null;
		System.err.println("The Tree  is deleted");

	}

}
