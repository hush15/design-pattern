package work06;

public class ConsoleLogFactory implements LogFactory {
	 public Log productLog() {
	        System.out.println("Console����־��¼��������Console������־��¼����");
	        return new ConsoleLog();
	    }
}
