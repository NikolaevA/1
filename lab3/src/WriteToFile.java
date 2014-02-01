/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab1;

import com.smartxls.ChartFormat;
import com.smartxls.ChartShape;
import com.smartxls.RangeStyle;
import com.smartxls.WorkBook;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Artem
 */

public class WriteToFile {
    //private ArrayList xValues=new ArrayList();

    WorkBook workBook = new WorkBook();
    int row = 0;
    int k=0;
    ChartShape chart;

    public WriteToFile() throws Exception{
        chart = workBook.addChart(10, 5, 30, 50);
        chart.setChartType(ChartShape.Line);
    }

    public void add(ResultSet r) throws Exception {
        
        try {
            //workBook =new WorkBook();
            if (r.method==2) {
                workBook.setText(row, 0, "Метод Адамса 2 порядка");
                row++;
            }
            if (r.method==3) {
                workBook.setText(row, 0, "Метод Адамса 3 порядка");
                row++;
            }
            if (r.method==4) {
                workBook.setText(row, 0, "Метод Адамса 4 порядка");
                row++;
            }
            
            
            workBook.setText(row, 0, "x=");
            workBook.setText(row, 1, "y=");
            
            
            row++;
            for (int i = 0; i < r.xValues.toArray().length; i++) {
                workBook.setNumber(row, 0, (double)r.xValues.get(i));
                workBook.setNumber(row, 1, (double)r.yValues.get(i));
                row++;
            }

            
            ///short i=ChartShape.Line;
            
            
            chart.addSeries();
            chart.setSeriesName(k, "Метод Адамса"+r.method+"порядка");
            //int last=1+time1.size();
            String s = "Sheet1!$B$"+(row+1-r.xValues.toArray().length)+":$B$" + (row) + "";
            chart.setSeriesYValueFormula(k, s);
            s = "Sheet1!$A$"+(row+1-r.xValues.toArray().length)+":$A$" + (row) + "";
            chart.setCategoryFormula(s);
            chart.setAxisTitle(ChartShape.XAxis, 0, "x");
            chart.setAxisTitle(ChartShape.YAxis, 0, "y");
            k++;
            row++;
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() throws Exception {
        workBook.writeXLSX("out.xlsx");
    }
}