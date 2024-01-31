class DatosPersonales{
    String nombre;
    String dni;
    String[] estudios;

    public DatosPersonales(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setEstudios(String[] estudios) {
        this.estudios = estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String[] getEstudios() {
        return estudios;
    }
}

class Categoria{
    String rango;
    String codProf;

    public Categoria(String rango, String codProf) {
        this.rango = rango;
        this.codProf = codProf;
    }
}


public class Profesores {
     private DatosPersonales infpers;
     private Categoria cat;

    public Profesores(DatosPersonales infpers, Categoria cat) {
        this.infpers = infpers;
        this.cat = cat;
    }

    public DatosPersonales getInfpers() {
        return infpers;
    }

    public Categoria getCat() {
        return cat;
    }

    public static void main(String[] args) {
        String[] datos={"universisdad de alicante","bachiller","secundaria"};
        DatosPersonales datosFederico=new DatosPersonales("eduardo","54544334");
        datosFederico.setEstudios(datos);
        Categoria catFederico=new Categoria("jefe de estudios","213d");
        Profesores federico=new Profesores(datosFederico,catFederico);


        System.out.println(federico.getInfpers().getNombre());
        System.out.println(federico.getInfpers().getEstudios()[0]);

    }
}
