import java.io.*;

public class FileAccess{

		boolean saveToFile(SimpleInterest si) throws Exception{

		FileWriter fw = new FileWriter("siDetails.txt",true);
		PrintWriter pw = new PrintWriter(fw);

		String siString = si.getP()+"#"+si.getT()+"#"+si.getR();
		pw.println(siString);

		pw.flush();
		pw.close();
		fw.close();
		

		int a=2;
			if(a>1)
			{
				return true;
			}else{
				return false;
			}
		}
		
		String getFromFile()  throws Exception {

			FileReader fr = new FileReader("siDetails.txt");
			BufferedReader br = new BufferedReader(fr);
			String tmp = br.readLine();
			String result = " ";
				
				while(tmp!=null){

					result = result+tmp+"$";
					tmp=br.readLine();
					}

					br.close();
				return result;
				}
}