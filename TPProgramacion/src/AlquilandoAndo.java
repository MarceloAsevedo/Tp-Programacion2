import java.util.Scanner;

public class AlquilandoAndo {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int opcionMenu = 0;
        String opcion1 = "s";
        Scanner leer = new Scanner(System.in);
        String dato = "s";
        String op = "S";
        do{
            System.out.println("Elija la opción que desea gestionar");
            System.out.println("1: Perfil Administrador");
            System.out.println("2: Clientes");
            System.out.println("3: Reservas");
            System.out.println("4: Alquileres");
            System.out.println("5: Garages");
            System.out.println("6: Autos");

            opcionMenu = leer.nextInt();
            leer.nextLine(); 

            switch (opcionMenu) {
                case 1:
                    String usu;
                    String con;

                    do {
                        System.out.println("Elija opción");
                        System.out.println("1: Crear perfil");
                        System.out.println("2: Iniciar sesión");

                        dato = leer.nextLine();

                        if (dato.equals("1")) {
                            System.out.println("Ingrese usuario");
                            usu = leer.nextLine();
                            System.out.println("Ingrese contraseña");
                            con = leer.nextLine();

                            Administrador admin1 = new Administrador(usu, con);

                            if (dato.equals("2")) {
                                admin1.ValidarAdmin();
                            }
                        }

                        System.out.println("¿Quiere hacer otra operación dentro de Administrador? S/N");
                        opcion1 = leer.nextLine();
                    } while (opcion1.equalsIgnoreCase("s"));
                    break;

                case 2:
                    Cliente client1 = new Cliente();
                    client1.registrarCliente();
                    do{

                    System.out.println("Elija opción");
                    System.out.println("1: Ver datos de Cliente");
                    System.out.println("2: Avalar cliente");
                    System.out.println("3: Llamar cliente");

                    dato = leer.nextLine();

                    switch (dato) {
                        case "1":
                            client1.verDatosCliente();
                            break;
                        case "2":
                            client1.avalarCliente();
                            break;
                        case "3":
                            client1.llamarCliente();
                            break;
                    }
                     System.out.println("¿Desea hacer otra cosa? S/N");
                        dato = leer.nextLine();
                    } while (dato.equalsIgnoreCase("s")||dato.equalsIgnoreCase("S"));
                    break;
                   

                case 3:
                    System.out.println("Crea la reserva");
                    String f;
                    String fv;
                    double pt;

                    System.out.println("Fecha de hoy");
                    f = leer.nextLine();

                    System.out.println("Fecha vencimiento de reserva");
                    fv = leer.nextLine();

                    System.out.println("Precio a pagar");
                    pt = leer.nextDouble();

                    Reserva lareserva1 = new Reserva(pt, f, fv);

                    do {
                        System.out.println("¿Qué quiere hacer con la reserva?");
                        System.out.println("1. Cancelar reserva");
                        System.out.println("2. Pagar reserva");
                        System.out.println("3. Ver Fecha creación de reserva");
                        System.out.println("4. Ver Fecha vencimiento de reserva");

                        dato = leer.nextLine();

                        switch (dato) {
                            case "1":
                                lareserva1.cancelarReserva();
                                break;
                            case "2":
                                lareserva1.adelantarPago();
                                break;
                            case "3":
                                lareserva1.verFechaReserva();
                                break;
                            case "4":
                                lareserva1.verVencimiento();
                                break;
                        }

                        System.out.println("¿Desea hacer otra cosa? S/N");
                        dato = leer.nextLine();
                    } while (dato.equalsIgnoreCase("s")||dato.equalsIgnoreCase("S"));
                    break;

                case 4:
                    String na;
                    String au;
                    String res;
                    String fei;
                    String ff;
                    String caval;
                    double pre;

                    System.out.println("Registre alquiler");
                    System.out.println("Número alquiler");
                    na = leer.nextLine();

                    System.out.println("Auto a alquilar, ingrese patente");
                    au = leer.nextLine();

                    System.out.println("Número de reserva que corresponde");
                    res = leer.nextLine();

                    System.out.println("Fecha inicio periodo");
                    fei = leer.nextLine();

                    System.out.println("Fecha fin de periodo");
                    ff = leer.nextLine();

                    System.out.println("Nombre de cliente aval");
                    caval = leer.nextLine();

                    System.out.println("Precio a pagar");
                    pre = leer.nextDouble();

                    Alquiler alq1 = new Alquiler(au, res, caval, na, fei, ff, pre);

                    System.out.println("Pagar Alquiler? S/N");
                    dato = leer.nextLine();

                    if (dato.equalsIgnoreCase("s")||dato.equalsIgnoreCase("S")) {
                        alq1.pagarAlquiler();
                    }

                    System.out.println("Devolver auto? S/N");
                    dato = leer.nextLine();

                    if (dato.equalsIgnoreCase("s")||dato.equalsIgnoreCase("S")) {
                        alq1.devolverAuto();
                    }

                    System.out.println("Alquilar? S/N");
                    dato = leer.nextLine();

                    if (dato.equalsIgnoreCase("s")||dato.equalsIgnoreCase("S")) {
                        alq1.alquilarAuto();
                    }
                    break;

                case 5:
                    String code;
                    int cMx;

                    System.out.println("Ingrese código de garage");
                    code = leer.nextLine();

                    System.out.println("Ingrese capacidad del garage (cuántos autos le entran)");
                    cMx = leer.nextInt();

                    Garage gara11 = new Garage(code, cMx);
                     do {
                        System.out.println("Que quiere hacer con el garage?");
                        System.out.println("1. ver datos");
                        System.out.println("2. agregar auto");
                        System.out.println("3. sacar auto");
                        dato = leer.nextLine();

                        if (dato.equalsIgnoreCase("1")) {
                            gara11.getGarage();
                        }

                        if (dato.equalsIgnoreCase("2")) {
                            Auto auto1 = new Auto();
                            gara11.agregarAuto(auto1);
                        }

                        if (dato.equalsIgnoreCase("3")) {
                            gara11.sacarAuto();
                        }

                        System.out.println("¿Desea hacer otra cosa? S/N");
                        dato = leer.nextLine();
                    } while (dato.equalsIgnoreCase("s") || dato.equalsIgnoreCase("S"));
                    break;

                case 6:
                    Auto autito = new Auto();
                    double nro;

                    System.out.println("Inserte modelo");
                    dato = leer.nextLine();
                    autito.setModelo(dato);

                    System.out.println("Insetre marca");
                    dato = leer.nextLine();
                    autito.setMarca(dato);

                    System.out.println("Coloque color");
                    dato = leer.nextLine();
                    autito.setColor(dato);

                    System.out.println("Ponga la matricula");
                    dato = leer.nextLine();
                    autito.setMatricula(dato);

                    System.out.println("Precio");
                    nro = leer.nextDouble();
                    autito.setPrecio(nro);

                    System.out.println("Nafta");
                    nro = leer.nextDouble();
                    autito.setNafta(nro);
                    
                    do{

                    System.out.println("Elija opcion que quiera hacer");
                    System.out.println("1 Ver si esta disponible");
                    System.out.println("2 ver precio");
                    System.out.println("3 ver nafta que tiene");
                    dato = leer.nextLine();

                    if (dato.equalsIgnoreCase("1")) {
                        autito.verDisponibilidad();
                    }

               

                    if (dato.equalsIgnoreCase("2")) {
                        autito.consultarPrecio();
                    }
                     if (dato.equalsIgnoreCase("3")) {
                        autito.cuantaNaftaTiene();}
                     System.out.println("Quiere hacer otra cosa con autos? S/N");
            op = leer.nextLine();
                    }while("s".equals(op)||"S".equals(op));
            System.out.println("Quiere hacer otra operacion? S/N");
            op = leer.nextLine();
        
    }
        }while("s".equals(op)||"S".equals(op));
    }}