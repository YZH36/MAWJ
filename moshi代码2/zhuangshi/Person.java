package zhuangshi;

//Person类（ConcreteComponent）
public class Person
{
	private String	name;

	public Person()
	{
	}

	public Person(String name)
	{
		this.name = name;
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}









/*

//Person类
public class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
*/

/*
//person类代码
public class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void wearTShirts()
	{
		System.out.println("小上衣");
	}

	public void wearBigTrouser()
	{
		System.out.println("A字裙");
	}

	public void wearSneakers()
	{
		System.out.println("小皮鞋");
	}

	public void wearSuit()
	{
		System.out.println("包包");
	}

	public void wearTie()
	{
		System.out.println("发卡");
	}

	public void wearLeatherShoes()
	{
		System.out.println("皮鞋");
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
*/