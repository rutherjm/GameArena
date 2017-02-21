public class Driver
{
	private static int GAposX = 500; 
	private static int GAposY = 500;
	private static int rectangleAmount = 6;
	private static int[][] rLoc = new int[rectangleAmount][4]; //for column, 0 = x, 1 = y, 2 = w, 3 = h
	private static GameArena GA = new GameArena(GAposX,GAposY);
	
	public static void main(String[] arguments)
	{
		initiateGameArena();
	}
	
	public static void initiateGameArena()
	{
		Rectangle arenaColour = new Rectangle((GAposX - (GAposX / 2)),(GAposY - (GAposY / 2)),GAposX,GAposY, "BLUE");
		GA.addRectangle(arenaColour);

		generateRectangles();

	}
	public static void generateRectangles()
	{
		String colour = "BLACK"; //colour
		int pathSize = 40;
		rLoc[0][0] = 250; //X coord
		rLoc[0][1] = 60; //Y coord
		rLoc[0][2] = 400; //W coord
		rLoc[0][3] = pathSize; //H coord
		Rectangle R1 = new Rectangle(rLoc[0][0],rLoc[0][1],rLoc[0][2],rLoc[0][3], colour);
		GA.addRectangle(R1);
		
		rLoc[1][0] = 450; //X coord
		rLoc[1][1] = 250; //Y coord
		rLoc[1][2] = pathSize; //W coord
		rLoc[1][3] = 420; //H coord
		Rectangle R2 = new Rectangle(rLoc[1][0],rLoc[1][1],rLoc[1][2],rLoc[1][3], colour);
		GA.addRectangle(R2);
		
		rLoc[2][0] = 250; //X coord
		rLoc[2][1] = 440; //Y coord
		rLoc[2][2] = 400; //W coord
		rLoc[2][3] = pathSize; //H coord
		Rectangle R3 = new Rectangle(rLoc[2][0],rLoc[2][1],rLoc[2][2],rLoc[2][3], colour);
		GA.addRectangle(R3);

		rLoc[3][0] = 50; //X coord
		rLoc[3][1] = 250; //Y coord
		rLoc[3][2] = pathSize; //W coord
		rLoc[3][3] = 420; //H coord
		Rectangle R4 = new Rectangle(rLoc[3][0],rLoc[3][1],rLoc[3][2],rLoc[3][3], colour);
		GA.addRectangle(R4);
		
		rLoc[4][0] = 250; //X coord
		rLoc[4][1] = 250; //Y coord
		rLoc[4][2] = pathSize; //W coord
		rLoc[4][3] = 420; //H coord
		Rectangle R5 = new Rectangle(rLoc[4][0],rLoc[4][1],rLoc[4][2],rLoc[4][3], colour);
		GA.addRectangle(R5);
		
		rLoc[5][0] = 250; //X coord
		rLoc[5][1] = 250; //Y coord
		rLoc[5][2] = 400; //W coord
		rLoc[5][3] = pathSize; //H coord
		Rectangle R6 = new Rectangle(rLoc[5][0],rLoc[5][1],rLoc[5][2],rLoc[5][3], colour);
		GA.addRectangle(R6);
		
				Ball PacMan = new Ball(40,100, 15,"YELLOW");
		GA.addBall(PacMan);
	}
	
}