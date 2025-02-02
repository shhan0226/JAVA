package fibonachi;

public class Fibonachi {
	

	 public static int[] calculate(int n) {
	        if(n < 0)
	            return null;

	        int result[] = new int[n+1];
	        result[0] = 1;
	        if(n != 0)
	            result[1] = 1;
	        if(n > 1) {
	            for(int i = 2; i <= n; i++)
	                result[i] = result[i-1] + result[i-2];
	        }
	        return result;
	    }
}
