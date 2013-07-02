package wcq;

/*建立一个普通的people类
 * 包含成员名字和年龄
 * */
class People {
	private String name;
	private int age;
	
	/*带参的构造函数*/
	public People(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/*默认的构造函数*/
	public People()
	{
		name = "no name";
		age = -1; 
	}

	/*设置名字*/
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*设置年龄*/
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/*获取名字*/
	public String getName()
	{
		return name;
	}
	
	/*获取年龄*/
	public int getAge()
	{
		return age;
	}

	/*打印内容*/
	public  void display()
	{
		System.out.println("name = "+name+" ; "+"age = "+age);
	}
}
