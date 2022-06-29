package conditional_loops_03;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Geeks", nstr="";
        char ch;
       
       System.out.print("Original word: ");
       System.out.println("Geeks"); //Example word
       
       for (int i=0; i<str.length(); i++)
       {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
       }
       System.out.println("Reversed word: "+ nstr);
    }
}

/*StringBuilder input1 = new StringBuilder();
input1.append(input);
input1.reverse();
System.out.println(input1);*/

/***********************************/

/*By using toCharArray
char[] try1 = input.toCharArray();

for (int i = try1.length - 1; i >= 0; i--)
    System.out.print(try1[i]);*/

/***********************************/

/*String input = "Geeks For Geeks";
char[] temparray = input.toCharArray();
int left, right = 0;
right = temparray.length - 1;

for (left = 0; left < right; left++, right--) {
    // Swap values of left and right
    char temp = temparray[left];
    temparray[left] = temparray[right];
    temparray[right] = temp;
}

for (char c : temparray)
    System.out.print(c);
System.out.println();
*/

/***********************************/

/*String input = "Geeks For Geeks";
char[] hello = input.toCharArray();
List<Character> trial1 = new ArrayList<>();

for (char c : hello)
    trial1.add(c);

Collections.reverse(trial1);
ListIterator li = trial1.listIterator();
while (li.hasNext())
    System.out.print(li.next());*/

/***********************************/

/*String str = "Geeks";

// conversion from String object to StringBuffer
StringBuffer sbr = new StringBuffer(str);
// To reverse the string
sbr.reverse();
System.out.println(sbr);*/
