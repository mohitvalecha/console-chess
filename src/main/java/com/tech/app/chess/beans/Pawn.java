package com.tech.app.chess.beans;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

	// Can move only 1 step at a time, in the forward direction, vertically.

	public List<String> move(String currentPos) {
		if (currentPos != null) {
			moves = new ArrayList<String>();

			row = currentPos.substring(0, 1);
			column = currentPos.substring(1, currentPos.length());
			nextRow = row;
			nextColumn = column;

			// Print piece current position
//			System.out.println("Pawn " + row + column);

			try {
				// Move the piece as per piece behavior
				this.up(1);
				moves.add(capturePosition());
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}

		}
		return moves;
	}

}
