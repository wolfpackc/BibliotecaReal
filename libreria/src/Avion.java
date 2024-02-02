class Pasajeros{

    private String nombre;
    private int num_embarque;



    public Pasajeros(String name,int num_emb){
        nombre=name;
        num_embarque=num_emb;

    }
}

public class Avion {
    static int num_aviones;
    static int num_pasajeros;
    Pasajeros[] pasajero;
    private String modelo;
    private String[] salidasPrevistas;

    static {
        num_aviones=0;
    }
    static{
        num_pasajeros=0;
    }

    public Avion(String mod,int capPasajeros){
        modelo=mod;
        num_aviones++;
        pasajero=new Pasajeros[capPasajeros];


    }
    public void setSalidasPrevistas(String[] salidasPrevistas) {
        this.salidasPrevistas = salidasPrevistas;
    }


    public void setPasajero(String name,int num_emb) {
        pasajero[num_pasajeros]=new Pasajeros(name,num_emb);
        num_pasajeros++;
    }


    public void DeleteSobrantes(){
        Pasajeros[] pasnew=new Pasajeros[num_pasajeros];
        int cont=0;
        for (int i =num_pasajeros;i<pasajero.length;i++){
            if (pasajero[i]==null){
                cont++;
            }


        }

        for (int i =0;i<pasajero.length-cont;i++){
            pasnew[i]=pasajero[i];


        }
        pasajero=pasnew;

    }


    public static void main(String[] args) {
        Avion airbus1=new Avion("airbus121",120);
        String[] exits= {"PAris","Berlin","MAdrid"};
        airbus1.setSalidasPrevistas(exits);
        airbus1.setPasajero("Pedrito",123);


    }
}
