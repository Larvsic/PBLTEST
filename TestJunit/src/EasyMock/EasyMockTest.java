package EasyMock;
import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EasyMockTest extends EasyMockSupport {
	
	private Printer printer;
	private Document document;
	
	@Before
	public void setUp(){
		printer = mock(Printer.class);
		document = new Document(printer);
	}
	
	
	@Test
	
	public void testPrintContent(){
		
		Printer printer = mock(Printer.class);
		Document document = new Document(printer);
		
		printer.print("Hello world");
		EasyMock.replay(printer);
		document.setContent("Hello world");
		document.print();
		EasyMock.verify(printer);
	}

}
