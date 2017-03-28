package ai;

import model.AbstractState.MOVE;
import model.State;

import java.util.List;
import java.util.Random;

public class DarrenLowe2048 extends AbstractPlayer {

	private Random rng = new Random();

	//Monte Carlo Tree Search - UTC

	@Override
	public MOVE getMove(State game) {
		// Delay for the view
		pause();
		// Get available moves
		List<MOVE> moves = game.getMoves();



		if (moves.contains(MOVE.LEFT)){


			return MOVE.LEFT;

		}

		else if (moves.contains(MOVE.DOWN)){

			return MOVE.DOWN;

		}

		else if (moves.contains(MOVE.RIGHT)){

			return MOVE.RIGHT;

		}

		else if (moves.contains(MOVE.UP)){

			return MOVE.UP;

		}

		// Pick a move at random
		return moves.get(rng.nextInt(moves.size()));
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
