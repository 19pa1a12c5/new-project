package java_methods;

//public class Pvariable {
//
//	private String name;
//	
//
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Pvariable(String name)
//	{
//		this.name = name;
//	}
//	void a1(){
//		{
//		System.out.println("Name: " +name);
//	
//	
//		
//		}
//	}
//
//}
class self{
	private int phone;
private String name;
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	

}


 class Encapsulation_practice {

public static void main(String[] args) {
self myOBJ=new self();
myOBJ.setName("Surendra");
myOBJ.setPhone(913222);
System.out.println(myOBJ.getPhone());
System.out.println(myOBJ.getName());
}

}
