public class Driver
{
	private static int GAposX = 500; 
	private static int GAposY = 500;
	private static int rectangleAmount = 1;
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
		
		rLoc[0][0] = 250; //X coord
		rLoc[0][1] = 10; //Y coord
		rLoc[0][2] = 500; //W coord
		rLoc[0][3] = 20; //H coord
		Rectangle R1 = new Rectangle(rLoc[0][0],rLoc[0][1],rLoc[0][2],rLoc[0][3], colour);
		GA.addRectangle(R1);

	}
	
}