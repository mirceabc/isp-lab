package ro.ulbs.paradigme.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class ExcelWrite {
    public static void writeExcel(String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"Name", "Surname", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Max", "Average"});
        data.put("2", new Object[]{"Amit", "Shukla", 9, 8, 7, 5});
        data.put("3", new Object[]{"Lokesh", "Gupta", 8, 9, 6, 7});
        data.put("4", new Object[]{"John", "Adwards", 8, 8, 7, 6});
        data.put("5", new Object[]{"Brian", "Schultz", 7, 6, 8, 9});

        XSSFCellStyle headerStyle = workbook.createCellStyle();
        XSSFFont boldFont = workbook.createFont();
        boldFont.setBold(true);
        headerStyle.setFont(boldFont);
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFCellStyle yellowStyle = workbook.createCellStyle();
        yellowStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        int rowNum = 0;
        for (String key : data.keySet()) {
            Row row = sheet.createRow(rowNum);
            Object[] objArr = data.get(key);
            int colNum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(colNum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
                if (rowNum == 0) cell.setCellStyle(headerStyle);
            }

            if (rowNum > 0) {
                int i = rowNum + 1;
                Cell maxCell = row.createCell(6);
                maxCell.setCellFormula("MAX(C" + i + ":F" + i + ")");
                maxCell.setCellStyle(yellowStyle);

                Cell avgCell = row.createCell(7);
                avgCell.setCellFormula("AVERAGE(C" + i + ":F" + i + ")");
                avgCell.setCellStyle(yellowStyle);
            }
            rowNum++;
        }

        for (int i = 0; i < 8; i++) sheet.autoSizeColumn(i);

        try (FileOutputStream out = new FileOutputStream(filePath)) {
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
