import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Stack<Double> st = new Stack<>();
        Double res;
        Double num1;
        Double num2;

        while (true) {
            System.out.println("Введите оператор (+, -, *, /) или 'cancel' для отмены последней операции или 'stop' для выхода: ");
            String operator = iScanner.next();
            operator.substring(operator.length() - 1);
            if ("+-*/".contains(operator)) {
                if (st.empty()) {
                    System.out.println("Введите число 1: ");
                    num1 = iScanner.nextDouble();
                    iScanner.nextLine();
                    st.push(num1);
                    System.out.println("Введите число 2: ");
                    num2 = iScanner.nextDouble();
                    iScanner.nextLine();
                    st.push(num2);
                    res = operation(operator, num1, num2);
                    st.push(res);
                    System.out.println("Результат: " + res);
                } else if (st.size() == 1) {
                    System.out.println("Введите число: ");
                    num1 = iScanner.nextDouble();
                    iScanner.nextLine();
                    st.push(num1);
                    res = operation(operator, st.get(0), num1);
                    st.push(res);
                    System.out.println("Результат: " + res);
                    st.remove(st.get(0));
                    st.remove(st.get(0));
                } else {
                    System.out.println("Введите число: ");
                    num1 = iScanner.nextDouble();
                    iScanner.nextLine();
                    st.push(num1);
                    res = operation(operator, st.get(2), num1);
                    st.push(res);
                    System.out.println("Результат: " + res);
                    st.remove(st.get(0));
                    st.remove(st.get(0));
                }
              
            } else if (operator.equalsIgnoreCase("cancel")) {
                System.out.println("Отмена последней операции.");
                System.out.printf("Предыдущий результат: %.2f \n", st.get(0));
                st.remove(st.get(1));
                st.remove(st.get(1));
            } else if (operator.equalsIgnoreCase("stop")) {
                break;
            }
    }
    iScanner.close();
        }
    
        private static double operation(String operator, Double num1, Double num2) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    return num1 / num2;
                default:
                    throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
    }
}

