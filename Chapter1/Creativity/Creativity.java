import java.util.Scanner;

public class Creativity
{

    public static void main(String[] args){
    int[] arr = new int[]{3,4};
    float[] floatArray  = new float[]{11,333,91,4,5,623,12,123,453};
    //findSmallestLargest(arr);
    //determineCorrectArith();
    //findPair(arr);
    //System.out.println(norm(arr,3));
    //divideTwo();
    //isDifferentEachOther(floatArray);
    //shuffleArray();
    //allFormedString();
    }


    /**
     * C-1.23 Write a short Java program that takes two arrays a and b of length n storing int
     * values, and returns the dot product of a and b. That is, it returns an array c of
     * length n such that c[i] = a[i]·b[i], for i = 0,...,n−1.
     */
    private static int[] findDotProduct(int[] a, int[] b){
        int n = a.length;
        int[] c = new int[n];
        for (int i = 0; i <n; i++) {
            c[i] = a[i]*b[i];
        }
        return c;
    }

    /**
     * C-1.22 Write a short Java program that outputs all possible strings formed by using the
     * characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
     */
    private static void allFormedString(){
        StringBuilder sb = new StringBuilder("catdog");
        char c;
        int num = 0;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length()-1; j++) {
                c = sb.charAt(j);
                sb.deleteCharAt(j);
                sb.insert(j+1,c);
                num++;
                System.out.println(sb+" "+num);
            }
        }
    }


    /**
     * C-1.21 Write a Java method that takes an array containing the set of all integers in the
     * range 1 to 52 and shuffles it into random order. Your method should output each
     * possible order with equal probability.
     */
    private static void shuffleArray(){
        int[] arr = new int[52];
        for (int i = 1; i <52 ; i++) {
            arr[(int) (Math.random()*52)] = i;
        }
        for (int value : arr) {
            System.out.print(value+" ");
        }

    }


    /**
     * C-1.20 Write a Java method that takes an array of float values and determines if all the
     * numbers are different from each other (that is, they are distinct).
     */
    private static void isDifferentEachOther(float[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("They are same values in array");
                    flag = true;
                    break;
                }

            }
        }
        if (!flag){
            System.out.println("All array elements are different with each other");
        }
    }


    /**
     * C-1.19 Write a Java program that can take a positive integer greater than 2 as input and
     * write out the number of times one must repeatedly divide this number by 2 before
     * getting a value less than 2.
     */
    private static void divideTwo(){
        Scanner in = new Scanner(System.in);
        int num;
        while (true){
        if (in.hasNextInt() && in.nextInt()>=2)
        {
        num=in.nextInt();
        while (num/2 >=2){
            num = num/2;
        }
        break;
        }else{
            System.out.println("Please enter a number greater than 2");
        }
        }
        in.close();
        System.out.println(num);
    }

    /**
     * C-1.18 The p-norm of a vector v = (v 1 ,v 2 ,...,v n ) in n-dimensional space is defined as
     * For the special case of p = 2, this results in the traditional Euclidean norm,
     * which represents the length of the vector. For example, the Euclidean norm
     * of a two-dimensional vector with coordinates (4,3) has a Euclidean norm of
     * √ 4 2
     * +3 2 =
     * √ 16+9 = √ 25 = 5. Give an implementation of a method named
     * norm such that norm(v, p) returns the p-normvalue of v and norm(v) returns the
     * Euclidean norm of v, where v is represented as an array of coordinates.
     */
    private static double norm(int[] v, int p){
        int sum = 0;
        for (int value : v) {
            sum += Math.pow(value, 2);
        }
        return Math.pow(sum,1.0/p);
    }
    private static double norm(int[] v){
       return norm(v,2);
    }


    /**
     * C-1.16 Write a short programthat takes as input three integers, a, b, and c, from the Java
     * console and determines if they can be used in a correct arithmetic formula (in the
     * given order), like “a+b= c,” “a = b−c,” or “a∗b= c.”
     */
    private static void determineCorrectArith(){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b= in.nextInt();
        c = in.nextInt();
        in.close();
        if (a+b == c && a == b-c && a*b==c){
            System.out.println("Those Variable can be used in a correct arithmetic formula");
        }
        System.out.println("a: "+a+" b: "+b+" c: "+c);
    }


    /**
     * C-1.17 Write a short Java method that takes an array of int values and determines if there
     * is a pair of distinct elements of the array whose product is even.
     */
    private static void findPair(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
            if (arr[i] == arr[j] && i!=j) {
                System.out.println(arr[i]);
            break;
            }
            }
        }
    }

    /**
     * C-1.15 Write a pseudocode description of a method for finding the smallest and largest
     * numbers in an array of integers and compare that to a Java method that would do
     * the same thing. Later look at this
     */
    private static void findSmallestLargest(int[] arr){
        int min=arr[0], max=arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Min Value = "+min+" Max Value"+max);
    }


    /**
     *C-1.14 Write a pseudocode description of a method that reverses an array of n integers,
     * so that the numbers are listed in the opposite order than they were before, and
     * compare this method to an equivalent Java method for doing the same thing.
     */
   private static int[] reverseArr(int[] arr){
        int temp,j = 0;
        for (int i = arr.length-1; i >= arr.length/2;i--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }

        return arr;
    }
}