import java.util.*;
import java.lang.*;
import java.io.*;
public class Maximum_Score_Words_Formed_by_Letters {
    class Solution {
        public int maxScoreWords(String[] words, char[] letters, int[] score)
        {
            int[] limit = new int[26];
            int[] used = new int[26];
            for(char c : letters)
            {
                limit[c-'a']++;
            }
            int ans = 0;
            ans = backTracking(words , score , limit , used , 0 , 0 , ans);
            return ans;
        }

        public int backTracking(String[] words , int[] score , int[] limit , int[] used , int ind , int temp , int ans)
        {
            for(int i = 0 ; i<26 ; i++)
            {
                if(used[i]>limit[i])
                {
                    return ans;
                }
            }
            ans = Math.max(ans , temp);
            for(int i = ind ; i<words.length ; i++)
            {
                for(char c : words[i].toCharArray())
                {
                    used[c-'a']++;
                    temp = temp + score[c-'a'];
                }
                ans = backTracking(words , score , limit , used , i+1 , temp , ans);
                for(char c : words[i].toCharArray())
                {
                    used[c-'a']--;
                    temp = temp - score[c-'a'];
                }
            }
            return ans;
        }
    }













}
