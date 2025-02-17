import java.lang.StringBuilder;
import java.io.*;
import java.util.*;

public class ReverseString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Vnesi poljuben niz: ");
		String a = in.next();
		StringBuilder niz = new StringBuilder();

		for(int i=a.length(); i>0; i--){
			niz.append(a.charAt(i-1));
		}
		System.out.println(niz);
	}
}
