package work06;

public class ConsoleLogFactory implements LogFactory {
	 public Log productLog() {
	        System.out.println("Console型日志记录工厂返回Console类型日志记录对象");
	        return new ConsoleLog();
	    }
}
