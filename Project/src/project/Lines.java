
package project;


public class Lines {
    public boolean[] lineStatus = new boolean[5];

	public synchronized void setRed (int lineNo)
	{
		lineStatus[lineNo]=true;//true means 'under use'
	          
        }


	public synchronized void setGreen (int lineNo)
	{
            
		lineStatus[lineNo]=false;//not in use
                
	}

	// the following method is never called (for the moment)
	public synchronized void waitGreen(int lineNo) throws InterruptedException	// wait until a green light appears at lineNo
        {
	
			 System.out.println("Line " + lineNo+ " is  not available!!!!! You have TO WAIT");
                        setGreen(lineNo);
	 }
}
