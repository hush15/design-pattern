package work05;

public class test {
	public static void main(String[] args) {
		ImageReaderFactory fa = new JpgReaderFactory();
		ImageReader sa ;
		sa=fa.get();
		sa.read();
	}
}
