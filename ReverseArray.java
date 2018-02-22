
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={1,8,3,5,9,6};
		int traverseLength=array.length/2-1;
		
		for(int i=0;i<=traverseLength;i++)
		{
			int temp = array[i];
			array[i] = array[array.length -1 -i];
			array[ array.length -1 -i]= temp;
		}
		
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]+" , ");
		

	}

}
