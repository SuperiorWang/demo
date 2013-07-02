package wcq;

/*定义数组，并给你数组赋值及打印*/
public class text1 {

	/*数组的打印函数*/
	static void display(int arr[])
	{
		for (int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	/*数组赋值*/
	static void init(int arr[])
	{
		int i = 0;
		while (i<arr.length)
		{
			arr[i] = i+1;
			i++;
		}
		//return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		init(arr);
		
		display(arr);
	}
}
