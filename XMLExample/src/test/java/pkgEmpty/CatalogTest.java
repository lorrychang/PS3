package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class CatalogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	private String Id;
	private String id;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("null")
	@Test
	public void test() {
		Catalog cat = null;
		
		Book b1 = new Book(id);
		assertEquals(cat.getId() , b1.getId());
	}

	@Test
	public void test1(){
		Catalog cat = null;
		
		Book b2 = new Book(id);
		assertEquals(cat.getId(), b2.getId());
	}

}
