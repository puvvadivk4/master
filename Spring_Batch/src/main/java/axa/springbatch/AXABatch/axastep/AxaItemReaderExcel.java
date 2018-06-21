package axa.springbatch.AXABatch.axastep;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AxaItemReaderExcel implements ItemReader<String> {
	private static final String FILE_NAME = "C:/Users/puvamsik/axa_batch_excel.xlsx";

	@Override
	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		Workbook workbook = null;
		String output="";
		try {
			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));

			workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();
				while (cellIterator.hasNext()) {
					Cell currentCell = cellIterator.next();
					if (currentCell.getStringCellValue() != "") {
						
						System.out.println(currentCell.getStringCellValue());						
						output=output+currentCell.getStringCellValue()+"~";						
					}
				}

			}

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		} finally {
			workbook.close();
		}
		return output;
		
			}

	
	
}
