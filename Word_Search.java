import java.util.*;
import java.io.*;
import java.lang.*;
public class Word_Search {
    class Solution {
        public boolean exist(char[][] board, String word) {
            for(int i = 0 ; i<board.length ; i++)
            {
                for(int j = 0 ; j<board[i].length ; j++)
                {
                    if(board[i][j]==word.charAt(0))
                    {
                        char temp = board[i][j];
                        board[i][j] = '.';
                        if(funcSearch(board , word , i , j , 1))
                        {
                            return true;
                        }
                        board[i][j] = temp;
                    }
                }
            }
            return false;
        }

        public boolean funcSearch(char[][] board , String word , int r , int c , int index)
        {
            if(index == word.length())
            {
                return true;
            }
            boolean c1 = false , c2 = false , c3 = false , c4 = false;
            char temp;
            if(letterSearch(r , c-1 , index , board , word))
            {
                temp = board[r][c-1];
                board[r][c-1] = '.';
                c1 = funcSearch(board , word , r , c-1 , index+1);
                board[r][c-1] = temp;
            }
            if(letterSearch(r-1 , c , index , board , word))
            {
                temp = board[r-1][c];
                board[r-1][c] = '.';
                c2 = funcSearch(board , word , r-1 , c , index+1);
                board[r-1][c] = temp;
            }
            if(letterSearch(r , c+1 , index , board , word))
            {
                temp = board[r][c+1];
                board[r][c+1] = '.';
                c3 = funcSearch(board , word , r , c+1 , index+1);
                board[r][c+1] = temp;
            }
            if(letterSearch(r+1 , c , index , board , word))
            {
                temp = board[r+1][c];
                board[r+1][c] = '.';
                c4 = funcSearch(board , word , r+1 , c , index+1);
                board[r+1][c] = temp;
            }


            return c1||c2||c3||c4;
        }

        public boolean letterSearch(int r , int c , int index , char[][] board , String word)
        {
            if(r>=0 && r<board.length && c>=0 && c<board[r].length)
            {
                if(board[r][c] == word.charAt(index))
                {
                    return true;
                }
            }
            return false;
        }
    }
}
