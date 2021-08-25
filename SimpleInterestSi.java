import java.util.Scanner;

class SimpleInterestSi{


	public static void main(String bbc[]) throws Exception{

	Scanner sc = new Scanner(System.in);
	SimpleInterest si = new SimpleInterest();


	System.out.println("Wellcome to SI Applications:");

	int a = 2;

	//bollean flag = true;

		while(true){

			System.out.println("Enter your choice \n1.To calculate SI \n2.To ViewAllSis \n3.To Quit\n ");
			int choice = sc.nextInt();

		if(choice==1){

			System.out.println("Enter the value of p:");
			si.setP(sc.nextInt());

			System.out.println("Enter the value of t:");
			si.setT(sc.nextInt());

			System.out.println("Enter the value of r:");
			si.setR(sc.nextInt());


			//SimpleInterestSi sii = new SimpleInterestSi();
			Logic l = new Logic();
			float result = l.calculateSI(si);
			System.out.println("Interest value:"+result);
			}

		else if(choice==2){

			//SimpleInterestSi sii = new SimpleInterestSi();
			Logic l = new Logic();
			l.getAllSimpleInterest();
			


			//SimpleInterestSi sii2 = new SimpleInterestSi();
			//SimpleInterest si2 = new SimpleInterest();
 
			//sii2.getSimpleInterestByIndex(saveCounter-1);
			//SimpleInterest si2 = sii.getSimpleInterestByIndex(saveCounter-1);
			//float res = sii2.calculateSi(si2);
			//System.out.println("Interest value:"+res);


			}
			else{
				break;
			}
		}
	}
}




		