package tasks;

import java.util.Scanner;

public class Pair_Check {

	public static void main(String[] args) 
	{
		Pair_Check p = new Pair_Check();
		p.print_get_user_number();

	}
	
	private void print_get_user_number() 
	{
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers in combination of zeros and ones:");

		String user_num = s.next();

		char[] num_array = new char[user_num.length()];

		for (int i = 0; i < user_num.length(); i++) {
			num_array[i] = user_num.charAt(i);
		}

		for (int i = 0; i < num_array.length; i++) {
			if (i == num_array.length - 1) {
				break;
			}

			if (num_array[i] != num_array[i + 1]) {
				count++;

				i++;
			} else {

			}

		}
		System.out.println("Total Pairs: " + count);

	}
}