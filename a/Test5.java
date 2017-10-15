package test1;

import test1.Graduate;
import test1.Student;
import test1.Undergraduate;

public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("创建Sutdent类的对象");
		Student stu1=new Student("陈宇豪", (byte)18, "高中");
		stu1.Show();
		System.out.println("创建Undergraduate类的对象");
		Undergraduate Und1=new Undergraduate("陈宇豪", (byte)21,"一本", "软件工程");
		Und1.Show();
		System.out.println("创建Graduate类的对象");
		Graduate Gra1=new Graduate("陈宇豪", (byte)23, "研究生", "数据库及大数据");
		Gra1.Show();
	}

}
 class Student {
	protected String name;//姓名
	protected byte age;//年龄
	protected String education;//学历
	public Student(String name1,byte i,String eduaction1) {
		// TODO Auto-generated constructor stub
		name=name1;
		age=i;
		education = eduaction1;
	}
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
	}
}
 class Undergraduate extends Student{
	public Undergraduate(String name1, byte age1, String eduaction1,String specialty1) {
		super(name1, age1, eduaction1);
		// TODO Auto-generated constructor stub
		specialty=specialty1;
	}
	private String specialty;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("专业："+specialty);
	}
}
 class Graduate extends Student{
	public Graduate(String name1, byte age1, String eduaction1,String direction1) {
		super(name1, age1, eduaction1);
		// TODO Auto-generated constructor stubs
		direction=direction1;
	}
	private String direction;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("研究方向："+direction);
	}

}
