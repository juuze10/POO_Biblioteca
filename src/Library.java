public interface Library {

	boolean hasSession();

	boolean hasEmployee(String identifier);

	void newSession(String identifier);

	void endSession();

	boolean hasDocumentType(String documentType);

	void registerDocumentType(String documentType);

	int registerEmployee(String employeeName);

	boolean hasAuthor(String authorName);

	int registerAutor(String authorName);
	
	boolean hasEditor(String editorName);

	int registerEditor(String editorName);

	boolean hasCollection(String collectionName);

	int registerCollection(String collectionName);

}
