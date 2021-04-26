import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;


public class ExcelCreate {

    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    public static void excelCreate() throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Countries");

        TempClass tempClass = new TempClass();
        HashMap<String, String> mapIntoExcel = new HashMap<>();
        mapIntoExcel = tempClass.getCountryMap();
        mapIntoExcel.entrySet().forEach(entry -> { System.out.println(entry.getKey() + " " + entry.getValue());
        });

        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // Country
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Country");
        cell.setCellStyle(style);
        // Flag
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Flag");
        cell.setCellStyle(style);


        // Data
        for (String country : mapIntoExcel.keySet()) {
            //Print HashMap
            String key = country.toString();
            String value = mapIntoExcel.get(country).toString();
            System.out.println(key + " " + value);

            //Put key-values from HashMap to Excel cells
            rownum++;
            row = sheet.createRow(rownum);

            // Country (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(key);
            // Flag (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(value);
        }
        File file = new File("demoCountries.xls");

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());

    }

}