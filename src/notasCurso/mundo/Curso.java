/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: notas de un curso
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package notasCurso.mundo;

/**
 * Clase que representa un curso.
 */
public class Curso {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Total de estudiantes en el curso.
     */
    public final static int TOTAL_EST = 12;
    public final static int NOTA_MENOR = 60;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Notas de los estudiantes.
     */
    private double[] notas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un nuevo curso, inicializando todas las notas en cero.
     */
    public Curso() {
        notas = new double[TOTAL_EST];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0.0;
        }
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Calcula el promedio del curso.
     *
     * @return Promedio de todas las notas del curso. promedio >= 0.
     */
    public double promedio() {
        // TODO: Obtener el promedio de las notas de los estudiantes
        double suma = 0;
        for (int indice = 0; indice < TOTAL_EST; indice ++ ){
            suma += notas[indice];
        }
        double promedio = suma / TOTAL_EST;
        return promedio;
    }

    /**
     * Devuelve el n�mero de estudiantes que tienen la nota mayor al promedio.
     *
     * @return N�mero de estudiantes que tienen la nota mayor al promedio. n�mero >= 0.
     */
    public int darCantidadSobrePromedio() {
        // TODO: Calcular el n�mero de notas mayores
        int suma = 0;
        for (int i = 0; i < TOTAL_EST; i++ ){
            if (notas[i] > promedio()) {
                suma ++;
            }
        }
        return suma;
    }

    /**
     * Devuelve la nota de un estudiante del curso.
     *
     * @param pNumEstudiante N�mero del estudiante : 1 <= estudiante <= 12.
     * @return Nota del estudiante.
     */
    public double darNota(int pNumEstudiante) {
        return notas[pNumEstudiante - 1];
    }

    /**
     * Cambia la nota de un estudiante en el curso.
     *
     * @param pNumEstudiante N�mero del estudiante. 1 <= estudiante <= 12.
     * @param pNota          Nota del estudiante.
     */
    public void cambiarNota(int pNumEstudiante, double pNota) {
        // TODO: Cambiar la nota del estudiante pNumEstudiante
       notas[pNumEstudiante - 1] = pNota;
    }


    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------
    /**
     * Obtener la cantidad de estudiantes que no pasaron el curso
     */
    public int cantidadReprobados() {
        // TODO: Obtener la cantidad de estudiantes que no pasaron el curso
        int suma = 0;
        for (int i = 0; i < TOTAL_EST; i++ ){
            if (notas[i] < NOTA_MENOR) {
                suma ++;
            }
        }
        return suma;
    }

    /**
     * Obtener la mejor nota del curso.
     */
    public double mejorNota() {
        // TODO: Obtener la mejor nota del curso.
        double nuevaMejorNota = 0;
        for (int i = 0; i < TOTAL_EST; i++){
            if ( notas[i] > nuevaMejorNota ){
                nuevaMejorNota = notas[i];
            }
        }
        return nuevaMejorNota;
    }

    /**
     * Obtener el porcentaje de estudiantes que pasaron el curso
     * Debe ser un n�mero entre 0 y 100.
     */
    public double darPorcentajePasaron() {
        // TODO: Obtener el porcentaje de estudiantes que pasaron el curso
        double suma = 0;
        for (int i = 0; i < TOTAL_EST; i++ ){
            if (notas[i] >= NOTA_MENOR) {
                suma ++;
            }
        }
        return (suma*100)/12;
    }


    /**
     * Determinar si todos los estudiantes del curso pasaron la materia
     * Retorna true si todos tuvieron notas aprobatorias, o false cuando al menos
     * un estudiante reprob� la materia.
     */
    public boolean todosPasaron() {
        // TODO: Determinar si todos los estudiantes del curso pasaron la materia
        int suma = 0;
        if (cantidadReprobados() == 0) {
            return true;
        }
        else
            return false;
    }

}