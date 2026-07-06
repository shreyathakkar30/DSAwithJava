public class Recursion1 {
    public static void printNumb(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);

    }

    public static void main(String[] args){
        //What is Recursion: A function calling itself
        //Recursion class 1
        //Question: Print numbers from 5 to 1
        int n = 5;
        printNumb(n); //n = 5


    }
}
