class Solution {
    public int countPrimes(int n) {
        // int count = 0;
        // for(int i=2;i<n;i++){
        //     boolean isPrime = true;
        //     for(int j=2;j<i;j++){
        //         if(i % j == 0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if(isPrime){
        //         count++;
        //     }
        // }
        // return count;

        //------better------If a number is composite, it must have at least one factor less than or equal to its square root.
        // int count = 0;
        // for(int i=2;i<n;i++){
        //     boolean isPrime = true;
        //     for(int j=2;j*j<=i;j++){
        //         if(i % j == 0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if(isPrime){
        //         count++;
        //     }
        // }
        // return count;

        //---------optimal (Sieve of Eratosthenes) -------
        boolean isPrime[] = new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i] = true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j < n;j += i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count++;
    }
}