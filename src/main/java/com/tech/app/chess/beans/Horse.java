package com.tech.app.chess.beans;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece {

//Can move across the board only in 2.5 steps (2 vertical steps and 1 	horizontal step)

	public List<String> move(String currentPos) {
		if (currentPos != null) {
			moves = new ArrayList<String>();

			row = currentPos.substring(0, 1);
			column = currentPos.substring(1, currentPos.length());
			nextRow = row;
			nextColumn = column;

			// Print piece current position
//			System.out.println("Horse " + row + column);

			// Move the piece as per piece behavior
			try {
				this.up(2).right(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.down(2).right(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.up(2).left(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.down(2).left(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.left(2).up(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.left(2).down(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.right(2).up(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.right(2).down(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

		}
		return moves;
	}
}
