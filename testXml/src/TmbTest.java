
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;



public class TmbTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JDOMException 
	 */
	public static void main(String[] args) throws JDOMException, IOException {
		
		  SAXBuilder builder = new SAXBuilder();
		  File xmlFile = new File("D:\\workspaceTMB\\testXml\\orders.xml");
	 
		  
	 
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List list = rootNode.getChildren("order");
	 
			for (int i = 0; i < list.size(); i++) {
	 
			   Element node = (Element) list.get(i);
	 
			   System.out.println("[1] : " + node.getChildText("id"));
			   System.out.println("[2] : " + node.getChildText("stock"));
			   System.out.println("[3] : " + node.getChildText("amount"));
			   
			}
		

	}

}
