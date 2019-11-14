import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Library library = null; // vai mudar
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
				startNewSession(library, command);
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

	private static void startNewSession(Library library, String[] command) {
		String identifier = command[1];
		if(library.hasSession()) {
			System.out.println("Existe sessão iniciada.");
		}
		else {
			if(!library.hasEmployee(identifier)) {
				System.out.println("Funcionário inexistente.");
			}
			else {
				library.newSession(identifier);
				System.out.println("Sessão iniciada.");
			}
		}
	}
}
