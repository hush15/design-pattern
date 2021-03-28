package work04;

public class PNGimage extends image{

	@Override
	public void parseFile(String fileName) {
		// TODO 自动生成的方法存根
		  Matrix m = new Matrix(); 
	        imp.doPaint(m);
	        System.out.println(fileName + "，格式为PNG。");
	}

}
