package daili;



//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("裴华彬");

		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("裴华彬");

		Proxy daili = new Proxy(jiaojiao);

		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
*/
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("裴华彬");

		Pursuit zhuojiayi = new Pursuit(jiaojiao);

		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
	}
}
*/