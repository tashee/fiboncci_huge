import java.util.*;

public class FibonacciHuge {

   private static long getFibonacciHuge(long n, long m) {
       long z = n % pisano(m);
	long i = 1;
	long p =0;
	long q = 1;
	long r = (p+q)%m;

	if (z<=1){return z;}
	
	while(i < z){
	    r =(p+q)%m;
	    p =q;
	    q= r;

	    ++i;
	    }
	return r;

	
    }

    private static long pisano(long m){

	long period =2;
	long fn2 = 1;
	long fn1 = 2%m;
	long fn = 3%m;

	while(true){
	    if (fn1 == 1 && fn ==1){
		break;
	    }
	    period++;
	    fn2 = fn1;
	    fn1 = fn;
	    fn = (fn1 +fn2)%m;
	}
	return period;
    }

      
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n,m));
    }


}

    

