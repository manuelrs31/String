package com.exercise16string.app;

import com.exercise16string.model.Tuneador;

public class StringApp {

	public static void main(java.lang.String[] args)
	{
		String cad1 = " no se porque, estoy escribiendo a lo menso ";
		String cad2 = " no se porque, estoy escribiendo a lo menso ";
		
		String[] cads = {};
		System.out.println(cad1.charAt(3));
		System.out.println(cad1.codePointAt(4));
		System.out.println(cad1.codePointAt(4));
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("estoy"));
		System.out.println(String.valueOf(3));
		System.out.println(cad1.endsWith("menso"));
		System.out.println(cad2.trim()+cad2.trim());
		System.out.println(cad1.indexOf('d'));
		System.out.println(cad1.length());
		//String[] cads = cad1.split(",");
		//for(String c:cads)
		//{
		//	System.out.println(c);
		//}
		for (int i=0; i<cads.length;i++)
		{
			System.out.print(cads[i]);
		}
		//System.out.println(cad1.split("."));
		
		String cad3=" ";
		cad3 = cad1.replace('e', 'a');
		System.out.println(cad3);
		System.out.println(cad3.toLowerCase());
		System.out.println(cad3.toUpperCase());
		
		// algoritm for reversing strings
		
		String reversedString="";
		for (int index=cad1.length()-1;index>=0;index--)
		{
			reversedString=reversedString+cad1.charAt(index);
		}
		
		
		String[] miscadenas = {cad1,cad2, cad3};
		String[] misnuevascadenas = Tuneador.tunea(miscadenas);
		
		for(int i=0;i<misnuevascadenas.length;i++)
		{
			System.out.println(misnuevascadenas[i]);
		}
		
		int[] misenteros = {5,3,8,1,9,7,8,};
		System.out.println("la media aritmetica es: "+ Tuneador.mediaVector(misenteros));
		
		
		// TODO Auto-generated method stub

	}

	
}
