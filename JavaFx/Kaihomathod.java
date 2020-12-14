import java.util.Scanner;
public class Kaihomathod{
public static void main(String[]args){

		String msg=Kaihomathod();
System.out.println(msg);
	}
	public static String Kaihomathod(){
		Scanner sc=new Scanner(System.in);
		System.out.println("your name >");
		String name=sc.nextLine();

		String msg="hello,"+name;
		return msg;
	}
}