package work06;

public class DatabaseLogFactory implements LogFactory {
	 public Log productLog() {
	        System.out.println("Database����־��¼��������Database������־��¼����");
	        return new DatabaseLog();
	    }
}
