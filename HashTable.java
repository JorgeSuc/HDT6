/*
Universidad del Valle de Guatemala 
Algoritmos y estructura de Datos
Jose Ramirez
Jorge Suchite 
Hoja de Trabajo 5 
fecha: septiembre 5, 2016

este es la hash table  ketchum jaja 

 */
package hdt6;

import java.util.Set;
    
public class HashTable {
   //hacemos la clase de la factoria 
    
    Factory factory = new Factory(); 
    
     // I need variables 
    
    
    private Set<String> conjunto;
    private Set<String> subconjunto;
    private String conjuntoMayor;
    
    //inicio  los conjuntos y variables
    public HashTable(int menu){
        conjunto = factory.getStack(menu);
         subconjunto=factory.getStack(menu);
         conjuntoMayor="";
    }
    //agrego un elemento al conjunto 
    public void setTable(String elemento){
        conjunto.add(elemento);
        
    }
    // retorno el conjunto.
    public Set<String> getConjunto(){
        return conjunto;
    }
    //devuelvo  la interseccion de los tres conjuntos
    public Set<String> interseccion3(Set<String> con1,Set<String> con2,Set<String> con3){
        subconjunto.clear();
        subconjunto.addAll(con1);
        subconjunto.retainAll(con2);
        subconjunto.retainAll(con3);
        
        return subconjunto;
    }
       //ingreso conjuntos y retorno todos los elementos que no estan contenidos en el primer conjunto
      // pero que no estan en el segundo 
    public Set<String> inclusion(Set<String> con1,Set<String> con2){
        subconjunto.clear();
        subconjunto.addAll(con1);
        subconjunto.removeAll(con2);
        return subconjunto;
    }
    //ingreso dos conjuntos y me sale la interseccion en ellos 
    
    
    public Set<String> interseccion(Set<String> con1,Set<String> con2){
        subconjunto.clear();
        subconjunto.addAll(con1);
        subconjunto.retainAll(con2);
        return subconjunto;
    }
    //ingreso dos conjuntos y  me devuelve la union de los dos
    public Set<String> union(Set<String> con1,Set<String> con2){
        subconjunto.clear();
        subconjunto.addAll(con1);
        return subconjunto;
    }
    //¿esta un conjunto en otro?, esta parte lo hace 100% seguro 
    public boolean subConjunto(Set<String> con1,Set<String> con2){
        subconjunto.clear();
        subconjunto.addAll(con1);
        subconjunto.retainAll(con2);
        if (subconjunto.size()==con1.size()){
            return true;
        }
        else{
            return false;
        }
    }
    //comparto tres conjuntos y me devuelve el conjuro mas grande
    public Set<String> biggerConjunto(Set<String> con1,Set<String> con2,Set<String> con3){
        subconjunto.clear();
        if (con1.size()>=con2.size()){
            subconjunto.addAll(con1);
            conjuntoMayor="Desarrolladores del Java";
        }
        else{
            subconjunto.addAll(con2);
            conjuntoMayor="Desarrolladores de la Web";
        }
        if (subconjunto.size()>=con3.size()){
            return subconjunto;
        }
        else{
           conjuntoMayor="Desarrolladores para Celulares";
           return con3; 
        }

    }
    //retorno el valor del conjunto el cual es el mayor de los que hay 
    public String getConjuntoMayor() {
       
         return conjuntoMayor;
     }
    //imprimo el conjunto de forma ascendente por ejemplo, (Pablo,Jorge,Brondon) ahora seria (Brondon, Jorge, Pablo)
    public String getStringConjunto(Set<String> con1){
        String cadena= con1.toString();
        cadena=cadena.replace("]", "");
        cadena=cadena.replace("[", " ");
        cadena=cadena.replace(",", "\n");
        return cadena;
        
    }
    
}