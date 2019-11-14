public interface Library {

	boolean hasSession();

	boolean hasEmployee(String identifier);

	void newSession(String identifier);

	void endSession();

}
