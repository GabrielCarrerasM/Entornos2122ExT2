public class TestProblema1 {

    static String devuelveCadenaTexto()
    {
        String n = "";
        int num1 = 50;
        int num2 = 100;

        for (int i = num1; i <= num2; i++)
        {
            if (i % 3 == 0)
            {
                n += "Fizz";
            }
            if (i % 5 == 0)
            {
                n += "Buzz";
            }
            if (i % 3 == 0 && i % 5 == 0)
            {
                n += "FizzBuzz";
            }
            else {
                n += "" + i;
            }
            System.out.println(n);
        }
        return n;
    }

}
