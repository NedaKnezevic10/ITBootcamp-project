package excel_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUsers {

	// metode za postavljanje excela, postavljanje sheet-a, dohvatanje celija,
	// redova i kolona

	private static XSSFWorkbook wbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static DataFormatter formatter;

	public static void setExcel() {

		try {
			FileInputStream fis = new FileInputStream("users.xlsx");
			wbook = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}

	}

	public static void setWorkSheet(int index) {
		sheet = wbook.getSheetAt(index);
	}

	public static String getCellData(int row, int column) {
		cell = sheet.getRow(row).getCell(column);
		cell.setCellType(CellType.STRING);
		return cell.toString();

	}

	public static boolean closeExcell() {
		if (wbook != null) {
			try {
				wbook.close();
				wbook = null;
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				wbook = null;
				return false;
			}
		}
		return true;

	}
}
