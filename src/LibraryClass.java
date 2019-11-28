
public class LibraryClass implements Library {

	@Override
	public boolean hasSession() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasEmployee(String identifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void newSession(String identifier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endSession() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasDocumentType(String documentType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerDocumentType(String documentType) {
		// TODO Auto-generated method stub

	}

	@Override
	public int registerEmployee(String employeeName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasAuthor(String authorName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int registerAutor(String authorName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasEditor(String editorName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int registerEditor(String editorName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasCollection(String collectionName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int registerCollection(String collectionName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int registerTopic(String topicName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasTopic(String topicName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAuthorCode(String authorCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasEditorCode(String editorCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSubjectCode(String subjectCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasDocument(String title, String authorCode, String editorCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int createDocument(String title, String authorCode, String editorCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasReader(String readerName, String readerContact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int createReader(String readerName, String readerContact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasDocumentCode(String documentCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasReaderCode(String readerCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBlocked(String readerCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canLoan(String readerCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvailableForLoan(String documentCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createLoan(String documentCode, String readerCode, String date) {
		// TODO Auto-generated method stub

	}

}
