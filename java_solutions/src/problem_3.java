import java.math.BigInteger;

public class problem_3 {
    public static void main(String[] args) {

        long sum = 1;
        long goal = 600851475143L;
        int i = 1;
        BigInteger bigInt;

        while (sum != goal) {
            bigInt = BigInteger.valueOf(i);
            if(bigInt.isProbablePrime(100) && (goal % i == 0)){
                sum *= i;
            }
            i++;
        }
        System.out.println("largest prime factor: " + (i - 1));
    }
}
