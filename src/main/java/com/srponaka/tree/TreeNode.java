package com.srponaka.tree;

import java.util.ArrayList;

public class TreeNode {

	String data;
	
	ArrayList<TreeNode> children;
	
	
	public TreeNode(String data) {
		this.data=data;
		this.children=new ArrayList<>();
	}
	
	public void addChild(TreeNode child) {
		this.children.add(child);
	}
	
	public String print(int level) {
		String res;
		res="  ".repeat(level)+data+"\n";
		for(TreeNode node : this.children) {
			res+=node.print(level+1);
		}
		return res;
	}
}
