package com.xworkz.JavaTasks.boot;

public class MovieRunner {

	public static void main(String[] args) {

		String name = "Charlie the hymn of dharma ";
		System.out.println(name);
		name = name + "777 ";
		System.out.println(name);
		String concated = name.concat("Faith "); // string method 1
		System.out.println(concated);
		System.out.println(" ");

		int ref = concated.charAt(5); // string method 2
		System.out.println(ref);
		System.out.println(" ");

		int ref1 = concated.codePointAt(3); // string method 3
		System.out.println(ref1);
		System.out.println(" ");

		boolean Name = name.contains(name); // string method 4
		System.out.println(Name);
		System.out.println(" ");

		int Name1 = name.codePointBefore(5); // string method 5
		System.out.println(Name1);
		System.out.println(" ");

		int ref4 = concated.codePointCount(3, 5); // string method 6
		System.out.println(ref4);
		System.out.println(" ");

		int ref5 = name.compareTo(concated); // string method 7
		System.out.println(ref5);
		System.out.println(" ");

		int ref6 = name.compareToIgnoreCase(name); // string method 8
		System.out.println(ref6);
		System.out.println(" ");

		boolean ref7 = name.contentEquals(concated); // string method 9
		System.out.println(ref7);
		System.out.println(" ");

		boolean ref8 = concated.contentEquals(name); // string method 10
		System.out.println(ref8);
		System.out.println(" ");

		byte[] ref9 = concated.getBytes(); // string method 11
		System.out.println(ref9);
		System.out.println(" ");

		byte[] a = concated.getBytes(); // string method 12
		System.out.println(a);
		System.out.println(" ");

		byte[] b = concated.getBytes(); // string method 13
		System.out.println(b);
		System.out.println(" ");

		int c = concated.hashCode(); // string method 14
		System.out.println(c);
		System.out.println(" ");

		int d = name.indexOf(1); // string method 15
		System.out.println(d);
		System.out.println(" ");

		int e = name.indexOf(concated); // string method 16
		System.out.println(e);
		System.out.println(" ");

		int f = name.indexOf(c, e); // string method 17
		System.out.println(f);
		System.out.println(" ");

		String g = name.intern(); // string method 18
		System.out.println(g);
		System.out.println(" ");

		boolean h = name.isEmpty(); // string method 19
		System.out.println(h);
		System.out.println(" ");

		int i = name.length(); // string method 20
		System.out.println(i);
		System.out.println(" ");

		boolean j = concated.matches(concated); // string method 21
		System.out.println(j);
		System.out.println(" ");

		String k = concated.replace("Charlie", "Dharma"); // string method 22
		System.out.println(k);
		System.out.println(" ");

		String[] l = name.split("Rakshith Shetty"); // string method 23
		System.out.println(l);
		System.out.println(" ");

		String m = concated.toUpperCase(); // string method 24
		System.out.println(m);
		System.out.println(" ");

		String n = concated.trim(); // string method 25
		System.out.println(n);
		System.out.println(" ");

		String h1 = concated.toLowerCase(); // string method 26
		System.out.println(h1);
		System.out.println(" ");

	}

}
