class Grupo{
   private  String grupo;//deficeintes,listos,inmigrantes
    private int codigo;

    public Grupo(String grupo, int codigo) {
        this.grupo = grupo;
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getCodigo() {
        return codigo;
    }
}


class Rama{
    String asignatura;
    String tema;


    public Rama(String asignatura, String tema ) {
        this.asignatura = asignatura;
        this.tema = tema;

    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getTema() {
        return tema;
    }


}
class Profe{
    String name;
    int copias;

    public Profe(String name, int copias) {
        this.name = name;
        this.copias = copias;
    }
}



public class Examenes {
    private Grupo grupo;
    private Rama rama;
    private Profe profe;

    public Examenes(Grupo grupo, Rama rama, Profe profe) {
        this.grupo = grupo;
        this.rama = rama;
        this.profe = profe;
    }

    public static void main(String[] args) {
        Grupo tonto=new Grupo("tontos",12897);
        Rama matematicas=new Rama("mates","tema2 y 4");
        Profe Patricia=new Profe("Patricia",25);

        Examenes examen4=new Examenes(tonto,matematicas,Patricia);

        System.out.println(examen4.rama.getAsignatura());
    }


}
