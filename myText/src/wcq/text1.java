package wcq;

/*�������飬���������鸳ֵ����ӡ*/
public class text1 {

	/*����Ĵ�ӡ����*/
	static void display(int arr[])
	{
		for (int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	/*���鸳ֵ*/
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
