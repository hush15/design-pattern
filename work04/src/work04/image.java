package work04;

abstract class image {
	protected imageImp imp;
	 
	public void setImageImp(imageImp imp) {
		this.imp = imp;
	} 
 
	public abstract void parseFile(String fileName);
}
