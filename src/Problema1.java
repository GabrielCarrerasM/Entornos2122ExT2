public class Problema1 {

    static String devuelveCadenaTexto()
    {
        String n = "";

        for (int i = 0; i <= 20; i++)
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
            if (i % 7 == 0)
            {
                n += "Foo";
            }
            if (i % 11 == 0)
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
