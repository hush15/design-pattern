package work04;

public class Test {
	public static void main(String[] args) {
		image image =new JPGimage();
		imageImp imp =new WindowsImp() ;		
		image.setImageImp(imp);
		image.parseFile("Ğ¡ÁúÅ®");
	}
}
