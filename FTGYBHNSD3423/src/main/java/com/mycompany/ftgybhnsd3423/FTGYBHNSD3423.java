/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ftgybhnsd3423;

/**
 *
 * @author Alumno
 */
public class FTGYBHNSD3423 {

        public class Pipol {
    
        String nombre;
        String apellido;
        int edad;
   
    
        //Constructor toma el mismo nombre a la clase padre.
        //En el constructor inicializamos los atributos/caracteristicas de la clase
        /*
          no tiene tipo de retorno ni lleva void
          pueden tener parámetros 
        */
        public Pipol(String nombre, String apellido, int edad){
            //this se utiliza para acceder a los atributos.
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;      
        }
        //END constructor
    
        //getter y setter, nos van a permitir leer y escribir los valores de los atrisbutos
        //fuera de la clase Getter obetenemos los datos de los atributos
        //Setter  asignamos o cambiamos los valores de los atributos 
        public String getNombre(){
            return this.nombre;
        }
    
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public String getApellido(){
            return this.apellido;
        }
    
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        //END Getter y Setter
    
        //declaraciones de los metodos de la clase
        //Los métodos son las acciones u operaciones que tiene el objeto.
        public void caminar(){
            System.out.println(getNombre() + " "  + getApellido() + " esta caminando.");
        }
    
        public String dormir(){
            return " esta soñando.";
        }
        //END métodos  
  
        public static void main(String[] args) {
            //se instancia el objeto de la siguiente manera, para asi poder accedes a los atributos y metodos.
            Pipol gente = new Pipol("Felipe", "Redondo", 24);
        
            gente.caminar(); // llamada al método escribir 
        
            //metodo para cambiar el tamaño del lapiz 
            System.out.println(gente.dormir() + gente.getNombre());//
        }
    }
}