package work04;

public class PNGimage extends image{

	@Override
	public void parseFile(String fileName) {
		// TODO �Զ����ɵķ������
		  Matrix m = new Matrix(); 
	        imp.doPaint(m);
	        System.out.println(fileName + "����ʽΪPNG��");
	}

}
