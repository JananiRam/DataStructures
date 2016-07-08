class Array_Palindrome
{
	
	public static void main(String args[])
	{
		String str="Jananiinanaj";
		int first=0,last=str.length()-1;
		if(isPalindrome(str,first,last))
		{
			System.out.println("Palindrome");	
		}
		else
			System.out.println("Not a palindrome");
		 
	}
	static boolean isPalindrome(String str,int first,int last) 
	{
		while(first<last &&  (str.charAt(first)==str.charAt(last)))
		{	
				first++;last--;
		}
		if(first<last)
			return false;
		else
			return true;	
	}
}