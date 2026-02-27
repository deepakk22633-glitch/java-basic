package javaintro;

public class Sum2 {
//public static String checkPalindrome(String str) {
//		
//	    int left = 0;
//	    int right = str.length() - 1;
//	    
//	    while (left < right) {
//	        if (str.charAt(left) != str.charAt(right)) {
//	            return str + " is not a palindrome";
//	        }
//	        left++;
//	        right--;
//	    }
//	    return str + " is a palindrome";
//	    
//	}
//
//	
//	public static void main(String[] args) {
//		
//	    String word = "radar";
//	    String result = checkPalindrome(word);
//	    System.out.println(result);  
//	    
//	}
//
//}
	public static boolean isPalindrome(String str) {
	    int left = 0;
	    int right = str.length() - 1;
	    
	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;  
	}

	public static void main(String[] args) {
	    String word = "radar";
	    boolean result = isPalindrome(word);
	    
	    System.out.println(word + " is " + (result ? "a palindrome" : "not a palindrome"));
	}
}
