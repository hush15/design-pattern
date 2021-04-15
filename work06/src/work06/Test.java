package work06;

public class Test {
public static void main(String[] args) {
	 LogFactory factory;
     Log log;
     factory = Produce.Product("Console");
     log = factory.productLog();
     log.createLog();
}
}
