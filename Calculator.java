import java.util.*;
public class Calculator {
	int op1,op2;
	String op;
	
	Calculator(int i1,int i2,String operand){
		this.op1=i1;
		this.op2=i2;
		this.op=operand;
	}

	double cal(int op1,int op2,String op) {
		double ans=0;
		switch(op) {
		case "+": ans=(double)(op1+op2);
		          break;
		case "-": ans=(double)(op1-op2);
		          break;
		case "*": ans=(double)(op1*op2);
		          break;
		case "/": ans=(double)op1/(double)(op2);
		          break;
		
		}
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of two operands:");
		int op1=sc.nextInt();
		int op2=sc.nextInt();
		System.out.println("Enter the operand to perform the operation:");
		String op=sc.next();
		new Calculator(op1,op2,op);
		Calculator c=new Calculator(op1,op2,op);
		
		double result=c.cal(op1,op2,op);
		System.out.println("The result is: "+result);
	}
		
}

/*OUTPUT:
 Enter the values of two operands:
3 5
Enter the operand to perform the operation:
+
The result is: 8.0



Enter the values of two operands:
4 7
Enter the operand to perform the operation:
*
The result is: 28.0


Enter the values of two operands:
62 8
Enter the operand to perform the operation:
-
The result is: 54.0


Enter the values of two operands:
64 8
Enter the operand to perform the operation:
/
The result is: 8.0


 */
 