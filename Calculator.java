package Calculator;
import java.util.Scanner;
import Calculator.CalcOperations;

class Calculator{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Input:");
int i = input.nextInt();
System.out.println(add(input,1));
};
}
