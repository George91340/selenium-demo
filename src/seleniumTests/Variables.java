package seleniumTests;


public class Variables {

	public static void main(String[] args) {
		Variables instance = new Variables();
		
		String input = "this is a test string";
		String input2 = "this is an even number    string";
		String input3 = "a";
		System.out.println(reverseString(input));
		System.out.println(instance.reverseCharacters(input));
		System.out.println(reverseString(input2));
		System.out.println(instance.reverseCharacters(input2));
		System.out.println(reverseString(input3));
	}
	
	static String reverseString(String string){
		String reverse = "";
		
		// check if length of string is <= 1
		if (string.length() <= 1)
		{
			reverse = string;
			System.out.println("string is of size 1, no changes made");
		}
		else{
			String words[] = string.split("\\s+");
			for (String word : words){
				reverse = word + " " + reverse;
			}
		}
		return reverse.trim();
	}
	
	 String reverseCharacters(String input){
		String reverse = "";
		char[] characters = new char[input.length()];
		input.getChars(0, input.length(), characters, 0);
		for (char character : characters){
			reverse = character + reverse;
		}
		return reverse.trim().replaceAll("\\s+", " ");
	}
}
