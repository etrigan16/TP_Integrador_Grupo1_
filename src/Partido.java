import java.nio.file.Files;
import java.nio.file.Paths;

public class Partido {
    public Equipo equipo1;
    public Equipo equipo2;
    int golesEquipo1;
    int golesEquipo2;

    String archivo = Files.readAllLines(Paths.get(("src/resultados.csv")));

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }



}
