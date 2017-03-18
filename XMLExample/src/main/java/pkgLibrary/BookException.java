package pkgLibrary;

@SuppressWarnings("serial")
public class BookException extends Exception {

	public BookException(){
		super();
	}
	
	public BookException(String id){
		super(id);
	}

}
