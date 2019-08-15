package com.tech.app.chess.beans;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
	public List<String> move(String currentPos) {
		if (currentPos != null) {
			moves = new ArrayList<String>();

			row = currentPos.substring(0, 1);
			column = currentPos.substring(1, currentPos.length());
			nextRow = row;
			nextColumn = column;

			// Print piece current position
//			System.out.println("Queen " + row + column);

			try {
//				System.out.println("row:" + Integer.parseInt(row));
				for (int i = Integer.parseInt(row); i <= MAXCOUNT; i++) {
					this.up(i);
					moves.add(capturePosition());
				}

			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
//				System.out.println("row:" + Integer.parseInt(row));
				for (int i = Integer.parseInt(row); i > STARTCOUNT; i--) {
					this.down(i - 1);
					moves.add(capturePosition());
				}
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				for (int i = Integer.parseInt(column); i > STARTCOUNT; i--) {
					this.left(i - 1);
					moves.add(capturePosition());
				}
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}
//
			try {
				for (int i = Integer.parseInt(column); i < MAXCOUNT; i++) {
					this.right(MAXCOUNT - i);
					moves.add(capturePosition());
				}
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}

			try {
				for (int i = Integer.parseInt(row); i <= MAXCOUNT; i++) {
					this.up(i).right(i);
					moves.add(capturePosition());
				}
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

			try {
				for (int i = Integer.parseInt(row); i <= MAXCOUNT; i++) {
					this.up(i).left(i);
					moves.add(capturePosition());
				}
			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
			}

//			try {
//				for (int i = Integer.parseInt(row), j=1; i > STARTCOUNT; i--,j++) {
//					this.down(i-1).left(j);
//					moves.add(capturePosition());
//				}
//			} catch (Exception e) {
////				System.out.println(e.getLocalizedMessage());
//			}

//			try {
//				this.down(1).right(1);
//				moves.add(capturePosition());
//			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
//			}
		}
		return moves;
	}
}
