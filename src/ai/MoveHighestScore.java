package ai;

import model.AbstractState.MOVE;
import model.State;

import java.util.*;
import java.util.function.Consumer;

public class MoveHighestScore extends AbstractPlayer {


	public class Tree {
		private Node root;

		public Tree(State rootData) {
			root = new Node();
			root.data = rootData;
			root.children = new ArrayList<Node>();
		}

		private class Node {
			private State data;
			private Node parent;
			private List<Node> children;
		}
	}





	@Override
	public MOVE getMove(State game) {
		// Delay for the view
		pause();






		return null;
	}

	@Override
	public int studentID() {
		return 201181111;
	}

	@Override
	public String studentName() {
		return "Darren Lowe";
	}
}
