
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Equation {

    private ArrayList<Double> x = new ArrayList();
    private ArrayList<Double> fx = new ArrayList();
    private ArrayList<Double> dif = new ArrayList();
    private ArrayList<Double> x_interp = new ArrayList();
    private ArrayList<Double> res = new ArrayList();
    private ArrayList<Double> res_fx = new ArrayList();
    private String formula = new String();
    
    
    
    public Equation(String formula,int from, int to, int n){
        this.formula=formula;
        x = Formula.generateX(from, to, n,0);
        for (int i = 0; i < x.toArray().length; i++) {
            fx.add(Formula.solution(formula, x.get(i)));
        }
        difference(1);
        
    }
    
    private void difference(int n) {

        double tmp;
        double tmp1;
        for (int k = 0; k < x.toArray().length; k++) {
            tmp = 0;
            for (int j = 0; j <= k; j++) {
                tmp1 = 1;
                for (int i = 0; i <= k; i++) {
                    if (i != j) {
                        tmp1 = tmp1 * (getX().get(j) - getX().get(i));
                    }
                }
                tmp += getFx().get(j) / tmp1;
            }
            //return tmp;
            dif.add(tmp);
        }
    }

    public double make(double x) {
      
        double res_tmp = 0;
        double tmp = 0;
       
        for (int i = 0; i < this.x.toArray().length; i++) {
            if (i == 0) {

                res_tmp = fx.get(0);

            } else {
                tmp = dif.get(i);
                for (int j = 0; j < i; j++) {
                    tmp *= (x - this.x.get(j));
                }
                res_tmp += tmp;
            }

        }
        getRes().add(res_tmp);
        getRes_fx().add(Formula.solution(formula, x));
        return res_tmp;
    }

     
    
    public ArrayList<Double> getX() {
        return x;
    }

    public ArrayList<Double> getFx() {
        return fx;
    }


    public String getFormula() {
        return formula;
    }

 
    public ArrayList<Double> getX_interp() {
        return x_interp;
    }

    
    public void setX_interp(ArrayList<Double> x_interp) {
        this.x_interp = x_interp;
    }

    public ArrayList<Double> getRes() {
        return res;
    }

    
    public ArrayList<Double> getRes_fx() {
        return res_fx;
    }
    
}
