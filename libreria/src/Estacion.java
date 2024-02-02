import java.util.Arrays;

class Trenes{
    String modelo;
    int cod;

    static int num_trenes;

    static{
        num_trenes=0;
    }

    public Trenes(String modelo,int codigo){
        this.modelo=modelo;
        cod=codigo;
        num_trenes++;
    }

    public String getModelo() {
        return modelo;
    }
}



public class Estacion {
    String nombre_estacion;
    Trenes[] tren;


    public Estacion(String est){
        nombre_estacion=est;
        tren=new Trenes[2];
        tren[0]=new Trenes("reparador1",77);
        tren[1]=new Trenes("reaparador2",565);

    }

    public void AddTrain(String name,int code){
        Trenes[] trenmasnuevo=new Trenes[tren.length+1];
        for (int i =0;i<tren.length;i++){
            trenmasnuevo[i]=tren[i];
            if (i==tren.length-1){
                trenmasnuevo[i]=new Trenes(name,code);

            }

        }



    }

    public Trenes getTren(int index) {
        return tren[index];
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "nombre_estacion='" + nombre_estacion + '\'' +
                ", tren=" +  +
                '}';
    }

    public static void main(String[] args) {
        Estacion Atocha=new Estacion("Atocha");
        Atocha.AddTrain("Alvia",9876);
        System.out.println(Atocha.getTren(1).getModelo());



    }
}
