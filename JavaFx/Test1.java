 class Student{
 private String name;
 private String Favourite;

public void sayHello(){
	System.out.println("hello!my name is "+this.name);
	}
	public void setName(String Data){
		this.name=Data;
		System.out.println("hello!my name is "+name);
	}
	public void setFavourite(String f){
		System.out.println("i love "+f);
	}
}
public class Test1{
	public static void main(String[]args){
		Student yamada =new Student();
	//yamada. name="Yamada Taro";
		yamada.setName("yamada taro");
		yamada.setFavourite(" monster");
	///	System.out.println(yamada.name);
	Student tanaka=new Student();
	//tanaka.name="masahiko tanaka";
	//System.out.println(tanaka.name);
	tanaka.setName("masahiko tanaka");
	tanaka.setFavourite(" ice latte");
	String msg="Hello";
	System.out.println(msg);
		////sayHello();
	tanaka.sayHello();
	yamada.sayHello();
	}
 }