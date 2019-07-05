/**
 Nombre : Luis Pachacama
 */
public class Persona {
    private int edad;
    private String sexo;
    private float altura;

    public Persona(int edad, String sexo, float altura) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }
    
    
    
}
