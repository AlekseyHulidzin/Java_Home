import java.util.Scanner;

public class task_3 {
   public static void main(String[] args) throws Exception {

      double num1;
      double num2;
      double ans;
      char op;

      Scanner reader = new Scanner(System.in);

      System.out.print("Введите первое число: ");
      num1 = reader.nextDouble();

      System.out.print("\nЗнак действия (+, -, *, /): ");
      op = reader.next().charAt(0);

      System.out.print("Введите второе число: ");
      num2 = reader.nextDouble();

      switch (op) {

         case '+':
            ans = num1 + num2;
            break;
         case '-':
            ans = num1 - num2;
            break;
         case '*':
            ans = num1 * num2;
            break;
         case '/':
            ans = num1 / num2;
            break;
         default:
            System.out.printf("Введен не верный символ!");
            return;
      }
      System.out.print("Результат:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
