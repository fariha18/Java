//Fariha_Rahman
//CS284
//I_pledge_my_honor_that_I_have_abided_by_the_Stevens_Honor_System

public class Complexity {
    
	
	public Complexity() {
		
	}
	
    public void method0(int n) {
    int counter = 0;
    for(int i = 0; i < n; i++) {
    System.out.println("Operation " + counter );
    counter ++;
       }
	 }
	 
    
	public static void method1(int n) {
		 int counter = 0;
		for (int i = 1; i <=n; i++) {
		       for (int j = 1; j <=n; j ++) {
		    	   counter ++;
		    	   System.out.println("Operation " + counter );
		       }
		
		       }
		   }
		
     
	
    public static void method2(int n) {
      int counter = 0;
      for (int i = 1; i <=n; i++) {
		       for (int j = 1; j <=n; j ++) {
		    	   for (int k = 1; k <= n; k++) {
	
		    		   counter ++;
			    	   System.out.println("Operation " + counter );
		    	   }
		   
		       }
		   } 
    }
    
    
    public static void method3(int n) {
    	int counter = 0;
    	for (int i = 1; i <=n; i *= 2) {
    		 counter ++;
	    	   System.out.println("Operation " + counter );
    	      
    	   }
     }
    
    public static void method4(int n) {
    	int counter = 0;
    	for (int i = 0; i <= n; i++){
    	    for(int j = 2; j < n; j = j * 2) {
    	    	 counter ++;
		    	   System.out.println("Operation " + counter );  
    	    }
    	}
     }
    
    public static void method5(int n) {
    	int counter = 0;
    	for (int i = 2; i < n; i *=i){   	
    		   counter ++;
	    	   System.out.println("Operation " + counter );       
    	   }
     }
    	
    
    public static int method6(int n){
    	if(n == 0) {
    		return 0;
    	}
    	else if(n == 1) {
    		return 1;
	    }
	    else {
	    	return method6(n - 1) + method6(n - 2);
	    	}
    	}

    
	
	public static void main(String[] args) {
		method1(10);
		method2(10);
		method3(10);
		method4(10);
		method5(10);
		method6(10);

	}

}
