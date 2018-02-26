
public class CommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "ABAB";
		String str2 = "BABAB";
		
		String out="";
		
		if(str1.length() ==0 || str2.length() ==0){
			out="";
		}
		else
		{
			int array[][]=new int[str1.length()][str2.length()];
			for(int i=0;i<str1.length();i++){
				
				for(int j=0;j<str2.length();j++){
				
					if(str1.charAt(i) == str2.charAt(j)){
					
						if(i==0 || j==0){
							array[i][j]=1;
						}
						else
						{
							array[i][j] = array[i-1][j-1]+1;	
						}
						
						if(array[i][j] > out.length()){
							out=str1.substring(i-array[i][j] +1 , i+1);
						}
					}
				}
			}
		}
			
		System.out.println("Common substring is: "+ out);

	}

}
