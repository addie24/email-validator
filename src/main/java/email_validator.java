
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
		
		//rule 3, there shouldn't be any spacing in the valid email
		int c3=0;
		for(int i=0;i<email.length();i++){
			if(email.charAt(i)==' ')
				c3++;
		}
		if(c3!=0){
			System.out.println("Test three passed");
			c++;
		}
		
	/**********************************/	
		
		//rule 4, the first character shouldn't be "-"
		if(email.charAt(0)=='-'){
			
			System.out.println("Test four passed");
			c++;
		}
	/**********************************/
			
		return c;
		}

}
