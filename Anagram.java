
import java.util.*;

public class Anagram {

public static boolean ang(String str,String str1) {
//Complete this Code Snippet
int n1=str.length();
int n2=str1.length();

if(n1!=n2) {
		return false;
	}
//Complete the Code Snippet

str=str.toLowerCase();
str1=str1.toLowerCase();

int i=0;
for(i=0;i<n1;i++){
	if( !str.contains(""+str1.charAt(i)) ){
		break;

	}
}

if(i<n1){
	return false;
}

return true;
}


public static void main(String[] args) {

System.out.println("Program to check palindrom or Not");
Scanner sc=new Scanner(System.in);
System.out.println("Enter first String");
String str=sc.nextLine();
System.out.println("Enter second String");
String str1=sc.nextLine();
   
	System.out.println(ang(str, str1));
}}
