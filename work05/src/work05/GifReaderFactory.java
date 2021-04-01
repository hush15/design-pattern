package work05;

public class GifReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader get() {
		// TODO 自动生成的方法存根
		return new GifReader();
	}

}
