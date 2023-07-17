package com.srponaka.tree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreeApplication.class, args);
		TreeNode drinks = new TreeNode("drinks");
		TreeNode hot = new TreeNode("hot");
		TreeNode cold = new TreeNode("cold");
		TreeNode tea = new TreeNode("tea");
		TreeNode coffe = new TreeNode("coffe");
		TreeNode beer = new TreeNode("beer");
		TreeNode wine = new TreeNode("wine");

		drinks.addChild(hot);
		drinks.addChild(cold);
		hot.addChild(tea);
		hot.addChild(coffe);
		cold.addChild(wine);
		cold.addChild(beer);

		System.err.println(drinks.print(0));
		BinaryTreeLinkedList binaryTreeLl = new BinaryTreeLinkedList();
		BinaryNode n1 = new BinaryNode();
		n1.value = "n1";
		BinaryNode n2 = new BinaryNode();
		n2.value = "n2";
		BinaryNode n3 = new BinaryNode();
		n3.value = "n3";
		BinaryNode n4 = new BinaryNode();
		n4.value = "n4";
		BinaryNode n5 = new BinaryNode();
		n5.value = "n5";
		BinaryNode n6 = new BinaryNode();
		n6.value = "n6";
		BinaryNode n7 = new BinaryNode();
		n7.value = "n7";
		BinaryNode n8 = new BinaryNode();
		n8.value = "n8";
		BinaryNode n9 = new BinaryNode();
		n9.value = "n9";

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n4.right = n9;
		binaryTreeLl.root = n1;

	}

}
