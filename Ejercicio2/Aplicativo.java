/*
Nombre : Luis Pachacama
 */

public class Aplicativo {
    public static void main(String[] args) {
        Datos objeto1 = new Datos(24f, 55f);
        
        float valor1,valor2,r1,r2;
        valor1=objeto1.getValor1();
        valor2=objeto1.getValor2();
        
        r1=objeto1.sumarValores(valor1, valor2);
        r2=objeto1.sumarValores(valor1, valor2);
        System.out.println(" el resultado de la suma es :"+r1);
        System.out.println("el resultado de la suma es :"+r2);
    }
            
    
}