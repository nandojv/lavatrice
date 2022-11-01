package corsoiniziodacapo;


import java.util.Scanner;

public class lavatrice {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		int programma=0;
		
		String programma1 ="colorati";
		String programma2="bianchi";
		String programma3="cotone";
		String programma4="delicati";
		
		int temperatura=0;
		
		String Temp="60";
		String temp2="30";
		String temp3="40";
		
		int tempo=0;
		
		String time="60minuti";
		String time1="30minuti";
		String time2="50minuti";
		
		
		
		
		do {
		Scanner p = new Scanner(System.in);
		
		System.out.println("scegli programma:1 colorati,2 bianchi,3 cotone,4 delicati"); 
		
		 programma =p.nextInt(); 
		 
		 Scanner te=new Scanner(System.in);
		 
		 System.out.println("temperatura:60°,30°,40°");
		 
		 temperatura=te.nextInt();
		 
		 Scanner ti=new Scanner(System.in);
		 
		 System.out.println("time:60,30,50");
		 
		 tempo=ti.nextInt();
			 
		
		 if(programma==0);{
			 
			 if(programma==1) {
			 System.out.println(temperatura +" " +time + "  "+ "programma delicato \n");
			 }
		 
			 else if(programma==2) {
				 System.out.print(temperatura+"  "+time2+"  programma lungo1");
			 }
			 else if(programma==3) {
				 System.out.print(temperatura+"  "+time1);
				 
			 }
			 
			 else if(programma==4) {
				 
				 System.out.print(temperatura+"  "+time2);
			 }
		
               else if(programma==4) {
				 
				 System.out.print(temperatura+"  "+time);
		 
		 }
		 
			 System.out.println(" \n  buona\n lavatrice");
		 
		 }
		}
			 while(programma !=1);
		
			 

		
}
}
	
	
		
	


