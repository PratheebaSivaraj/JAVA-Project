package project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Train extends Thread
{
    
	public String trainName;
	public float speed;
	public int distanceRun=0;
	public float timeRun=0;
	public int distanceMax=0;
	public Lines line;
	public int startStation;
	public int currStation;
    public Train(String aName, Lines theLine,int stStation, int finalDistance,int currentStation ) throws IOException 
	{
		
            trainName= aName;
		line= theLine;
		startStation= stStation;
		distanceMax= finalDistance;
		speed=20;
		currStation=currentStation;
	}


    @Override
	public void run()
	{
           
		System.out.println(trainName + " begins from Station no " + startStation + " with travelling " + distanceRun + "km.");

			if( startStation<4)
			{
				System.out.println(trainName + " attempts to use line " + currStation);
                                if(line.lineStatus[currStation]==false)//no train in the station
                                {
                   System.out.println("the line no " + currStation + " is free? " + line.lineStatus[currStation]);
                line.setRed(currStation);//train track is filled with train
                System.out.println(trainName + " can pass from line " + currStation);

                                    while(distanceRun < distanceMax)
                                    {
                distanceRun= distanceRun + 5;
                timeRun= (float)(timeRun+ (distanceRun/speed)*60 + 5);
                                    }
                                   
System.out.println( trainName + " has arrived at Station " + currStation + " add has made " + distanceRun + "km");
System.out.println(trainName + " has arrived at last at his lastStation witch is " + currStation + " and has made " + distanceRun + " \n"+timeRun);
       FileWriter fw;
                                    try {
                                        fw = new FileWriter("E:\\train.txt");
                                        BufferedWriter bw =new BufferedWriter(fw);
                                        bw.write("Train Name: "+trainName + " Arraive Time: " + timeRun+"distance Traveled:"+distanceRun);	
                                        bw.flush();
		                        bw.close(); 
                                    } catch (IOException e) {}
                                }
                               else
                                {
                                    try {
                                        line.waitGreen(currStation);  
                                    } catch (InterruptedException ex) {}
                                }                       
                        }
	}

}

