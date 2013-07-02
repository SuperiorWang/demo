package wcq;
/*这是写的一个OOP程序
 * 通过子类Student继承自子类People实现的
 * */

public class text3 {

	public static void main(String[] args) {
		People p1 = new People();
		p1.display();
		Student s1 = new Student("wangchaoqun",26,99.8,"shuxu");
		s1.display();
	}
}
