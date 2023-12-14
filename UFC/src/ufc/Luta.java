/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author danielen
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private Lutador rounds;
    private Lutador aprovada;
    private String data;
    
    public String marcarLuta() {
        
        Locale locale = new Locale("pt", "BR");
        DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        String data = dateFormat.format(new Date());
        System.out.print(data);
        
        return "Luta{" + "data=" + data + "}";
    }
    
    public String lutar() {
      return "a";  
    }
}
