package Me;
public class Student {
	int no;
	String id;
	String name;
	String class1;
	
	Student(int no,String id,String name,String class1){
	this.no=no;
	this.id=id;	
	this.name = name;	
	this.class1 = class1;		
	}
	@Override
	public String toString() {
		return "Stuedent [no=" + no + ", id=" + id + ", name=" + name + ", class1=" + class1 + "]";
	}
	
}
