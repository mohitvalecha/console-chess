package com.tech.app.chess.beans;

import java.util.List;

public abstract class Piece {

	public List<String> moves = null;
	public String row = "";
	public String column = "";
	public String nextRow = "";
	public String nextColumn = "";
	final int MAXCOUNT = 8;
	final int STARTCOUNT = 1;

	public abstract List<String> move(String pos);

	public String capturePosition() {

		// Initialize uninitialized values
//		if (this.nextRow.equals("")) {
//			this.nextRow = this.row;
//		}
//		if (this.nextColumn.equals("")) {
//			this.nextColumn = this.column;
//		}

		String position = nextRow + nextColumn;

		// reset positions to avoid mutation

		resetBasePosition();

		return position;
	}

	private void resetBasePosition() {
		nextRow = row;
		nextColumn = column;
	}

	public Piece up(int count) throws Exception {
//		System.out.println("up==row column===>" + this.row + this.column);
//		System.out.println("\nup==nextRow nextColumn===>" + this.nextRow + this.nextColumn);
		if (Integer.parseInt(this.nextRow) + count <= MAXCOUNT) {
			this.nextRow = String.valueOf(Integer.parseInt(this.nextRow) + count);
//			System.out.println("final==" + this.nextRow + this.nextColumn);
			return this;
		} else {
			resetBasePosition();
			throw new Exception("no possible movement ahead");
		}
	}

	public Piece down(int count) throws Exception {
//		System.out.println("down==row column===>" + this.row + this.column);
//		System.out.println("\ndown==nextRow nextColumn===>" + this.nextRow + this.nextColumn);
		if (Integer.parseInt(this.nextRow) - count >= STARTCOUNT) {
			this.nextRow = String.valueOf(Integer.parseInt(this.nextRow) - count);
//			System.out.println("final==" + this.nextRow + this.nextColumn);
			return this;
		}
		else {
			resetBasePosition();
			throw new Exception("no possible movement ahead");
		}
	}

	public Piece right(int count) throws Exception {
//		System.out.println("right==row column===>" + this.row + this.column);
//		System.out.println("\nright==nextRow nextColumn===>" + this.nextRow + this.nextColumn);
		if (Integer.parseInt(this.nextColumn) + count <= MAXCOUNT) {
			this.nextColumn = String.valueOf(Integer.parseInt(this.nextColumn) + count);
//			System.out.println("final==" + this.nextRow + this.nextColumn);
			return this;
		}
		else {
			resetBasePosition();
			throw new Exception("no possible movement ahead");
		}
	}

	public Piece left(int count) throws Exception {
//		System.out.println("left==row column===>" + this.row + this.column);
//		System.out.println("\nleft==nextRow nextColumn===>" + this.nextRow + this.nextColumn);

		if (Integer.parseInt(this.nextColumn) - count >= STARTCOUNT) {
			this.nextColumn = String.valueOf(Integer.parseInt(this.nextColumn) - count);
//			System.out.println("final==" + this.nextRow + this.nextColumn);
			return this;
		}
		else {
			resetBasePosition();
			throw new Exception("no possible movement ahead");
		}
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + column;
	}

}
