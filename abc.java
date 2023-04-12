package facebook;

public class abc {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=2; i<8; i+=2) {
			
			for(int j=8; j>i; j-=2) {
				if(i>=j/2) {
					continue;
				}
				else {
					sum+=i+j;
				}
			}
		}
		System.out.println(sum);
	}
}
