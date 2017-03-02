
public class email_validator {
	
	//contructor
	public email_validator(){
		
	}
	public int checkIfValid(String email){
		int c=0;
		
		//rule 1, email should contain @ symbol
		int c1=0;
		for(int i=0;i<email.length();i++){
			if(email.charAt(i)=='@')
				c1++;
		}
		if(c1==1){
			System.out.println("Test one passed");
			c++;
		}
	/**********************************/
		
		//rule 2, email should contain atleast one .
		int c2=0;
		for(int i=0;i<email.length();i++){
			if(email.charAt(i)=='.')
				c2++;
		}
		if(c2>=1){
			System.out.println("Test two passed");
			c++;
		}
	/**********************************/
		
		
			
		return c;
		}

}
