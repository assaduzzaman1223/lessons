public class greetings{
	public static void main(String[]args){
		hello("tanaka");
		hello("yamamoto");
		hello("yoshino");
	}
	public static void hello(String name){
		if(name.equals("yoshino")){
			System.out.println("Aloha"+name+"!");
		}else{
			System.out.println("hello"+name+"!");
		}
	}
}