import java.util.*;
public class Anagram {

public static boolean ang(String str,String str1) {
//Complete this Code Snippet
int n1=str.length();
int n2=str1.length();
str.toLowerCase();
str1.toLowerCase();

if(n1!=n2) {
		return false;
	}
//Complete the Code Snippet
int[] Ar1=new int[26]; 
// int[] Ar2=new int[26];
	for(int i=0;i<n1;i++){
	Ar1[str.charAt(i)-'a']++;
	Ar1[str1.charAt(i)-'a']--;
	}
	// for(int i=0;i<n2;i++){
	// if(Ar1[i]!=Ar2[i]){
	// 	return false;
		
	// }
	// }
	for(int index:Ar1){
		if(index!=0){
			return false;
		}
	}
	return true;
}

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String str1=in.nextLine();
	System.out.println(ang(str, str1));
}
}
