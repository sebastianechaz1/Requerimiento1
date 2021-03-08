import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    /*Crear el algoritmo para calcular el área de un rectángulo y un triángulo rectángulo de altura 3 metros y la base de 4 metros.*/
        
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Por favor ingrese la base del rectangulo");
    
    int base = sc.nextInt(); 

    System.out.println("Por favor ingrese la altura del rectangulo");
    
    int altura = sc.nextInt(); 
       
    int resultadoRec = base * altura;
        
    int resultadoTriRec = resultadoRec / 2;
            
    System.out.println("El area del rectangulo es: " + resultadoRec);    
    System.out.println("El area del triangulo rectangulo es: " + resultadoTriRec);

  }
}