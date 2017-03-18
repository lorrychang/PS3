package pkgLibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;

	private Object cat;

	private String String;

	private Date Date;

	private java.lang.String author;

	private java.lang.String title;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
public Book GetBook(String id) throws Exception{
		
		Catalog cat = ReadXMLFile();
		for (Book b: cat.getBooks()) {
			if (b.getId() == id){
				return b;
			}
			
			throw new BookException();		
		}
		return null;
	}

	private static Catalog ReadXMLFile() {
		return null;
	}
	
	public void AddBook(Catalog id) throws Exception{
		
			String basePath = new File("").getAbsolutePath();
			basePath = basePath + new Catalog();
			File file = new File(basePath);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(cat, file);
			jaxbMarshaller.marshal(cat, System.out);
			
		throw new BookException();

		}
	}

