public class IntroToConstructors {

    public IntroToConstructors (String [] name){


    }


    public IntroToConstructors (int [] ints){

    }


    public IntroToConstructors (double [] doubles){

    }


    public  IntroToConstructors (short [] shorts){

    }

    public IntroToConstructors (boolean isPrime) {

    }
    public IntroToConstructors (int a,int b){

    }




    public static void main(String[] args) {
        IntroToConstructors intro = new IntroToConstructors(new String[] {"name"});

        IntroToConstructors intro2 = new IntroToConstructors(new int[] {1,2,3});

        byte b = 3;
        IntroToConstructors intro3 = new IntroToConstructors(b,3);


    }
}
