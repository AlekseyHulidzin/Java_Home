class prime_nambers {
 
    // Function to print all the
    // prime numbers till N
    static void prime_N(int N)
    {
        // Declaring the variables
        int x, y, flg;
 
        // Printing display message
        System.out.println(
            "Вывод чисел до " + N
            + ":");
 

        for (x = 1; x <= N; x++) {

            if (x == 1 || x == 0)
                continue;
 
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            if (flg == 1)
                System.out.print(x + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int N = 1000;
 
        prime_N(N);
    }
}