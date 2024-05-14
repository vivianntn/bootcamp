public class DemoOperator {
  public static void main(String[] args) {
int x = 3;

x = x+1; // x=4
System.out.println("x=" + x); //string + int -> string

x++; // same as x = x+1
System.out.println("x=" + x);

x += 1; // same as x = x+1
System.out.println("x=" + x);

x += 2; // same as x = x+2
System.out.println("x=" + x);

++x; // same as x = x+1
System.out.println("x=" + x);

int y = 4;
y = y-1;
System.out.println("y=" + y);

y--;
System.out.println("y=" + y);

--y;
System.out.println("y=" + y);

y -= 1;
System.out.println("y=" + y);

// *=, /=
int p = 4;
p = p*2; // 8
p *= 2; //16
p /=4; 
System.out.println("p=" +p); //4

int z=10;
z = z%3; //1
int j = 10;
j %= 3; //1
System.out.println("z=" + z + ", j=" +j); //z=1, j=1

String s = "hello";
s=s + "world"; //helloworld
s += "!!!";
System.out.println("s="+s); //s = helloworld!!!

//> , < , >= , <=
boolean r1 = 10 > 3;//true, asking if 10>3 -> it's a true/false question
boolean r2 = 4>10;//false
boolean r3 = 10 >= 10;//true
boolean r4 = -9 <= 9;//true

// and (&&), or (||)
boolean r5 = 10 > 3 && 20>=20; // true AND true -> true, need to be true at the same time
boolean r6 = 10 > 3 && 4<4; // true AND false -> false

boolean r7 = 10 > 3 || 20>=20; // true OR true -> true, either one is true is ok
boolean r8 = 10 > 3 || 20<18; // true OR false -> true
boolean r9 = 3 > 10 || 20<10; // false OR false -> false

char c10 = 'A';
char c11 = 'B';
boolean r10 = c10 == c11; //false; asking if a value = another value, we use "==", "=" is for assigning value
boolean r11 = 'c' != 'o'; // true; checking is a value is NOT = another value, we use "!="

boolean r12 = 10/2 > 5*3; // false

    int n = 3;
    int result = n++ * 3; // originial n multiply 3 first, assigb 9 to the result, then n = n + 1;
    System.out.println(result); // 9
    System.out.println(n); // 4

    int m = 4;
    int result2 = ++m * 5; // m = m+1 first, multiply 5, assign 25 to result2
    System.out.println(result2); // 25
    System.out.println(m); // 5

    int k = 4;
    int result3 = k++ * 7 * ++k; 
    System.out.println(result3); // 168 = (4 * 7) * 6
    
  }
}