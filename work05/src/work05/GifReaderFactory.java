package work05;

public class GifReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader get() {
		// TODO �Զ����ɵķ������
		return new GifReader();
	}

}
