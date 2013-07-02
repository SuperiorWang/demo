package wcq;
/*学生类，继承自People,添加了两个私有成员，一个是功课，一个是分数*/
class Student extends People
{
	private double score;
	private String assignment;
	
	public Student()
	{	
		this.score  = 0;
		this.assignment = "no assignment";
	}
	
	public Student(String name,int age,double score,String assignment)
	{
		super(name,age);
		this.assignment = assignment;
		this.score = score;
	}
	
	public void setScore(double score)
	{
		this.score = score;
	}
	
	public void setAssignment(String assignment)
	{
		this.assignment = assignment;
	}

	public double getSocre()
	{
		return score;
	}
	
	public String getAssignment()
	{
		return assignment;
	}

	@Override
	public void display() {
		System.out.println("age = " + this.getAge());
		System.out.println("name = "+ this.getName());
		System.out.println("Assignment = "+ assignment);
		System.out.println("score = "+ score);
	}

}
