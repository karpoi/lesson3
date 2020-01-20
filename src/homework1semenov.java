public class homework1semenov {
    //задание 1
    public static void main (String [] args) {
        System.out.println("Homework1");
        System.out.println(value(1, 2, 3, 4));
        System.out.println(check(5, 6, true));
        System.out.println(negORpos(4));
        System.out.println(negcheck(5));
        System.out.println(greetings("Vitaly"));
        System.out.println(leap(25));



//задание 2
        int q = 3;
        long w = 2000000l;
        float e = 3.333f;
        double r = 3.5;
        boolean t = true;
        byte i = -11;
        short o = 1000;
        System.out.println(q + w + e + r + i + o);
        System.out.println(t);
        System.out.println(q%4);
    }
    //задание 3
    public static float value (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    //задание 4
    public static boolean check (int z, int x, boolean y) {
        int q = z + x;
        if (q >= 10 && q <= 20) {
            y = true;
        } else {
            y = false;
        }
        return y;

    }
    //задание 5
    public static int negORpos(int z) {
      if (z >= 0)  {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
      return z;
    }
    //задание 6
    public static boolean negcheck(int z) {
        if (z <= 0)  {
            return true;
        } else {
            return false;
        }

    }
    //задание7
    public static String greetings(String name) {
       String greet = ("Привет," + name + "!");
       return greet;
    }
//задание 8
    //* Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
         public static String leap(int q) {
         String year;
         boolean z;
         if (q % 4 == 0 || q % 400 == 0)  {
            z = true;
      } else {
           z = false;
      }
        if (q % 100 == 0) {
           z = false;
        }
      if  (z = true) {
             year = ("Високосный");
        } else {
             year = ("Не високосный");
       }
        return year;
   }
}
