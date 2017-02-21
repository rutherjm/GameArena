public class Driver
{
	private static int GAposX = 500; 
	private static int GAposY = 500;
	private static int[][] rectangleLoc = new int[100][2]; //for column, 0 = x, 1 = y

	public static void main(String[] arguments)
	{
		initiateGameArena();
	}
	public static void initiateGameArena()
	{
		
		rectangleLoc[0][0] = 100; //X coord
		rectangleLoc[0][1] = 50; //Y coord
		GameArena GA = new GameArena(GAposX,GAposY);

		
	}
}