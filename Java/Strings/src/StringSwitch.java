
public class StringSwitch {

	public static void main(String[] args) {

		String command = "cancel";

		switch (command) {
		case "connect":
			System.out.println("Connecting");
			break;

		case "cancel":
			System.out.println("Canceling");
			break;

		default:
			System.out.println("Command error");
			break;

		}

	}

}
