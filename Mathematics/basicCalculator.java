/*Write a program that works as a simple calculator.
1.It reads a character (ch)
2.If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). It then performs appropriate appropriate operation between numbers and print the number.
3.If ch is 'X' or 'x', the program terminates.
4.If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).
*/

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
		while(true){
			ch = sc.next().charAt(0);
			int z = 0;
			
			while (ch != 'x' && ch != 'X') {
				if (ch != '-' && ch != '+' && ch != '/' && ch != '*' && ch != '%') {
					System.out.println("Invalid operation. Try again.");
					break;
				}
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();

				if (ch == '+') {
					z = n1 + n2;
					System.out.println(z);
					break;
				} else if (ch == '-') {
					z = n1 - n2;
					System.out.println(z);
					break;

				} else if (ch == '/' && n2 != 0) {
					z = n1 / n2;
					System.out.println(z);
					break;

				} else if (ch == '*') {
					z = n1 * n2;
					System.out.println(z);
					break;
				} else if (ch == '%' && n2!=0) {
					z = n1 % n2;
					System.out.println(z);
					break;
				} else {
					System.out.println("Invalid operation. Try again.");
					break;
				}
			}
            if (ch == 'x' || ch == 'X') {
				System.exit(0);
				break;
			}
		}
    }
}

/*
Sample Input
* 
1 
2 
/ 
4 
2 
+ 
3 
2 
; 
X

Sample Output
2 
2 
5 
Invalid operation. Try again.
*/