
public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory wordfactory = new WordDocumentFactory();
		Document wordDoc = wordfactory.createDocument();
		wordDoc.open();
		
		
		DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();

	}

}
