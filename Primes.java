public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime =new boolean[n+1];

        // Initialize: Build a boolean arry of size n+1 and set all the elements with i > 1 to true
        for(int i = 0; i <= n; i++){
            if (i > 1) {
                isPrime[i] = true;
            }
            else{
                isPrime[i] = false;
            }
        }

        // Initialize the first prime number
        int p = 2;

        // loop through every p and cross its multipules until p <= sqrt(n) 
        while ((p * p) <= n) {
            if (isPrime[p]) {    
                // Cross out all the multiples of the current prime number
                for(int i = (p * p); i <= n; i += p){
                    isPrime[i] = false;
                }
            }
            p++;
        }

        // Print all the prime numbers and count how many there are
        int primeNumberCounter = 0;
        System.out.println(String.format("Prime numbers up to %d:", n));
        for(int i = 2; i <=n; i++){ // o and 1 are not prime, so starting from 2
            if (isPrime[i]) {
                System.out.println(i);
                primeNumberCounter++;
            }
        }
        
        int primePrecentage = (int)((double)primeNumberCounter / (n) * 100); // Calculate prime percentage
        System.out.println(String.format("There are %d primes between 2 and %d (%d%% are primes)",
         primeNumberCounter, n, primePrecentage));
    }
}