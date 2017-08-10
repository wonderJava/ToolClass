package cn.cxx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;








import java.util.Collections;
import java.util.Comparator;


import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleUtils {
	public static void main(String[] args) {
		ExcleUtils t = new ExcleUtils();
		t.run("D:/郑州银行/服务治理约定接口",8, "D:/郑州银行/系统说明.xlsx");
		
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
			//copy(hssfSheet,hssfSheet2);
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
	
	
	public XSSFSheet copy(XSSFSheet resource,XSSFSheet tagart){
		CellRangeAddress mergedRegion = null;
		for(int i = 0;i < resource.getNumMergedRegions();i++) {
		tagart.addMergedRegion(resource.getMergedRegion(i));
		}
		return tagart;
	}
}
