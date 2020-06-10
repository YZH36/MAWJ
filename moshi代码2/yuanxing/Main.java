package yuanxing;

//客户端代码保持不变
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("叶宗好");
		a.setPersonalInfo("男", "19");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setWorkExperience("1998-2003", "ZZ企业");

		a.display();
		b.display();
		c.display();
	}
}

/*
//客户端代码
public class Main
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Resume a = new Resume("叶宗好");
		a.setPersonalInfo("男", "19");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setWorkExperience("1998-2003", "ZZ企业");

		a.display();
		b.display();
		c.display();
	}
}
*/
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("叶宗好");
		a.setPersonalInfo("男", "19");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setPersonalInfo("男", "24");

		a.display();
		b.display();
		c.display();
	}
}
*/
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		ConcretePrototype1 p1 = new ConcretePrototype1("I");
		ConcretePrototype1 c1 = (ConcretePrototype1) p1.clonePrototype();

		System.out.println("Cloned:" + c1.getId());
	}
}
*/
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("叶宗好");
		a.setPersonalInfo("男", "19");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = new Resume("叶宗好");
		b.setPersonalInfo("男", "19");
		b.setWorkExperience("1998-2000", "YY公司");

		Resume c = new Resume("叶宗好");
		c.setPersonalInfo("男", "19");
		c.setWorkExperience("1998-2000", "ZZ公司");

		a.display();
		b.display();
		c.display();
	}
}
*/

