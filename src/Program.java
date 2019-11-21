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
				endSession(library);
			    break;
			case "RTO":
				registerDocumentType(library, command);
			    break;
			case "RF":
				registerEmployee(library, command);
			    break;
			case "RA":
				registerAuthor(library, command);
			    break;
			case "RE":
				registerEditor(library, command);
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

	private static void registerEditor(Library library, String[] command) {
		String editorName = command[1];
		if(library.hasEditor(editorName)) {
			System.out.println("Editora existente.");
		}
		else {
			int editorIdentifier = library.registerEditor(editorName);
			System.out.println("Editora registada com código " + editorIdentifier);
		}
	}

	private static void registerAuthor(Library library, String[] command) {
		String authorName = command[1];
		if(library.hasAuthor(authorName)) {
			System.out.println("Autor existente.");
		}
		else {
			int authorIdentifier = library.registerAutor(authorName);
			System.out.println("Autor registado com código " + authorIdentifier);
		}
	}

	private static void registerEmployee(Library library, String[] command) {
		String employeeName = command[1];
		if(library.hasEmployee(employeeName)) {
			System.out.println("Funcionário existente.");
		}
		else {
			int employeeIdentifier = library.registerEmployee(employeeName);
			System.out.println("Funcionário registado com código " + employeeIdentifier);
		}
	}

	private static void registerDocumentType(Library library, String[] command) {
		String documentType = command[1];
		if(library.hasDocumentType(documentType)) {
			System.out.println("Tipo de obra existente.");
		}
		else {
			library.registerDocumentType(documentType);
			System.out.println("Tipo de obra registado com sucesso.");
		}
	}

	private static void endSession(Library library) {
		if(!library.hasSession()) {
			System.out.println("Sem sessão iniciada.");
		}
		else {
			library.endSession();
			System.out.println("Sessão terminada.");
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
