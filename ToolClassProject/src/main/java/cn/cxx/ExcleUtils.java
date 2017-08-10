package cn.cxx;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;








import java.util.Collections;
import java.util.Comparator;







import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleUtils {
	public static void main(String[] args) {
		ExcleUtils t = new ExcleUtils();
		t.run("D:/des",8, "D:/郑州银行/系统说明.xlsx");
		
	}
	
	public void run(String path,int sheetIndex,String path2) {
		File[] packMir = this.packMir(path);
		ArrayList<XSSFSheet> read = this.Read(sheetIndex,packMir);
		XSSFWorkbook trans = this.Trans(read);
		this.write(trans, path2);
	}
	
	public File[] packMir(String path) {
		File file = new File(path);
		file.mkdirs();
		File[] af = null;
		if(file.exists() && file.isDirectory())
			 af = file.listFiles();
		
		return af;
	}
	
	public ArrayList<XSSFSheet> Read(int sheetIndex,File[] fa) {
		ArrayList<XSSFSheet> al = new ArrayList<XSSFSheet>();
		
		for (File file : fa) {
			if(file.isFile() && file.getName().endsWith(".xlsx")) {
				try {
					FileInputStream fis = new FileInputStream(file);
					
						XSSFWorkbook wb = new XSSFWorkbook(fis);
						XSSFSheet sheetAt = wb.getSheetAt(sheetIndex);
						al.add(sheetAt);
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					
					}
			}
		}
		this.sort(al);
		return al;
	}
	
	public ArrayList<XSSFSheet> sort(ArrayList<XSSFSheet> al) {
		Collections.sort(al,new Comparator<XSSFSheet>() {

			@Override
			public int compare(XSSFSheet o1, XSSFSheet o2) {
				
				return o1.getSheetName().compareTo(o2.getSheetName());
			}
           
			
        });
		return al;
	}
	
	public XSSFWorkbook Trans(ArrayList<XSSFSheet> read) {
		File file = new File("");
		XSSFWorkbook hwb = new XSSFWorkbook();
		System.out.println(read.size());
		for (XSSFSheet hssfSheet : read) {
			System.out.println(hssfSheet.getSheetName());
			XSSFSheet hssfSheet2 = hwb.createSheet(hssfSheet.getSheetName());
			copy(hssfSheet,hssfSheet2);
		}
		return hwb;
	}
	
	public void write(XSSFWorkbook hwb,String path){
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
				hwb.write(fos);
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	//拷贝sheet
	public XSSFSheet copy(XSSFSheet fromsheet,XSSFSheet newsheet){
		int firstrow = fromsheet.getFirstRowNum();
		int lastrow = fromsheet.getLastRowNum();
		if ((firstrow == -1) || (lastrow == -1) || lastrow < firstrow) {
			System.out.println("要拷贝的sheet页是空的");
            return null;
        }
		  // 拷贝合并的单元格
		 for (int i = 0; i < fromsheet.getNumMergedRegions(); i++) {
	            CellRangeAddress mergedRegion = fromsheet.getMergedRegion(i);
	            newsheet.addMergedRegion(mergedRegion);
	        }
		 	XSSFRow fromRow = null;
	        XSSFRow newRow = null;
	        XSSFCell newCell = null;
	        XSSFCell fromCell = null;
	        // 设置列宽
	        for (int i = firstrow; i <= lastrow; i++) {
	            fromRow = fromsheet.getRow(i);
	            if (fromRow != null) {
	                for (int j = fromRow.getLastCellNum(); j >= fromRow.getFirstCellNum(); j--) {
	                    int colnum = fromsheet.getColumnWidth((short) j);
	                    if (colnum > 100) {
	                        newsheet.setColumnWidth((short) j, (short) colnum);
	                    }
	                    if (colnum == 0) {
	                        newsheet.setColumnHidden((short) j, true);
	                    } else {
	                        newsheet.setColumnHidden((short) j, false);
	                    }
	                }
	                break;
	            }
	        }
	        // 拷贝行并填充数据
	        for (int i = 0; i <= lastrow; i++) {
	            fromRow = fromsheet.getRow(i);
	            if (fromRow == null) {
	                continue;
	            }
	            newRow = newsheet.createRow(i - firstrow);
	            newRow.setHeight(fromRow.getHeight());
	            for (int j = fromRow.getFirstCellNum(); j < fromRow.getPhysicalNumberOfCells(); j++) {
	                fromCell = fromRow.getCell((short) j);
	                if (fromCell == null) {
	                    continue;
	                }
	                newCell = newRow.createCell((short) j);
	                XSSFCellStyle cellStyle2 = newCell.getCellStyle();
	                XSSFCellStyle cellStyle = fromCell.getCellStyle();
	                
	                cellStyle2.setAlignment(cellStyle.getAlignment());  
	                //边框和边框颜色  
	                cellStyle2.setBorderBottom(cellStyle.getBorderBottom());  
	                cellStyle2.setBorderLeft(cellStyle.getBorderLeft());  
	                cellStyle2.setBorderRight(cellStyle.getBorderRight());  
	                cellStyle2.setBorderTop(cellStyle.getBorderTop());  
	                cellStyle2.setTopBorderColor(cellStyle.getTopBorderColor());  
	                cellStyle2.setBottomBorderColor(cellStyle.getBottomBorderColor());  
	                cellStyle2.setRightBorderColor(cellStyle.getRightBorderColor());  
	                cellStyle2.setLeftBorderColor(cellStyle.getLeftBorderColor());  
	                  
	                //背景和前景  
	                cellStyle2.setFillBackgroundColor(cellStyle.getFillBackgroundColor());  
	                cellStyle2.setFillForegroundColor(cellStyle.getFillForegroundColor());  
	                  
	                cellStyle2.setDataFormat(cellStyle.getDataFormat());  
	                cellStyle2.setFillPattern(cellStyle.getFillPattern());  
//	              toStyle.setFont(fromStyle.getFont(null));  
	                cellStyle2.setHidden(cellStyle.getHidden());  
	                cellStyle2.setIndention(cellStyle.getIndention());//首行缩进  
	                cellStyle2.setLocked(cellStyle.getLocked());  
	                cellStyle2.setRotation(cellStyle.getRotation());//旋转  
	                cellStyle2.setVerticalAlignment(cellStyle.getVerticalAlignment());  
	                cellStyle2.setWrapText(cellStyle.getWrapText());  
	                
	  /*              XSSFCellStyle newStyle = newsheet.getWorkbook().createCellStyle();
	                newStyle.cloneStyleFrom(cellStyle);
	                newCell.setCellStyle(newStyle);
	                
	                XSSFCellStyle cellStyle2 = newCell.getCellStyle();
	                cellStyle2.setFillForegroundColor(cellStyle.getFillForegroundColor());
	                cellStyle2.setFillPattern(cellStyle.getFillPattern());
	                cellStyle2.setAlignment(cellStyle.getAlignment());
	                cellStyle2.setVerticalAlignment(cellStyle.getVerticalAlignment());
	                */
	                int cType = fromCell.getCellType();
	                newCell.setCellType(cType);
	                switch (cType) {
	                case HSSFCell.CELL_TYPE_STRING:
	                    newCell.setCellValue(fromCell.getRichStringCellValue());
	                    break;
	                case HSSFCell.CELL_TYPE_NUMERIC:
	                    newCell.setCellValue(fromCell.getNumericCellValue());
	                    break;
	                case HSSFCell.CELL_TYPE_FORMULA:
	                    newCell.setCellFormula(fromCell.getCellFormula());
	                    break;
	                case HSSFCell.CELL_TYPE_BOOLEAN:
	                    newCell.setCellValue(fromCell.getBooleanCellValue());
	                    break;
	                case HSSFCell.CELL_TYPE_ERROR:
	                    newCell.setCellValue(fromCell.getErrorCellValue());
	                    break;
	                default:
	                    newCell.setCellValue(fromCell.getRichStringCellValue());
	                    break;
	                }
	            }
	        }
		return newsheet;
	}
	
}
