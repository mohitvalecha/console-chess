package com.tech.app.chess;

import java.util.List;

import com.tech.app.chess.beans.Piece;

public class App {

//	private final int[] rowsArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
//	private final int[] columnsArray = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void main(String[] args) {

//		System.out.println(args);
//		args = new String[2];

//		args[0] = "Queen";
//		args[1] = "85";
//		System.out.println(args);
//		System.out.println(args.length);

		// check arguments
		if (args.length == 2) {
//			System.out.println("args[0]=" + args[0] + " args[1]=" + args[1]);
			Piece p = null;
			String className = "com.tech.app.chess.beans." + args[0];
//			System.out.println("hi there");
			try {
//				System.out.println("hi there 2");
				Class c = Class.forName(className);
				Object o = c.newInstance();
//				System.out.println(o);

				List<String> moves = (List<String>) o.getClass().getMethod("move", String.class).invoke(o, args[1]);
//				System.out.println(moves);
				printMoves(moves);
			} catch (Exception e) {
				System.out.println("Exception:" + e.getLocalizedMessage());
//				e.printStackTrace();
			}
		} else {
			System.out.println("Pass necessary arguments\nFor Example:\nKing 24\nQueen 57 etc.");
		}

	}

	private static void printMoves(List<String> possibleMoves) {
		if (!possibleMoves.isEmpty())
			System.out.print("Possible positions: ");
		for (String move : possibleMoves) {
			System.out.print(move + " ");
		}
		System.out.println();
	}
}
