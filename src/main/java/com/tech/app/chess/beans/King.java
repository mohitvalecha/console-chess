package com.tech.app.chess.beans;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

	public List<String> move(String currentPos) {
//		System.out.println("Inside method move for King");
		if (currentPos != null) {
			moves = new ArrayList<String>();

			row = currentPos.substring(0, 1);
			column = currentPos.substring(1, currentPos.length());
			nextRow = row;
			nextColumn = column;

			// Print piece current position
//			System.out.println("King current position:" + row + column);

			// Move the piece as per piece behavior

			try {
				this.up(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.down(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.left(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.right(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.up(1).right(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.up(1).left(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.down(1).left(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				this.down(1).right(1);
				moves.add(capturePosition());
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}
		}
		return moves;
	}
}
