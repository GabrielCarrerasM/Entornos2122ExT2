public class TestProblema1 {

    static String devuelveCadenaTexto()
    {
        String n = "";
        int inBucle = 50;
        int finBucle = 100;

        for (int i = inBucle; i <= finBucle; i++)
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
