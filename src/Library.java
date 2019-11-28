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

	int registerTopic(String topicName);

	boolean hasTopic(String topicName);

	boolean hasAuthorCode(String authorCode);

	boolean hasEditorCode(String editorCode);

	boolean hasSubjectCode(String subjectCode);

	boolean hasDocument(String title, String authorCode, String editorCode);

	int createDocument(String title, String authorCode, String editorCode);

}
