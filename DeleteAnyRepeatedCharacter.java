package Delete_Any_Repeated_Character;

import java.util.*;

public class DeleteAnyRepeatedCharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Character> hs = new HashSet<Character>(); 
		
		System.out.println("Enter the String input: ");
		String str = in.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			if(hs.contains(str.charAt(i))) {
			} else {
				if(str.charAt(i) != ' ') {
					hs.add(str.charAt(i));
				}
			}
		}
		
		System.out.println(hs);
		
	}
}
