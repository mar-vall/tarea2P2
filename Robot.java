
public class Robot
{
    private double[] notas;
    
    public Robot(int cantidadEst){
        notas = new double [cantidadEst];
    }
    public void añadirNotas(double []n){
        if (notas.length == n.length){
            notas = n;
        }
    }
    public double promedioNotas(){
        double suma = 0;
        double promedio;
        for (int i = 0; i < notas.length; i++){
            suma = suma + notas[i];
        }
        promedio = suma / notas.length;
        return promedio;
    }
    public double promedioAprobados(){
        double suma = 0;
        double promedio;
        for (int i = 0; i < notas.length; i++){
            if(notas[i] >= 51){
                suma = suma + notas[i];
            }
        }
        promedio = suma / aprobados();
        return promedio;
    }
    public int reprobados(){
        int nroReprobados = 0;
        for (int i = 0; i < notas.length; i++){
            if (notas[i]<51){
                nroReprobados++;
            }
        }
        return nroReprobados;
    }
    public int aprobados(){
        int nroAprobados = 0;
        for (int i = 0; i < notas.length; i++){
            if(notas[i] >= 51){
                nroAprobados++;
            }
        }
        return nroAprobados;
    }
    public String notaMasAlta(){
        double aux = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > aux){
                aux = notas[i];
            }
        }
        return "La nota más alta es "+ aux;
    }
}
