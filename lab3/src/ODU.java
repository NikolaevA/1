

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artem
 */
public class ODU {
    
    public static ResultSet solution(String formula,int method,double from, double to,double y0,double n){
        ArrayList xValues=new ArrayList();
        ArrayList yValues=new ArrayList();
        double yb=0;
        double yNext=0;
        double h=(to-from)/(n-1);
        xValues.add(from);
        yValues.add(y0);
        for (int i=1;i<n;i++){
            if (i==1){
                xValues.add(from+h*i);
                yb=(double)yValues.get(i-1)+h*Formula.solution(formula,(double)xValues.get(i-1) , (double)yValues.get(i-1));
                yNext=(double)yValues.get(i-1)+h*Formula.solution(formula,(double)xValues.get(i) , yb);
                yValues.add(yNext);
                continue;
            }
            if (i==2||(method==2&&i>2)){
                xValues.add(from+h*i);
                yb=(double)yValues.get(i-1)+(h/2)*(3*Formula.solution(formula,(double)xValues.get(i-1),(double)yValues.get(i-1))-Formula.solution(formula,(double)xValues.get(i-2) , (double)yValues.get(i-2)));
                yNext=(double)yValues.get(i-1)+(h/2)*(Formula.solution(formula,(double)xValues.get(i) , yb)+Formula.solution(formula,(double)xValues.get(i-1) , (double)yValues.get(i-1)));
                yValues.add(yNext);
                continue;
            }
            if (i==3||(method==3&&i>3)){
                xValues.add(from+h*i);
                yb=(double)yValues.get(i-1)+(h/12)*(23*Formula.solution(formula,(double)xValues.get(i-1),(double)yValues.get(i-1))-16*Formula.solution(formula,(double)xValues.get(i-2) , (double)yValues.get(i-2))+5*Formula.solution(formula,(double)xValues.get(i-3) , (double)yValues.get(i-3)));
                yNext=(double)yValues.get(i-1)+(h/12)*(5*Formula.solution(formula,(double)xValues.get(i) , yb)+8*Formula.solution(formula,(double)xValues.get(i-1) , (double)yValues.get(i-1))-Formula.solution(formula,(double)xValues.get(i-2) , (double)yValues.get(i-2)));
                yValues.add(yNext);
                continue;
            }
            if (i==4||(method==4&&i>4)){
                xValues.add(from+h*i);
                yb=(double)yValues.get(i-1)+(h/24)*(55*Formula.solution(formula,(double)xValues.get(i-1),(double)yValues.get(i-1))-59*Formula.solution(formula,(double)xValues.get(i-2) , (double)yValues.get(i-2))+37*Formula.solution(formula,(double)xValues.get(i-3) , (double)yValues.get(i-3))-9*Formula.solution(formula,(double)xValues.get(i-4) , (double)yValues.get(i-4)));
                yNext=(double)yValues.get(i-1)+(h/24)*(9*Formula.solution(formula,(double)xValues.get(i) , yb)+19*Formula.solution(formula,(double)xValues.get(i-1) , (double)yValues.get(i-1))-5*Formula.solution(formula,(double)xValues.get(i-2) , (double)yValues.get(i-2))+Formula.solution(formula,(double)xValues.get(i-3) , (double)yValues.get(i-3)));
                yValues.add(yNext);
                continue;
            } 
        }
        ResultSet r=new ResultSet();
        r.xValues=xValues;
        r.yValues=yValues;
        r.method=method;
        return r;
    }
    
    public static void main(String[] args) {
        ResultSet r=ODU.solution("pow(y,2)-x",4,1,3,0,11);
        for(int i=0;i<11;i++){
            System.out.println((double)r.yValues.get(i));
        }
        System.out.println("");
    }
}
