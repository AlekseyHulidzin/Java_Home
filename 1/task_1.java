import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task_1 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        int result,summa=0,product=1;
        String number;

        System.out.print("Ввод: ");
        number = user_input.nextLine();
        result = Integer.parseInt(number);
        System.out.print("Треугольное число ");        
        for (int i =1; i<=result+1; i++){
            summa +=i;
            product *=i;

            if (i == result){
                System.out.println(i+"="+summa);
                break;
            }
            
            System.out.print(i+"+");
            
        }
        System.out.print("Произведение чисел ");        
        for (int i =1; i<=result+1; i++){
            summa +=i;

            if (i == result){
                System.out.print(i+"="+product);
                break;
            }
            
            System.out.print(i+"*");
            
        }




    }
}