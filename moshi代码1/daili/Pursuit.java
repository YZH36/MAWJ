package daili;

//追求者类
public class Pursuit implements GiveGift
{
	SchoolGirl	mm;

	public Pursuit(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 送你电脑");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " 送你耳机");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " 送你桌子");
	}
}

/*
//追求者类
public class Pursuit
{
	SchoolGirl	mm;

	public Pursuit(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 送你项链");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " 送你鲜花");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " 送你水果");
	}
}
*/
