import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if(input.isBlank()) {
				scanner.close();
				System.exit(0);
			}
			String command[] = input.split(" ");
			switch(command[0]) {
			case "IN":
			    break;
			case "OUT":
			    break;
			case "RTO":
			    break;
			case "RF":
			    break;
			case "RA":
			    break;
			case "RE":
			    break;
			case "RC":
			    break;
			case "RT":
			    break;
			case "RO":
			    break;
			case "RL":
			    break;
			case "REO":
			    break;
			case "RDO":
			    break;
			case "DF":
			    break;
			default:
				System.out.println("Instrução inválida");	
			}
		}
	}
}
