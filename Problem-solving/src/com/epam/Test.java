package com.epam;

public class Test {

	
	public static void main(String[] args) {
		String vik = "leetcode";
		
		System.out.println(firstUniqChar(vik));
		
	}
	 public static int firstUniqChar(String s) {
	      int[] a = new int[26];
	      int l= s.length();
	      for(int i=0;i<l;i++){
	         System.out.println( a[s.charAt(i) -'a']++);
	      }
	      
	      System.out.println("--");
	      for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
			
		}
	       for(int i=0;i<l;i++){
	          if(a[s.charAt(i) -'a'] == 1)
	              return i;
	      }
	      return -1;
	    }	
}
