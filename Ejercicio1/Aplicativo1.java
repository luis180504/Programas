/**
 Nombre : Luis Pachacama
 *
 */
public class Aplicativo {
    public static void main(String[] args) {
        int edad,e;
        String sexo="",s;
        float altura,a;
        Persona objeto1 = new Persona(20, "MASCULINO",15.6f);
        
        edad=objeto1.getEdad();
        sexo=objeto1.getSexo();
        altura=objeto1.getAltura();
        
        System.out.println("edad :"+edad);
        System.out.println("sexo :"+sexo);
        System.out.println(" altura :"+altura);
    }
    
}
