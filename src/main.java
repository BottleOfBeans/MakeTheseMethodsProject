public class main {
    public static void main(String[] args){
        //Code
        average(1,3);
        System.out.println(averageReturn(1,3));
        System.out.println(reversed("123456789"));
        System.out.println(vowels("aeioueqwghghb"));
        System.out.println(factorials(5));
        factorFinder(32);    }

    public static void average(int q,int w){
        System.out.println("The average is: "+((q+w)/2));
    }

    //Program that also takes the average of two numbers but returns it instead of printing it
    public static float averageReturn(int q, int w){
        return((q+w)/2);
    }

    //Program that reverses the order of a string and returns it backwards
    public static String reversed(String q){
        String newStr ="";
        for(int x = q.length()-1; x>=0; x--){
            newStr += Character.toString(q.charAt(x));
        }
        return newStr;
    }

    //Program that counts and returns the amount of vowels in a string
    public static int vowels(String q){
        int vowels =0;
        for(int x = q.length()-1; x>=0; x--) {
            if (q.charAt(x) == 'a' || q.charAt(x) == 'e' || q.charAt(x) == 'i' | q.charAt(x) == 'o' || q.charAt(x) == 'u')
                vowels++;
        }
        return vowels;
    }

    //Calculates the factorial of a number and returns it.
    public static int factorials(int q){
        int total =1;
        for(int x = 0; x<q; x++) {
            total += total*x;
        }
        return total;
    }

    //Calculates the number of factors for a number and prints it
    public static void factorFinder(int q){
        int totals =0;
        for(int x=1; x<q; x++){
            if(q%x == 0){
                totals ++;
            }
        }
        System.out.println( totals+1);
    }
}
