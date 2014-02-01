/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//import static Formula1.solution;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import javax.script.*;
//import javax.swing.*;

public class Formula {

    private static ScriptEngineManager m;
    private static ScriptEngine e;
    private static CompiledScript compiledScript;
    private static String[] funkcii = new String[]{"abs", "pow", "ceil", "cos", "exp", "floor", "log", "random",
        "sin", "sqrt", "tan"};
    private static String[] funkcii2 = new String[]{"min", "pow", "max"};

    /**
     * @param args the command line arguments
     */
    public static double solution(String formula, double variable) {
        m = new ScriptEngineManager();
        e = m.getEngineByExtension("js");

        Compilable jsCompiler = (Compilable) e;
        if (formula==null||formula=="") return Double.NaN;
        
        try {
            for (String func : funkcii) {

                e.eval(String.format("function %1$s(x){return Math.%1$s(x);}", func));
            }
            for (String func : funkcii2) {
                e.eval(String.format("function %1$s(x,y){return Math.%1$s(x,y);}", func));
            }



            //compiledScript = jsCompiler.compile(JOptionPane.showInputDialog("Введите уравнение"));
            compiledScript = jsCompiler.compile(formula);
            //e.put("x", (JOptionPane.showInputDialog("Введите  x")));
            e.put("x", variable);

            Double result = (Double) compiledScript.eval(e.getContext());

            return result;
        } catch (ScriptException e1) {
            return Double.NaN;
        }
    }

    public static ArrayList generateX(double begin, double end, int n, int sort) {
        //ArrayList tmpX=new ArrayList();
        double[] tmpX = new double[n];
        for (int i = 0; i < n; i++) {
            //new Random(System.currentTimeMillis()).nextInt(end+1 - begin) + begin;
            double tmp;
            Random r=new Random();
            tmp = (Math.abs(r.nextDouble())) * (end - begin) + begin;
            tmpX[i] = tmp;
        }
        if (sort != 0) {
            for (int i = 0; i < tmpX.length; i++) {
                double min = tmpX[i];
                int imin = i;

                for (int j = i + 1; j < tmpX.length; j++) {

                    if (tmpX[j] < min) {
                        min = tmpX[j];
                        imin = j;
                    }
                }

                if (i != imin) {
                    double temp = tmpX[i];
                    tmpX[i] = tmpX[imin];
                    tmpX[imin] = temp;
                }
            }
        }
        ArrayList tmpArrayList = new ArrayList();
        for (int i = 0; i < n; i++) {
            tmpArrayList.add(new BigDecimal(tmpX[i]).doubleValue());
        }
        return tmpArrayList;


    }
    /*
     public static void main(String[] args) {
     //System.out.println(solution("sin(x)+2",90));
     ArrayList tmp=generateX(0,100,10);
     for (int i=0;i<tmp.toArray().length;i++){
     System.out.println(tmp.get(i));
     }
     }
     */
}