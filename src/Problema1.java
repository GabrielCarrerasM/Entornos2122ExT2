public class Problema1 {

    static String devuelveCadenaTexto()
    {
        String n = "";


        for (int i = 0; i <= 20; i++)
        {
            boolean multi3 = i % 3 == 0;
            boolean multi5 = i % 5 == 0;
            boolean multi3YMulti5 = i % 3 == 0 && i % 5 == 0;
            boolean multi7 = i % 7 == 0;
            boolean multi11 = i % 11 == 0;

            if (multi3)
            {
                n += "Fizz";
            }
            if (multi5)
            {
                n += "Buzz";
            }
            if (multi3YMulti5)
            {
                n += "FizzBuzz";
            }
            if (multi7)
            {
                n += "Foo";
            }
            if (multi11)
            {
                n += "Boo";
            }
            else {
                n += "" + i;
            }
            System.out.println(n);
        }
        return n;
    }

    public static void main(String[] args) {

        String n = devuelveCadenaTexto();


    }

}
