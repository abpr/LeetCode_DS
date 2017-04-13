package com.leet.www;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BattleShips {
	
	static ArrayList<String> visited = new ArrayList<String>();
	static ArrayList<String> tovisit = new ArrayList<String>();
	public static void main(String[] args)
	{
		//char[][] temp = new char[][]{"X..X","...X","...X"} ;
		//new BattleShips().countBattleships();
		String x = "12";
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		int a = Integer.parseInt(Character.toString((x.charAt(0))));
		int b = Integer.parseInt(Character.toString((x.charAt(1))));
		System.out.println(a+"+"+b);
		visited.contains("sdfd");
		List<Integer> l1 = new ArrayList<Integer>();
		List<List<Integer>> fullList = new ArrayList<List<Integer>>();
		//List<List<Integer>> fullList1 = new List();
		
	}
	
	public int countBattleships(char[][] board) {
		int colLength = board.length;
		int rowLength = board[0].length;
		int ans = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (!visited.contains(Integer.toString(i) + Integer.toString(j))) {
					if (board[i][j] == '.') {
						visited.add(Integer.toString(i) + Integer.toString(j));
						continue;
					}
					// System.out.println(board[i][j]);
					if (findNeighbours(i, j, board) == 0) {
						visited.add(Integer.toString(i) + Integer.toString(j));
						ans += 1;
					} else {
						ans += checkIfBlob(i, j, board);
						// there are a lot of neighbours
						// carry on adding visited
					}
				}
			}
		}
		return ans;
	}

	public int checkIfBlob(int i, int j, char[][] board) {
		int colLength = board.length;
		int rowLength = board[0].length;
		// algo
		// add present node to visited
		// look at the neighbours where the next symbol is X
		// if next symbol is X go there and do the same
		// loop thro all the neighbours
		tovisit.add(Integer.toString(i) + Integer.toString(j));
		// put the neighbours of
		while (tovisit.size() > 0) {
			System.out.println(Integer.toString(i) + Integer.toString(j));
			if (i - 1 >= 0) {
				if (board[i - 1][j] == 'X') {
					if (!visited.contains(Integer.toString(i) + Integer.toString(j)))
						tovisit.add(Integer.toString(i - 1) + Integer.toString(j));
				}
			}
			if (i + 1 <= colLength - 1) {
				if (board[i + 1][j] == 'X') {
					// tovisit.add(Integer.toString(i+1)+Integer.toString(j));
					if (!visited.contains(Integer.toString(i) + Integer.toString(j)))
						tovisit.add(Integer.toString(i + 1) + Integer.toString(j));
				}
			}
			if (j - 1 >= 0) {
				if (board[i][j - 1] == 'X') {
					// tovisit.add(Integer.toString(i)+Integer.toString(j-1));
					if (!visited.contains(Integer.toString(i) + Integer.toString(j - 1)))
						tovisit.add(Integer.toString(i) + Integer.toString(j - 1));
				}
			}
			if (j + 1 <= rowLength - 1) {
				if (board[i][j + 1] == 'X') {
					// tovisit.add(Integer.toString(i)+Integer.toString(j+1));
					if (!visited.contains(Integer.toString(i) + Integer.toString(j + 1)))
						tovisit.add(Integer.toString(i) + Integer.toString(j + 1));
				}
			}
			visited.add(Integer.toString(i) + Integer.toString(j));
			tovisit.remove(Integer.toString(i) + Integer.toString(j));
		}
		return 1;
	}

	public int findNeighbours(int i, int j, char[][] board) {
		int colLength = board.length;
		int rowLength = board[0].length;
		// check the immediate next 4 neighbours
		int neighbours = 0;
		// i-1,j
		// i+1,j
		// i,j+1
		// i,j-1
		if (board[i][j] == 'X') {
			if (i - 1 >= 0)
				if (board[i - 1][j] == 'X')
					neighbours += 1;
			if (i + 1 <= colLength - 1)
				if (board[i + 1][j] == 'X')
					neighbours += 1;
			if (j - 1 >= 0)
				if (board[i][j - 1] == 'X')
					neighbours += 1;
			if (j + 1 <= rowLength - 1)
				if (board[i][j + 1] == 'X')
					neighbours += 1;
		} else {
			neighbours = -99;
		}
		System.out.println(i + "-i,j-" + j + "," + neighbours);
		return neighbours;
	}

}
