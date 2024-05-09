package com.cesde;

public class Ejercicios {
    
    public String ejercicio1(int num1, int num2) {
        if (num1 > num2){
            return "El número mayor es:" + num1;
        }
        else if (num2 > num2 ) {
            return "El número mayor es." + num2;
        }
        else{
            return "Los dos números son iguales.";
        }
        
        
    }
    
    public String ejercicio2(double calificacion) {
       if (calificacion >= 3.5){
        return"¡Felicidades! Usted ha aprobado el examen.";
       }
       else{
        return "Lo siento, usted ha reprobado el examen.";
       }
        
    }

    
    public double ejercicio3(double precio) {
        double descuento = 0;
        if (precio >= 50000) {
            descuento = precio * 0.1;
        }
        double precioFinal = precio - descuento;
        return precioFinal;
    }
    
    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
        double area =0;
        switch (tipoFigura) {
            case 1:
            area = ladoCuadrado * ladoCuadrado;
                
                break;

                case 2:
                area = (baseTriangulo * alturaTriangulo) / 2;
                break;

                case 3:
        area = Math.PI * radioCirculo * radioCirculo;
        break;
            default:
            return "Tipo de figura no valida.";
        }
        return "El área de la figura es:" + area;
    }
    
    public int ejercicio5(int num1, int num2, int num3) {
        int menor = num1;
        if (num2<menor) {
            menor = num2;

        }
        return menor;
    }
}
