package app;

import model.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Programa ingSis = new Programa("Ingenieria en sistemas y computacion");
        Profesor yuliana = new ProfesorPlanta("1", "Yuliana Rodriguez" , "Licenciada en Matematicas", 4, ingSis,
                "SINFOCI", DedicacionProfesor.TIEMPO_COMPLETO);
        Profesor robinson = new ProfesorCatedra("2", "Robinson Arias", "Ingenierio de sistemas y computacion", 5,
                ingSis, 340, "Microsoft");
        Materia calculoDiferencial = new MateriaTeorica("1", "Calculo diferencial", 6, 4, 2, yuliana, ingSis);
        Materia programacion1 = new MateriaPractica("2","Programacion POO", 4, 3, 2, robinson, ingSis, 2, 12 );
        //Prueba registro materias teoricas y practicas:
        System.out.println("Prueba registro materias teoricas y practicas:");
        System.out.println(ingSis.agregarMateria(calculoDiferencial));
        System.out.println(ingSis.agregarMateria(programacion1));
        //Verificar que no se puedan registrar dos veces la misma asignatura.
        System.out.println("Verificar que no se puedan registrar dos veces la misma asignatura.");
        System.out.println(ingSis.agregarMateria(calculoDiferencial));
        System.out.println(ingSis.agregarMateria(programacion1));

        //Prueba consultar materias de un semestre especifico
        System.out.println("Prueba consultar materias de un semestre especifico");
        System.out.println(ingSis.consultarMateriasSemestre(2));
        //Prueba consultar materias de un semestre vacio
        System.out.println("Prueba consultar materias de un semestre vacio");
        System.out.println(ingSis.consultarMateriasSemestre(1));

        //Prueba asociar un profesor una materia.
        System.out.println("Prueba asociar un profesor una materia.");
        System.out.println(ingSis.asociarProfesorMateria(yuliana, programacion1));
        System.out.println(programacion1.getProfesor());

        //Prueba inscribir varios estudiantes en una materia.
        System.out.println("Prueba inscribir varios estudiantes en una materia.");
        Estudiante est1 = new EstudiantePregrado("1", "Juan", "1091", 2, ingSis, true, 4.73);
        Estudiante est2 = new EstudiantePregrado("2", "Nata", "1092", 2, ingSis, false, 4.3);
        Estudiante est3 = new EstudiantePregrado("3", "Miguel", "1090", 2, ingSis, true, 3.73);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        System.out.println(calculoDiferencial.agregarEstudiantes(estudiantes));
        System.out.println(calculoDiferencial.getListaEstudiantes());

        //Prueba listar estudiantes matriculados en una asignatura
        System.out.println("Prueba listar estudiantes matriculados en una asignatura:");
        System.out.println(calculoDiferencial.listarEstudiantesMatriculados());

        //Prueba calcular total horas semanales
        System.out.println("Prueba calcular total horas semanales:");
        System.out.println(calculoDiferencial.calcularTotalHoras());

        //Prueba obtener el numero total de creditos que un estudiante cursa por semestre.
        programacion1.agregarEstudiante(est1);
        System.out.println(est1.calcularCreditosCursando());
        System.out.println(est1.getListaMaterias());
    }
}
