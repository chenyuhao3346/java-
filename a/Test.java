public class Test {

	public static void main(String[] args) {
		DepositAccount saver = new DepositAccount();
		saver.Kaihu(123456, "陈宇豪", 0 , 5000 , 0.023);
		saver.Cunkuan(2000);
		System.out.println("查询余额结果为：");	
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
	void Kaihu(int id1,String name1,double money1,double dmoney1,double lilv1)//开户
	{
		id=id1;
		name=name1;
		money=money1;
		lilv=lilv1;
		dmoney=dmoney1;
		Chaxun();
		System.out.println("年利率："+lilv);	
		System.out.println("开户成功！");		
	}
	void DCunkuai(double dmoney1)//定期存款
	{
		dmoney1+=dmoney1;
		System.out.println("存款成功！定期存款"+dmoney1+"元！");	
	}
	void Cunkuan(double money1)//活期存款
	{
		money+=money1;
		System.out.println("存款成功！存款"+money1+"元！");		
	}
	void Chaxun()//查询余额
	{
		System.out.println("账户名："+id);
		System.out.println("姓名："+name);
		System.out.println("余额："+money);
		System.out.println("定期存款："+dmoney);
	}
	void YLixi()//年利息显示
	{
		System.out.println("您的年利息为："+(lilv*dmoney));
	}
	void MLixi()//月利息显示
	{
		System.out.println("您的月利息为："+(lilv*dmoney/12));
	}

}