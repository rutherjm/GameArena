public class Driver
{
	private static int GAposX = 500; 
	private static int GAposY = 500;
	private static int rectangleAmount = 1;
	private static int[][] rLoc = new int[rectangleAmount][4]; //for column, 0 = x, 1 = y, 2 = w, 3 = h

	public static void main(String[] arguments)
	{
		initiateGameArena();
	}
	public static void initiateGameArena()
	{
		GameArena GA = new GameArena(GAposX,GAposY);

		rLoc[0][0] = 250; //X coord
		rLoc[0][1] = 0; //Y coord
		rLoc[0][2] = 500; //W coord
		rLoc[0][3] = 10; //H coord
		
		Rectangle R1 = new Rectangle(rLoc[0][0],rLoc[0][1],rLoc[0][2],rLoc[0][3], "CYAN");
		GA.addRectangle(R1);
	}
	
}