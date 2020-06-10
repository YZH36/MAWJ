package zhuangshi;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小裴");

		System.out.println("第一种装扮：");

		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();

		pqx.decorate(person);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();

		System.out.println("第二种装扮：");
		
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();

		px.decorate(person);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
	}
}


/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();

		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}
}
*/
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小裴");

		System.out.println("第一种装扮:");
		Finery dtx = new TShirts();
		Finery kk = new BigTrouser();
		Finery pqx = new Sneakers();

		dtx.show();
		kk.show();
		pqx.show();
		person.show();

		System.out.println("第二种装扮:");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();

		xz.show();
		ld.show();
		px.show();
		person.show();
	}
}
*/


/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小裴");

		System.out.println("第一种装扮:");

		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();

		System.out.println("第二种装扮:");

		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
*/
