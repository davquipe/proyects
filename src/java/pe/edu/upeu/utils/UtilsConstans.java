/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pacifi
 */
public class UtilsConstans {

    Map mapear;
    ArrayList grados = new ArrayList();
    
    public ArrayList getNivelesCata(){
        mapear= new HashMap();
        mapear.put("id", "1");
        mapear.put("Nombre", "Inicial");
        grados.add(mapear);
        mapear= new HashMap();
        mapear.put("id", "2");
        mapear.put("Nombre", "Primaria");
        grados.add(mapear);
        mapear= new HashMap();
        mapear.put("id", "3");
        mapear.put("Nombre", "Secundaria");
        grados.add(mapear);
        
        return  grados;
    }
    
    public ArrayList getGradosCata(String nivel) {
        if (nivel.equals("Inicial")) {
            mapear = new HashMap();
            mapear.put("id", "1");
            mapear.put("nombre", "Inicial 4 Años");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "2");
            mapear.put("nombre", "Inicial 5 Años");
            grados.add(mapear);

        }
        if (nivel.equals("Primaria")) {
            mapear = new HashMap();
            mapear.put("id", "1");
            mapear.put("nombre", "Primero");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "2");
            mapear.put("nombre", "Segundo");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "3");
            mapear.put("nombre", "Tercero");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "4");
            mapear.put("nombre", "Cuarto");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "5");
            mapear.put("Strin", "Quinto");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "6");
            mapear.put("nombre", "Sexto");
            grados.add(mapear);
        }
        if (nivel.equals("Secundaria")) {
            mapear = new HashMap();
            mapear.put("id", "1");
            mapear.put("nombre", "Primero");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "2");
            mapear.put("nombre", "Segundo");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "3");
            mapear.put("nombre", "Tercero");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "4");
            mapear.put("nombre", "Cuarto");
            grados.add(mapear);
            mapear = new HashMap();
            mapear.put("id", "5");
            mapear.put("Strin", "Quinto");
            grados.add(mapear);

        }
        return grados;
    }
}
