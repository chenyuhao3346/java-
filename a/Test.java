public class Test {

	public static void main(String[] args) {
		DepositAccount saver = new DepositAccount();
		saver.Kaihu(123456, "�����", 0 , 5000 , 0.023);
		saver.Cunkuan(2000);
		System.out.println("��ѯ�����Ϊ��");	
		saver.Chaxun();
		saver.YLixi();
	}
}
class DepositAccount
	{private int id;
	private String name;
	private double money;
	private double dmoney;
	private double lilv;
	void Kaihu(int id1,String name1,double money1,double dmoney1,double lilv1)//����
	{
		id=id1;
		name=name1;
		money=money1;
		lilv=lilv1;
		dmoney=dmoney1;
		Chaxun();
		System.out.println("�����ʣ�"+lilv);	
		System.out.println("�����ɹ���");		
	}
	void DCunkuai(double dmoney1)//���ڴ��
	{
		dmoney1+=dmoney1;
		System.out.println("���ɹ������ڴ��"+dmoney1+"Ԫ��");	
	}
	void Cunkuan(double money1)//���ڴ��
	{
		money+=money1;
		System.out.println("���ɹ������"+money1+"Ԫ��");		
	}
	void Chaxun()//��ѯ���
	{
		System.out.println("�˻�����"+id);
		System.out.println("������"+name);
		System.out.println("��"+money);
		System.out.println("���ڴ�"+dmoney);
	}
	void YLixi()//����Ϣ��ʾ
	{
		System.out.println("��������ϢΪ��"+(lilv*dmoney));
	}
	void MLixi()//����Ϣ��ʾ
	{
		System.out.println("��������ϢΪ��"+(lilv*dmoney/12));
	}

}