package secondwork;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an  integer for secnods:");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds% 60;
		System.out.println(secnods + " seconds is " + minutes + 
				" minutes and " + remainingSeconds + " seconds");
	}
}
