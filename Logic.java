public class Logic{

		//public static SimpleInterest[] simpleInterests = new SimpleInterest[5]; 
		//public static short saveCounter=0;


		public float calculateSI(SimpleInterest si)throws Exception{

			int p = si.getP();
			int t = si.getT();
			int r = si.getR();

			FileAccess fa = new FileAccess();
			fa.saveToFile(si);

			float value = (p*t*r/100);
			return value;
			

			/*simpleInterests[saveCounter] = si;
			saveCounter++;
			return value;*/
		}


			/*public SimpleInterest getSimpleInterestByIndex(int index){

			SimpleInterest si2 = simpleInterests[index];
				return si2;
			}*/

		 public void getAllSimpleInterest()throws Exception{

	
			FileAccess fa = new FileAccess();
			String withDelimiter = (fa.getFromFile());

			String withoutDelimiter1 = withDelimiter.replace("$","\n");
			String withoutDelimiter2 = withoutDelimiter1.replace("#"," ");

			System.out.println("String replacement:"+withDelimiter);
			System.out.println("$ replacement:"+withoutDelimiter1);
			System.out.println("# replacement:"+withoutDelimiter2);
		}
}


