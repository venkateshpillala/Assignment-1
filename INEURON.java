
public class INEURON {

	public static void main(String[] args) {
		
		int n=5;
		 for(int i=0;i<n;i++){ 
		     //For I 
		     for(int j=0;j<n;j++){
		         if(i==0||i==n-1||j==(n-1)/2){
		             System.out.print("*");
		         }
		         else{
		         System.out.print(" ");
		     }
		     }
		     System.out.print(" ");
		     //For N
		     for(int j=0;j<n;j++){
		         if(j==0||j==n-1||i==j){
		             System.out.print("*");
		         }
		         else{
		             System.out.print(" ");
		         }
		     }
		      System.out.print(" ");
		     //For E
		     for(int j=0;j<n;j++){
		         if(i==0||i==(n-1)/2||i==n-1||j==0){
		             System.out.print("*");
		         }
		         else{
		             System.out.print(" ");
		         }
		     }
		     
		     
		     System.out.print(" ");
		     //For U
		     for(int j=0;j<n;j++){
		         if((i<n-1&&j==0)||(i==n-1&&j>0&&j<n-1)||(j==n-1&&i<n-1)){
		             System.out.print("*");
		         }
		         else{
		             System.out.print(" ");
		         }
		     }
		    System.out.print(" ");
		     //For R
		     for(int j=0;j<n;j++){
		         if((i==0&&j<n-1)||(j==0)||(j==n-1&&i>0&&i<(n-1)/2)||(i==(n-1)/2&&j<n-1)||(j==n-1&&i>(n-1)/2)){
		             System.out.print("*");
		         }
		         else{
		             System.out.print(" ");
		         }
		     }
		    System.out.print(" ");
		     //For O
		     for(int j=0;j<n;j++){
		         if((i==0&&j<n-1&&j>0)||(j==0&&i<n-1&&i>0)||(j==n-1&&i>0&&i<(n-1))||(i==(n-1)&&j<n-1&&j>0)){
		             System.out.print("*");
		         }
		         else{
		             System.out.print(" ");
		         }
		     }
		    
		     System.out.print(" ");
		     //For N
		     for(int j=0;j<n;j++){
		         if(j==0||j==n-1||i==j){
		             System.out.print("*");
		         }
		         else{
		             System.out.print(" ");
		         }
		     }
		    //Outer loop 
		   System.out.println();   
		 }
	}

}
