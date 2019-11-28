import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Library library = new LibraryClass();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if(input.isBlank()) {
				scanner.close();
				System.exit(0);
			}
			String commands[] = input.split(" ");
			switch(commands[0]) {
			case "IN":
				commandIN(library, commands);
			    break;
			case "OUT":
				commandOUT(library);
			    break;
			case "RTO":
				commandRTO(library, commands);
			    break;
			case "RF":
				commandRF(library, commands);
			    break;
			case "RA":
				commandRA(library, commands);
			    break;
			case "RE":
				commandRE(library, commands);
			    break;
			case "RC":
				commandRC(library, commands);
			    break;
			case "RT":
				commandRT(library, commands);
			    break;
			case "RO":
				commandRO(library, scanner, commands);
			    break;
			case "RL":
				commandRL(library, commands);
			    break;
			case "REO":
				commandREO(library, commands);
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

	private static void commandREO(Library library, String[] commands) {
		String documentCode = commands[1];
		String readerCode = commands[2];
		String date = commands[3];
		if(!library.hasDocumentCode(documentCode)) {
			System.out.println("Obra inexistente.");
		}
		else if(!library.hasReaderCode(readerCode)) {
			System.out.println("Leitor inexistente.");
		}
		else if(!library.canLoan(readerCode)) {
			System.out.println("Limite de empréstimos excedido.");
		}
		else if(library.isBlocked(readerCode)) {
			System.out.println("Leitor bloeuqado.");
		}
		else if(!library.isAvailableForLoan(documentCode)) {
			System.out.println("Obra indisponível.");
		}
		else {
			library.createLoan(documentCode, readerCode, date);
			System.out.println("Empréstimo registado com sucesso.");
		}
	}

	private static void commandRL(Library library, String[] commands) {
		String readerName = commands[1];
		String readerContact = commands[2];
		if(library.hasReader(readerName, readerContact)) {
			System.out.println("Leitor existente.");
		}
		else {
			int readerCode = library.createReader(readerName, readerContact);
			System.out.println("Leitor registado com código " + readerCode);
		}
	}

	private static void commandRO(Library library, Scanner scanner, String[] commands) {
		String title = commands[1];
		String[] parameters = scanner.nextLine().split(" ");
		String authorCode = parameters[0];
		String editorCode = parameters[1];
		String year = parameters[2];
		String subjectCode = parameters[3];
		String edition = parameters[4];
		if(!library.hasAuthorCode(authorCode)) {
			System.out.println("Autor inexistente.");
		}
		else if(!library.hasEditorCode(editorCode)) {
			System.out.println("Editora inexistente.");
		}
		else if(!library.hasSubjectCode(subjectCode)) {
			System.out.println("Tema inexistente.");
		}
		else if(library.hasDocument(title, authorCode, editorCode)) {
			System.out.println("Obra existente.");
		}
		else {
			int documentCode = library.createDocument(title, authorCode, editorCode);
			System.out.println("Obra registada com código " + documentCode);
		}
	}
	
	private static void commandRT(Library library, String[] command) {
		String topicName = command[1];
		if(library.hasTopic(topicName)) {
			System.out.println("Tema existente.");
		}
		else {
			int topicIdentifier = library.registerTopic(topicName);
			System.out.println("Tema registado com código " + topicIdentifier);
		}
	}

	private static void commandRC(Library library, String[] command) {
		String collectionName = command[1];
		if(library.hasCollection(collectionName)) {
			System.out.println("Coleção existente.");
		}
		else {
			int collectionIdentifier = library.registerCollection(collectionName);
			System.out.println("Coleção registada com código " + collectionIdentifier);
		}
	}

	private static void commandRE(Library library, String[] command) {
		String editorName = command[1];
		if(library.hasEditor(editorName)) {
			System.out.println("Editora existente.");
		}
		else {
			int editorIdentifier = library.registerEditor(editorName);
			System.out.println("Editora registada com código " + editorIdentifier);
		}
	}

	private static void commandRA(Library library, String[] command) {
		String authorName = command[1];
		if(library.hasAuthor(authorName)) {
			System.out.println("Autor existente.");
		}
		else {
			int authorIdentifier = library.registerAutor(authorName);
			System.out.println("Autor registado com código " + authorIdentifier);
		}
	}

	private static void commandRF(Library library, String[] command) {
		String employeeName = command[1];
		if(library.hasEmployee(employeeName)) {
			System.out.println("Funcionário existente.");
		}
		else {
			int employeeIdentifier = library.registerEmployee(employeeName);
			System.out.println("Funcionário registado com código " + employeeIdentifier);
		}
	}

	private static void commandRTO(Library library, String[] command) {
		String documentType = command[1];
		if(library.hasDocumentType(documentType)) {
			System.out.println("Tipo de obra existente.");
		}
		else {
			library.registerDocumentType(documentType);
			System.out.println("Tipo de obra registado com sucesso.");
		}
	}

	private static void commandOUT(Library library) {
		if(!library.hasSession()) {
			System.out.println("Sem sessão iniciada.");
		}
		else {
			library.endSession();
			System.out.println("Sessão terminada.");
		}
	}

	private static void commandIN(Library library, String[] commands) {
		String identifier = commands[1];
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
