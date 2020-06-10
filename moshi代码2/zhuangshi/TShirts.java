package zhuangshi;

//具体服饰类（ConcreteDecorator）
public class TShirts extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("格子衫");
	}
}

/*
//各类服饰
public class TShirts implements Finery
{
	public void show()
	{
		System.out.println("格子衫");
	}
}
*/