package Me;

import java.util.ArrayList;
import java.util.List;

public class Apptest {
	
	public static void main(String[] args) {
		List<Student> list =new ArrayList<Student>();
		
		Student stu1 =new Student(1,"20170217140","黄军华","17级物联4班");
		Student stu2 =new Student(2,"20170217140","黄军华","17级物联4班");
		Student stu3 =new Student(3,"20170217140","黄军华","17级物联4班");
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
		
	}
	
}
