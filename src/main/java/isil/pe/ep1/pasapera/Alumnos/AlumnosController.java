package isil.pe.ep1.pasapera.Alumnos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Alumno")
public class AlumnosController {

    @GetMapping
    @RequestMapping("/ListarAlumnos")
    public List<Alumnos> getAlumno(){
        Alumnos alumno1 = new Alumnos(
                01,
                "Jorge",
                "Pasapera",
                "75161886",
                "ADS2"
        );
        Alumnos alumno2 = new Alumnos(
                02,
                "German",
                "Mesta",
                "25262829",
                "Integracion de apps"
        );
        Alumnos profesor = new Alumnos(
                03,
                "Eduardo",
                "sant",
                "85262829",
                "Integracion de apps"
        );

        return List.of(alumno1,alumno2,profesor);
    }
}
