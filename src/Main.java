import java.io.EOFException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Main {
    private static List<Resultados> listaResultados = new ArrayList<>();

    public static void main(String[] args) {
        mainmenu();
    }



//-------------------------------FIGURAS------------------------------------------------------//


    private static void circulo(Scanner scanner){
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el circulo");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. Regresar al menú principal");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    areacirculo(scanner);
                    break;
                case 2:
                    perimetrocirculo(scanner);
                    break;
                case 3:
                    mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }

    private static void cuadrado(Scanner scanner){
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el cuadrado");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. Regresar al menú principal");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    areacuadrado(scanner);
                    break;
                case 2:
                    perimetrocuadrado(scanner);
                    break;
                case 3:
                    mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }


    private static void triangulo(Scanner scanner){
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el triangulo");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. Regresar al menú principal");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    areatriangulo(scanner);
                    break;
                case 2:
                    perimetrotriangulo(scanner);
                    break;
                case 3:
                    mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }

    private static void rectangulo(Scanner scanner){
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el rectangulo");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. Regresar al menú principal");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    arearectangulo(scanner);
                    break;
                case 2:
                    perimetrorectangulo(scanner);
                    break;
                case 3:
                    mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }

    private static void pentagono(Scanner scanner){
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el pentagono");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. Regresar al menú principal");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    areapentagono(scanner);
                    break;
                case 2:
                    perimetropentagono(scanner);
                    break;
                case 3:
                    mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }


    //-----------------------------AREAS------------------------------------------------------//

    private static void areacirculo(Scanner scanner) {

        float entrada;
        System.out.println("AREA DE CIRCULO");
        System.out.println("Ingrese el radio del circulo en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = (float) (Math.pow(entrada, 2) * Math.PI);
        System.out.println("El area del circulo es de :" + resultado + " centimetros cuadrados");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    private static void areacuadrado(Scanner scanner) {

        float entrada;
        System.out.println("AREA DE CUADRADO");
        System.out.println("Ingrese un lado del cuadrado en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = (float) (Math.pow(entrada, 2));
        System.out.println("El area del cuadrado es de :" + resultado + " centimetros cuadrados");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }


    private static void areatriangulo(Scanner scanner) {

        float base;
        float altura;
        System.out.println("AREA DE TRIANGULO");
        System.out.println("Ingrese la base del triangulo en centimetros");
        try {
            base = scanner.nextInt();
        } catch (InputMismatchException e) {
            base = 100;
            scanner.next();
        }
        System.out.println("Ingrese la altura del triangulo en centimetros");
        try {
            altura = scanner.nextInt();
        } catch (InputMismatchException e) {
            altura = 100;
            scanner.next();
        }
        float resultado = (base * altura) / 2;
        System.out.println("El area del triangulo es de :" + resultado + " centimetros cuadrados");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }



    private static void arearectangulo(Scanner scanner) {

        float base;
        float altura;
        System.out.println("AREA DE RECTANGULO");
        System.out.println("Ingrese la base del rectangulo en centimetros");
        try {
            base = scanner.nextInt();
        } catch (InputMismatchException e) {
            base = 100;
            scanner.next();
        }
        System.out.println("Ingrese la altura del rectangulo en centimetros");
        try {
            altura = scanner.nextInt();
        } catch (InputMismatchException e) {
            altura = 100;
            scanner.next();
        }
        float resultado = base * altura;
        System.out.println("El area del rectangulo es de :" + resultado + " centimetros cuadrados");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    private static void areapentagono(Scanner scanner) {

        float entrada;
        System.out.println("AREA DE PENTAGONO");
        System.out.println("Ingrese el lado del pentagono en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float apotema = (float) ((entrada)/((2*Math.tan(0.628319))));
        System.out.println("La apotema del pentagono es de :" + apotema + " centimetros cuadrados");
        float resultado = (entrada * 5 * apotema) / 2;
        System.out.println("El area del pentagono es de :" + resultado + " centimetros cuadrados");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }
















    //------------------------------------------------PERIMETROS-----------------------------------------------//

    private static void perimetrocirculo(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE CIRCULO");
        System.out.println("Ingrese el radio del circulo en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = (float) (entrada * 2 * Math.PI);
        System.out.println("El perimetro del circulo es de :" + resultado + " centimetros");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    private static void perimetrocuadrado(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE CUADRADO");
        System.out.println("Ingrese un lado del cuadrado en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = entrada * 4;
        System.out.println("El perimetro del cuadrado es de :" + resultado + " centimetros");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    private static void perimetrotriangulo(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE TRIANGULO");
        System.out.println("Ingrese un lado del triangulo en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = entrada * 3;
        System.out.println("El perimetro del triangulo es de :" + resultado + " centimetros");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    private static void perimetrorectangulo(Scanner scanner) {

        float base;
        float altura;
        System.out.println("AREA DE RECTANGULO");
        System.out.println("Ingrese la base del rectangulo en centimetros");
        try {
            base = scanner.nextInt();
        } catch (InputMismatchException e) {
            base = 100;
            scanner.next();
        }
        System.out.println("Ingrese la altura del rectangulo en centimetros");
        try {
            altura = scanner.nextInt();
        } catch (InputMismatchException e) {
            altura = 100;
            scanner.next();
        }
        float resultado = (base*2) + (altura*2);
        System.out.println("El perimetro del rectangulo es de :" + resultado + " centimetros");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    private static void perimetropentagono(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE PENTAGONO");
        System.out.println("Ingrese un lado del pentagono en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = entrada * 5;
        System.out.println("El perimetro del pentagono es de :" + resultado + " centimetros");
        listaResultados.add(new Resultados(resultado));
        mainmenu();


    }

    //--------------------------------MENU PRINCIPAL DE CALCULADORA-----------------------------------------------//

    private static void mainmenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("BIENVENIDO A LA CALCULADORA DE AREAS Y PERIMETROS");
            System.out.println("MENU");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Rectangulo");
            System.out.println("5. Pentagono");
            System.out.println("6. Ver resultados anteriores");
            System.out.println("7. Salir");
            System.out.print("\nOPCION: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    circulo(scanner);
                    break;
                case 2:
                    cuadrado(scanner);
                    break;
                case 3:
                    triangulo(scanner);
                    break;
                case 4:
                    rectangulo(scanner);
                    break;
                case 5:
                    pentagono(scanner);
                    break;
                case 6:
                    verresultados();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 7);
    }
    //-------------------------------------ALMACENAR Y VER RESULTADOS-----------------------------------------------//

    private static void verresultados() {
        for (Resultados resultados : listaResultados ) {
            System.out.println("\n" + resultados);
            System.out.println("Resultado: " + resultados.getResultado());
        }
    }

}