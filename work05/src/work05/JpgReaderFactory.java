package work05;

public class JpgReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader get() {
		// TODO �Զ����ɵķ������
		return new JpgReader();
	}

}
