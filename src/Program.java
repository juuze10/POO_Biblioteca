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
			String commands[] = input.split(" ");
			switch(commands[0]) {
			case "IN":
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
			    break;
			case "OUT":
				endSession(library);
			    break;
			case "RTO":
				registerDocumentType(library, commands);
			    break;
			case "RF":
				registerEmployee(library, commands);
			    break;
			case "RA":
				registerAuthor(library, commands);
			    break;
			case "RE":
				registerEditor(library, commands);
			    break;
			case "RC":
				registerCollection(library, commands);
			    break;
			case "RT":
				registerTopic(library, commands);
			    break;
			case "RO":
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
	
	private static void registerTopic(Library library, String[] command) {
		String topicName = command[1];
		if(library.hasTopic(topicName)) {
			System.out.println("Tema existente.");
		}
		else {
			int topicIdentifier = library.registerTopic(topicName);
			System.out.println("Tema registado com código " + topicIdentifier);
		}
	}

	private static void registerCollection(Library library, String[] command) {
		String collectionName = command[1];
		if(library.hasCollection(collectionName)) {
			System.out.println("Coleção existente.");
		}
		else {
			int collectionIdentifier = library.registerCollection(collectionName);
			System.out.println("Coleção registada com código " + collectionIdentifier);
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
		
	}
}
