
package project;


import java.io.IOException;

public class Railway
{


   public static void main(String[] args) throws IOException 
   {
     
      
	 Lines line = new Lines();
	 line.lineStatus[0]= false;
	 line.lineStatus[1]= false;
	 line.lineStatus[2]= false;
	 line.lineStatus[3]= false;

	Train trA = new Train("Train A", line, 0, 50, 0);  //String aName, Lines theLine,int stStation, int finalDistance int destination station
	Train trB = new Train("Train B", line, 1, 50, 1);
	Train trC = new Train("Train C", line, 2, 50, 2);
	Train trD = new Train("Train D", line, 3, 50, 3);
        Train trE = new Train("Train E", line, 2, 50, 2);

	System.out.println(trA.trainName + " starts at " + trA.currStation + " and has speed "+ trA.speed + " km/h");
	System.out.println(trB.trainName + " starts at " + trB.currStation + " and has speed "+ trB.speed + " km/h");
	System.out.println(trC.trainName + " starts at " + trC.currStation + " and has speed "+ trC.speed + " km/h");
	System.out.println(trD.trainName + " starts at " + trD.currStation + " and has speed "+ trD.speed + " km/h");
        System.out.println(trE.trainName + " starts at " + trE.currStation + " and has speed "+ trE.speed + " km/h");
        
	trA.start();
	trB.start();
	trC.start();
	trD.start();
        trE.start();
       
     

   }
}
