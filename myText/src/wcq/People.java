package wcq;

/*����һ����ͨ��people��
 * ������Ա���ֺ�����
 * */
class People {
	private String name;
	private int age;
	
	/*���εĹ��캯��*/
	public People(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/*Ĭ�ϵĹ��캯��*/
	public People()
	{
		name = "no name";
		age = -1; 
	}

	/*��������*/
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*��������*/
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/*��ȡ����*/
	public String getName()
	{
		return name;
	}
	
	/*��ȡ����*/
	public int getAge()
	{
		return age;
	}

	/*��ӡ����*/
	public  void display()
	{
		System.out.println("name = "+name+" ; "+"age = "+age);
	}
}
