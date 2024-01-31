class Alumno{
    String dni;
    String nombre;
    int[] calificaciones;

    public Alumno(String dni,String nombre){
        this.dni=(dni==null)?"desconocido":dni;
        this.nombre=nombre;
        calificaciones=new int[3];
        calificaciones[0]=6;
        calificaciones[1]=7;
        calificaciones[2]=4;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}


class Aula{
    String codAula;
    Alumno[] alumno;
    public Aula(String cod){
        codAula=cod;
        alumno=new Alumno[2];
        alumno[0]= new Alumno("462476478","perikoco");
        alumno[1]=new Alumno("1341342234","perikoco2");

    }

    public String getCodAula() {
        return codAula;
    }

    public void setCodAula(String codAula) {
        this.codAula = codAula;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }
}
class Colegio{
    String calle;
    String codColegio;
    Aula[] aulas;
    public Colegio(String address,String cod){
        calle=address;
        codColegio=cod;
        aulas=new Aula[2];
        aulas[0]=new Aula("e232");
        aulas[1]=new Aula("ef54");
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodColegio() {
        return codColegio;
    }

    public void setCodColegio(String codColegio) {
        this.codColegio = codColegio;
    }

    public Aula[] getAulas() {
        return aulas;
    }

    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
    }
}


public class Main {
    public static void main(String[] args) {
        Colegio SagradosCorazones=new Colegio("calle pio 12","3423d");
        System.out.println(SagradosCorazones.getAulas()[1].getAlumno()[1].getCalificaciones()[1]);


    }
}
