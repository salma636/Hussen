import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner (System.in);
System.out.println("please entre the first number");
double fn ,sn  ;
char opr;
fn = x.nextDouble();
System.out.println("please entre the second number");
sn = x.nextDouble();
System.out.println("please entre the operation");
opr = x.next().charAt(0);

	{if (opr == '+'){
	System.out.println(fn+sn);

}else if (opr == '-'){
	System.out.println(fn-sn);

}
else if (opr == '*'){
	System.out.println(fn*sn);

}else if (opr == '/'){
	System.out.println(fn/sn);

}else if (opr == '%'){
	System.out.println(fn%sn);

} else {System.out.println("not valid");}
	}System.out.print("please click any key to exit");
	}
}
