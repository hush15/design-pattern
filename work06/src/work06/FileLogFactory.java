package work06;

public class FileLogFactory implements LogFactory {
	 public Log productLog() {
	        System.out.println("File����־��¼��������File������־��¼����");
	        return new FileLog();
	    }
}
