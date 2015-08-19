package lession.two.dfs;

import java.util.ArrayList;

public class Node {

	private ArrayList<Integer> edgeList;

	private boolean reached;

	public Node() {
		edgeList = new ArrayList<Integer>();
		reached = false;
	}

	/*
	 * @return edgeList
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

	/*
	 * @return reached
	 */
	public boolean isReached() {
		return reached;
	}

	/*
	 * sets the reached value
	 * 
	 * @param bool
	 */
	public void setReached(boolean bool) {
		this.reached = bool;
	}
}
