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


public class WriteToFile {
    //private ArrayList xValues=new ArrayList();

    WorkBook workBook = new WorkBook();
    int row = 0;

    public WriteToFile(int n) throws Exception {
        workBook = new WorkBook();
        if (n > 1) {
            workBook.insertSheets(1, n - 1);
        }
    }

    public void add(Equation eq, int k) throws Exception {
        //workBook = new WorkBook();
        //this.xValues=eq.getxValues();
        //workBook.insertSheets(1, 1);
        row = 0;
        String u = workBook.getSheetName(k);
        workBook.setSheet(k);
        try {
            //workBook =new WorkBook();
            workBook.setText(row, 0, "Исходная формула:");
            row++;
            workBook.setText(row, 0, eq.getFormula());
            row++;
            workBook.setText(row, 0, "X:");
            workBook.setText(row, 1, "f(x)=");
            workBook.setText(row, 4, "X(интерполируемые):");
            workBook.setText(row, 5, "f(x)=");
            workBook.setText(row, 6, "Pn:");
            //workBook.setText(row, 2, "Pn(x)=");
            row++;
            for (int i = 0; i < eq.getX().toArray().length; i++) {
                workBook.setNumber(row, 0, eq.getX().get(i));
                workBook.setNumber(row, 1, eq.getFx().get(i));
                if (i < eq.getX_interp().toArray().length) {
                    workBook.setNumber(row, 4, eq.getX_interp().get(i));
                    workBook.setNumber(row, 5, eq.getRes_fx().get(i));
                    workBook.setNumber(row, 6, eq.getRes().get(i));

                }
                //workBook.setNumber(row, 2,Formula.solution(eq.getResult().toString(),eq.getxValues().get(i)));
                row++;
            }

            ChartShape chart = workBook.addChart(10, 5, 30, 50);
            chart.setChartType(ChartShape.Line);
            ///short i=ChartShape.Line;
            
            
            chart.addSeries();
            chart.setSeriesName(0, "f(x)");
            //int last=1+time1.size();
            String s = "Sheet" + (k + 1) + "!$F$4:$F$" + (3 + eq.getRes_fx().toArray().length) + "";
            chart.setSeriesYValueFormula(0, s);
            s = "Sheet" + (k + 1) + "!$E$4:$E$" + (3 + eq.getX_interp().toArray().length) + "";
            chart.setCategoryFormula(s);
            chart.setAxisTitle(ChartShape.XAxis, 0, "x");
            chart.setAxisTitle(ChartShape.YAxis, 0, "y");
            chart.setTitle("f(x)");

            chart = workBook.addChart(10, 55, 30, 90);
            chart.setChartType(ChartShape.Line);
            //chart.setChartType(s);
            chart.addSeries();
            chart.setSeriesName(0, "Pn(x)");


            s = "Sheet" + (k + 1) + "!$G$4:$G$" + (3 + eq.getRes().toArray().length) + "";
            chart.setSeriesYValueFormula(0, s);
            s = "Sheet" + (k + 1) + "!$E$4:$E$" + (3 + eq.getX_interp().toArray().length) + "";
            chart.setCategoryFormula(s);
            chart.setAxisTitle(ChartShape.XAxis, 0, "x");
            chart.setAxisTitle(ChartShape.YAxis, 0, "y");
            chart.setTitle("Pn(x)");
            
            ChartFormat seriesformat = chart.getSeriesFormat(0);
            //seriesformat.setSolid();
            //seriesformat.setForeColor(Color.RED.);
            //chart.setSeriesFormat(0, seriesformat);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() throws Exception {
        workBook.writeXLSX("out.xlsx");
    }
}