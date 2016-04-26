package excel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.attendance.model.Student;


public class ExcelTest {


    /**
     * 查询指定目录中电子表格中所有的数据
     * @param file 文件完整路径
     * @return
     */
    public static List<Student> getAllByExcel(String file){
        List<Student> list=new ArrayList<Student>();
        try {
            Workbook rwb=Workbook.getWorkbook(new File(file));
            Sheet rs=rwb.getSheet("Sheet1");	//或者rwb.getSheet(0)
            int clos=rs.getColumns();	//得到所有的列
            int rows=rs.getRows();	//得到所有的行
            
//            System.out.println(clos+" rows:"+rows);
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    String id=rs.getCell(j++, i).getContents();	//默认最左边编号也算一列 所以这里得j++
                    String name=rs.getCell(j++, i).getContents();
                    String school_id=rs.getCell(j++, i).getContents();
                    String classes_id=rs.getCell(j++, i).getContents();
                    String sex=rs.getCell(j++, i).getContents();
                    System.out.println(" name:"+name+"——导入成功");
                    list.add(new Student(Integer.parseInt(id),name,Integer.parseInt(school_id),Integer.parseInt(classes_id),Integer.parseInt(sex)));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        return list;
        
    }
    

    
    public static void main(String[] args) {
  
    	List<Student> students = getAllByExcel("C:\\Users\\fzj\\Desktop\\test.xls");
    	for(Student student:students){
    		System.out.println(student.getName());
    	}
      
        
    }
}
