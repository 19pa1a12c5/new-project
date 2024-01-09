package java_methods;

public class string_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contains
		 String myStr = "Surendra";
		    System.out.println(myStr.contains("Sure"));
		    System.out.println(myStr.contains("k"));
		    System.out.println(myStr.contains("dra"));
		    
		    //chartAt()
		    String mySto = "Hello";
		    char result = mySto.charAt(3);
		    System.out.println(result);
		    
		    //CodePointAt()
		    String mySti = "Hello";
		    int results = mySti.codePointAt(2);
		    System.out.println(results);
		  
		    //CodePointBeforeAt()
		    String mySt = "Hello";
		    int resul = mySt.codePointBefore(2);
		    System.out.println(resul);
		    
		    //CodePointCount
		    String mySr = "Hello";
		    int resu = mySr.codePointCount(0,5 );
		    System.out.println(resu);
		    
		    //CompareTo()
		    String myStt2 = "Hello";
		    String myStt4 = "Hello";
		    System.out.println(myStt2.compareTo(myStt4)); 
		    
		    //LastIndexOf()
		    String mySir = "Hello human harsha, you are a great human.";
		    System.out.println(mySir.lastIndexOf("human"));
		    
		    //Empty()
		    String myStr1 = "jfnkjj";
		    String myStr2 = "";
		    System.out.println(myStr1.isEmpty());
		    System.out.println(myStr2.isEmpty());
		    
		    //HashCode
		    String myStr9 = "sure";
		    System.out.println(myStr9.hashCode());
		    
		    //Trim
		    String myStr0 = "             jfhg          ";
		    System.out.println(myStr0);
		    System.out.println(myStr0.trim());
		    
		    //toUpperCase
		    String txt = "Hai Brooo";
		    System.out.println(txt.toUpperCase());
		    System.out.println(txt.toLowerCase());
		    
		    //Concat
		    String firstName = "Surendra ";
		    String lastName = "Valavala";
		    System.out.println(firstName.concat(lastName));
		    
		    //copyValueOf()
		   // char[] myStr3 = {'k', 'i', 'l', 'l', 'o'};
		  //  String myStr4 = "";
		  //  myStr4 = myStr4.copyValueOf(myStr1, 0, 4);
		  //  System.out.println("Returned String: " + myStr4);

	}

}
