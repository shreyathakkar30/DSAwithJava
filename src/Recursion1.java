public class Recursion1 {
    //question:1
    public static void printNumb1(int m){
        //question: print 1 to 5
        if(m == 6){
            return;//base case
        }
        System.out.println(m);
        printNumb1(m+1);
    }
    //question: 2
    public static void printNumb(int n){
        if (n == 0){
            return;//base case
        }
        System.out.println(n);
        printNumb(n-1);//recursive

    }
    //question:3
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;


        }

        sum += i;
        printSum(i+1, n, sum);

    }

    public static void main(String[] args){
        //What is Recursion: A function calling itself
        //Recursion class 1
        //Question: Print numbers from 5 to 1
        int n = 5;// fot 5 to 1
        int m = 1;// for 1 to 5
        printNumb(n); //n = 5
        printNumb1(m);

        //Question 3: print sum of first n natural numbers
        //two approaches available which are ascending and descending
        //base case will be reach to n
        printSum(1, 5, 0);



    }
}
