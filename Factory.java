/*
Universidad del Valle de Guatemala 
Algoritmos y estructura de Datos
Jose Ramirez
Jorge Suchite 
Hoja de Trabajo 5 
fecha: septiembre 5, 2016

este es el factory para el programon

 */
package hdt6;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;


// la factoria!!!!
public class Factory {
    /**
     * @param menu
     * @return
     */
    public Set<String> getStack (int menu){
        
        if (menu==1)
            return new HashSet<String>();
        
        if (menu==2)
            return new TreeSet<String>();
        
        if (menu==3)
            return new LinkedHashSet<String>();
        
        
        return null;
        
    }
	
}