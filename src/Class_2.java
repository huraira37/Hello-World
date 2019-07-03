public class Class_2 {
    public static void main(String args[]) {
        double number = 5.2, resultNumber;
        resultNumber = 389;

        boolean flag = false;
        System.out.println("+resultNumber = " + +resultNumber);
        System.out.println("+resultNumber = " + -resultNumber);
        System.out.println("+resultNumber = " + ++resultNumber);
        System.out.println("+resultNumber = " + --resultNumber);

        System.out.println("+number = " + +number);
        // number is equal to 5.2 here.
        System.out.println("-number = " + -number);
        // number is equal to 5.2 here.
        // ++number is equivalent to number = number + 1
        System.out.println("number = " + ++number);
        // number is equal to 6.2 here.
        // -- number is equivalent to number = number - 1
        System.out.println("number = " + --number);
        // number is equal to 5.2 here.
        System.out.println("!flag = " + !flag);
        // flag is still false.     }


        String test = "asdf";
        //double test = 46657;
        boolean result;
        result = test instanceof String;
        System.out.println(result);

        class Animal {
        }
        class Dog1 extends Animal {//Dog inherits Animal
            // public static void main(String args[]){    Dog1 d=new Dog1();
            // System.out.println(d instanceof Animal);//true    }   }


        }

    }
}