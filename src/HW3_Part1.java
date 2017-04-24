/* Ali Anıl REYHAN
 * 150115029
 * HW-1 part-1
 */

public class HW3_Part1 {
	
	public static void main(String[] args){
	
		
		int count = 0;
		int num = 2;
		
		//Starting a loop for checking prime numbers and separating palindromic ones.
		while(count!=100){
			
			boolean isNumPrime = true;
			
			//Checking for prime numbers.
			for(int i=2 ; i<=Math.sqrt(num) ; i++){
				if(num%i==0){
					isNumPrime = false;	
				}	
			}
			
			//Getting the reverse.
			if (isNumPrime){
				int palind=num;
				int reverse = 0;
				
				while(palind != 0){
					int remain = palind % 10;
					reverse= (reverse*10) + remain;
					palind = palind/10;
				}
				
				//Checking if the number is palindromic.
				if(reverse==num){
					
					//Increasing the count and printing the number.
					count++;
					System.out.print(num+ " ");
					
					if(count%10==0){
						//Moving the cursor to next line after 10 prints.
						System.out.println("");
					}
				}
			}
			
			//Increasing the num value.
			num++;
		}
		
		
		
		
	}
}
	


