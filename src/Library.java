public interface Library {

	boolean hasSession();

	boolean hasEmployee(String identifier);

	void newSession(String identifier);

	void endSession();

	boolean hasDocumentType(String documentType);

	void registerDocumentType(String documentType);

}
