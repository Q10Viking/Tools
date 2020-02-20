package org.hzz.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hzz.excel.pojo.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME = "./resources/test.xlsx";
    public static void main(String[] args) throws IOException {
        List<User> users = getUserList();
        try (Workbook wb = new XSSFWorkbook()){
            Sheet sheet = wb.createSheet("Q10-1页");
            for(int i=0;i<users.size();i++){
                Row row = sheet.createRow(i);
                // 动态的变成对象的属性个数
                row.createCell(0).setCellValue(users.get(i).getId());
                row.createCell(1).setCellValue(users.get(i).getName());
                row.createCell(2).setCellValue(users.get(i).getPhone());

                // 设置列宽高自适应
                sheet.autoSizeColumn(1);
                sheet.autoSizeColumn(2);
            }
           try(FileOutputStream fileOut = new FileOutputStream(FILE_NAME)){
               wb.write(fileOut);
               System.out.println("生成excel成功");
           }

        }
    }
    public static List<User> getUserList(){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Q10Viking","17801054490"));
        users.add(new User(2,"hzz",null));
        users.add(new User(3,"壮壮","17801054490"));
        return users;
    }
}

