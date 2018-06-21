package axa.springbatch.AXABatch.axastep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.batch.item.ItemWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class AxaItemWriterExcel implements ItemWriter<String>{

	private static final String FILE_NAME = "C:/Users/puvamsik/axa_batch_excel _destination.xlsx";
	private static final String FILE = "C:/Users/puvamsik/axa_batch_excel _destination.pdf";//
	private static final int temp=0;
	@Override
	public void write(List<? extends String> list) throws Exception {
		
		System.out.println(list.size());
		for(String s :list)
		{
		System.out.println(s);
		String[] arr=s.split("~");
		Workbook workbook = null;
		String output="";
		int sheetRow=0;
		int column=0;
		try {
			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));

			workbook = new XSSFWorkbook(excelFile);

			Sheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();//
			Document pdfDoc = new Document();//
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(FILE));//
            pdfDoc.open();//
            PdfPTable my_table = new PdfPTable(2);//            
            PdfPCell table_cell;//
           
            while(rowIterator.hasNext()) {
            	
            	Row row = rowIterator.next();             
            	Iterator<Cell> cellIterator = row.cellIterator();
            	while(cellIterator.hasNext()) {
            		Cell cell = cellIterator.next(); //Fetch CELL
            		switch(cell.getCellType()) { //Identify CELL type
            		//you need to add more code here based on
            		//your requirement / transformations
            		case Cell.CELL_TYPE_STRING:
            			//Push the data from Excel to PDF Cell
            			table_cell=new PdfPCell(new Phrase(cell.getStringCellValue()));
            			//feel free to move the code below to suit to your needs
            			my_table.addCell(table_cell);
            			break;
            		}
            		//next line
            	}

            }
			
            pdfDoc.add(my_table);                       
            pdfDoc.close();                            
      
			/*Row currentRow=null;
			for(String outstring: Arrays.asList(arr))
			{				
				if(column==0)
				 currentRow=sheet.createRow(sheetRow++);
				
				Cell currentCell=currentRow.createCell(column++);
				currentCell.setCellValue(outstring);
				if(column>1)
					column=0;				
			}
			 FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	            workbook.write(outputStream);*/ //output excel
			
			
			
	           
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		} finally {
			workbook.close();
		}		
		
		}		
		
	}

}
