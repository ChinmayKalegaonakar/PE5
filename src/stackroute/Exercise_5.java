package stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Exercise_5 ex3 = new Exercise_5();
		while(true) {
			ex3.drawMenu();
			n = sc.nextInt();
			ex3.selector(n);
		}
		
	}
	public void selector(int input) {
		Scanner sc = new Scanner(System.in);
		String inputString="",inputString2="";
		int n=0,m=0,count=0;
		long l =0;
		int[] intArray = null;
		String[] stringArray = null;
		switch(input) {
		
		case 1:System.out.println("Enter Items Seperated by space");
				inputString = sc.nextLine();
				stringArray = inputString.split(" ");
				List<String>  list = new ArrayList<String>();
				for(String s:stringArray)
					list.add(s);
				System.out.println("Enter item to replace");
				inputString = sc.nextLine();
				System.out.println("Enter item to replace with");
				inputString2 = sc.nextLine();
				System.out.println("The modified list is " + CollectionsFunction.updateList(list,inputString,inputString2));
				break;
		case 2:System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				System.out.println("Output :" + CollectionsFunction.wordCount(inputString).toString());
				break;
		case 3:System.out.println("Enter Every item seperated by space");
				inputString = sc.nextLine();
				System.out.println("Output :" + CollectionsFunction.moreThan2(inputString).toString());
				break;
		case 5: System.out.println("Enter val1 and val2 seperated by space");
				inputString = sc.nextLine();
				Map<String,String> hm = new HashMap<String,String>();
				stringArray = inputString.split(" ");
				hm.put("val1", stringArray[0]);
				hm.put("val2", stringArray[1]);
				System.out.println("Output "+CollectionsFunction.replaceOneTwo(hm).toString());
				break;
		case 6: System.out.println("Enter Every item seperated by space");
				inputString = sc.nextLine();
				System.out.println("Output :" + CollectionsFunction.sortHashSet(inputString).toString());
				break;
		default:System.out.println("Wrong input ------- exiting");break;
		}
	}
	public void drawMenu() {
		System.out.println("---------EXERCISE 4------------");
		System.out.println("| 1 - replace in list         |");
		System.out.println("| 2 - count word occurences   |");
		System.out.println("| 3 - more than 2 words       |");
		System.out.println("| 4 - different class         |");
		System.out.println("| 5 - replace val1 and val2   |");
		System.out.println("| 6 - Hash Set Sort           |");
		System.out.println("| anything else exits         |");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| ENTER YOUR CHOICE           |");
		System.out.println("-------------------------------");
	}

}
