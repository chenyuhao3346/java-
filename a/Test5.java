package test1;

import test1.Graduate;
import test1.Student;
import test1.Undergraduate;

public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Sutdent��Ķ���");
		Student stu1=new Student("�����", (byte)18, "����");
		stu1.Show();
		System.out.println("����Undergraduate��Ķ���");
		Undergraduate Und1=new Undergraduate("�����", (byte)21,"һ��", "�������");
		Und1.Show();
		System.out.println("����Graduate��Ķ���");
		Graduate Gra1=new Graduate("�����", (byte)23, "�о���", "���ݿ⼰������");
		Gra1.Show();
	}

}
 class Student {
	protected String name;//����
	protected byte age;//����
	protected String education;//ѧ��
	public Student(String name1,byte i,String eduaction1) {
		// TODO Auto-generated constructor stub
		name=name1;
		age=i;
		education = eduaction1;
	}
	void Show(){
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
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
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
		System.out.println("רҵ��"+specialty);
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
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
		System.out.println("�о�����"+direction);
	}

}
