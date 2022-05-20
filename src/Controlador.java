import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Controlador {
    Scanner scanner = new Scanner(System.in);
    public void crear_archivo()throws IOException {
        System.out.println("Elije la ruta para del fichero");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        file.createNewFile();

        }
    public void crear_directorio(){
        System.out.println("Elije la ruta del directorio");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        file.mkdir();
    }
    public void ejecutar_sobre_un_archivo() throws FileNotFoundException {
        System.out.println("Elije la ruta del fichero");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        File sortida = new File(ruta);
        Scanner myReader = new Scanner(file);
        Scanner secondReader = new Scanner(file);

        int lineas = myReader.nextInt();
        for(int i=0;i<lineas; i++){
            int primernum = Integer.parseInt(myReader.next());
            int segundonum = Integer.parseInt(myReader.next());
            if(primernum > segundonum){
                primernum= primernum+segundonum;
                segundonum= primernum-segundonum;
                primernum= primernum - segundonum;
            }
            for(int k = 0; k<=10; k++){

                int resultado = primernum * k;
                System.out.println(primernum + " x " + k + " = " + resultado);
                if(k==10){
                    k=-1;
                    primernum++;
                }
                if (primernum > segundonum) break;
            }

        }

    }
    public void ejecutar_sobre_todos_los_archivos(){

    }
    public void modificacion_archivo_entrada(){

    }
    public void eliminacion_archivo(){

    }
    public void eliminacion_directorio(){

    }
}
