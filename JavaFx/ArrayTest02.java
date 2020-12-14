import java.util.Scanner;
public class ArrayTest02{
public static void main(String[] args) {
		String password="asb";
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("input password");
			String userData=sc.nextLine();
			if(password.equals(userData)){
				break;
			}
		}
	}
}