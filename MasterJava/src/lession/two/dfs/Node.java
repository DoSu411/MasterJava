package lession.two.dfs;

import java.util.ArrayList;

public class Node {

	private ArrayList<Integer> edgeList;

	public Node() {
		edgeList = new ArrayList<Integer>();
	}

	/*
	 * @return return edgeList
	 */
	public ArrayList<Integer> getEdgeList() {
		return edgeList;
	}

	/*
	 * Adds edges to the node
	 * 
	 * @param edges an array with the edges of this node
	 */
	public void addEdges(int[] edges) {
		for (int i = 0; i < edges.length; i++) {
			edgeList.add(edges[i]);
		}
	}
}
