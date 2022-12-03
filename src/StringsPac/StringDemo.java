package StringsPac;

public class StringDemo {

	public static void main(String[] args) {
		//methods of strings
		
		System.out.println("Methods of Strings");
		String sl=new String("Hello World");
		System.out.println(sl.length());//11
		
		
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));//lcome
		
		//string comparison
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));//8
		
		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());//true
		
		//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());//hello
		
		//replace
		String s6="Heido";
		String replace=s2.replace('d', 'i');//hello
		
		//equals
		String x="Welcome to java";
		String y="WeLcomE to jaVa";
		System.out.println(x.equals(y));//false
		
		System.out.println("\n");
		System.out.println("creating StringBuffer");//creating StringBuffer
		
		//creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java");
		s.append("Enjoy your learning");
		System.out.println(s);//Welcome to JavaEnjoy your learning
		
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEI");
		System.out.println(sb);//hEIllo
		
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);//EIllo
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating String Builder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);//HappyLearning
		
		//conversion
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		String str="Hello";
		
		//Conversion from StringObject to StringBuffer
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);//olleH
		
		//conversion from String object to StringBuilder
		StringBuilder sbl=new StringBuilder(str);
		sbl.append("World");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);//HelloWorld


		

		
		
		

	}

}
