import java.util.Scanner;
import java.util.Random;

public class casino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int monedas = 100;
        int partidas = 0;
        int victorias = 0;
        int derrotas = 0;
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("==================");
            System.out.println("     CASINO JAVA  ");
            System.out.println("==================");
            System.out.println("Monedas: " + monedas);
            System.out.println("1.Lanzar Dado");
            System.out.println("2.Lanzar Moneda");
            System.out.println("3.Tragamoneda");
            System.out.println("4.Ruleta");
            System.out.println("5.Piedra, Papel o Tijera");
            System.out.println("6.Carrera de Caballos");
            System.out.println("7.Ver estadísticas");
            System.out.println("8.Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    if (monedas >= 10) {
                        monedas -= 10;
                        partidas++;
                        System.out.println("Lanzando dado...");
                        int dado = random.nextInt(6) + 1;
                        System.out.println("El dado cayó en: " + dado);
                        if (dado == 6) {
                            victorias++;
                            monedas += 30;
                            System.out.println("¡Ganaste 30 monedas!");
                        } else if (dado == 5) {
                            victorias++;
                            monedas += 20;
                            System.out.println("¡Ganaste 20 monedas!");
                        } else if (dado == 4) {
                            victorias++;
                            monedas += 10;
                            System.out.println("¡Ganaste 10 monedas!");
                        } else {
                            derrotas++;
                            System.out.println("Perdiste.");
                        }
                        System.out.println("monedas actuales: " + monedas);
                    } else {
                        System.out.println("Falta de monedas, no puedes jugar.");
                    }
                    break;
                case 2:
                    if (monedas >= 10) {
                        monedas -= 10;
                        partidas++;
                        System.out.println("1. Cara");
                        System.out.println("2. Sello");
                        int jugador = teclado.nextInt();
                        System.out.println("Lanzando moneda...");
                        int computadora = random.nextInt(2) + 1;
                        if (computadora == jugador) {
                            monedas += 20;
                            victorias++;
                            System.out.println("Ganaste.");
                        } else {
                            derrotas++;
                            System.out.println("Perdiste.");
                        }
                        System.out.println("monedas actuales: " + monedas);
                    } else {
                        System.out.println("Falta de monedas, no puedes jugar.");
                    }
                    break;
                case 3:
                    if (monedas >= 10) {
                        monedas -= 10;
                        partidas++;
                        int s1 = random.nextInt(5) + 1;
                        int s2 = random.nextInt(5) + 1;
                        int s3 = random.nextInt(5) + 1;
                        switch (s1) {
                            case 1:
                                System.out.print("1");
                                break;
                            case 2:
                                System.out.print("2");
                                break;
                            case 3:
                                System.out.print("3");
                                break;
                            case 4:
                                System.out.print("4");
                                break;
                            case 5:
                                System.out.print("5");
                                break;
                        }
                        switch (s2) {
                            case 1:
                                System.out.print("1");
                                break;
                            case 2:
                                System.out.print("2");
                                break;
                            case 3:
                                System.out.print("3");
                                break;
                            case 4:
                                System.out.print("4");
                                break;
                            case 5:
                                System.out.print("5");
                                break;
                        }
                        switch (s3) {
                            case 1:
                                System.out.print("1");
                                break;
                            case 2:
                                System.out.print("2");
                                break;
                            case 3:
                                System.out.print("3");
                                break;
                            case 4:
                                System.out.print("4");
                                break;
                            case 5:
                                System.out.print("5");
                                break;
                        }
                        System.out.println();
                        if (s1 == s2 && s2 == s3) {
                            monedas += 100;
                            victorias++;
                            System.out.println("¡¡JACKPOT!!");
                            System.out.println("¡Ganaste 100 monedas!");
                        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                            monedas += 30;
                            victorias++;
                            System.out.println("¡Ganaste 30 monedas!");
                        } else {
                            derrotas++;
                            System.out.println("Perdiste.");
                        }
                    } else {
                        System.out.println("Falta de monedas, no puedes jugar.");
                    }
                    break;
                case 4:
                    if (monedas >= 10) {
                        monedas -= 10;
                        partidas++;
                        System.out.println("Ruleta");
                        System.out.print("Apostar un número (0-36): ");
                        int apuesta = teclado.nextInt();

                        while (apuesta < 0 || apuesta > 36) {
                            System.out.print("Número invalido. Ingrese un numero entre 0 y 36: ");
                            apuesta = teclado.nextInt();
                        }

                        int ruleta = random.nextInt(37); 
                        System.out.println("La ruleta cayo en: " + ruleta);

                        if (apuesta == ruleta) {
                            monedas += 100;
                            victorias++;
                            System.out.println("¡Adivinaste! Ganaste 100 monedas.");
                        } else {
                            derrotas++;
                            System.out.println("No adivinaste.");
                        }
                        System.out.println("Monedas actuales: " + monedas);
                    } else {
                        System.out.println("No tienes suficientes monedas para jugar.");
                    }
                    break;
                case 5:
                    if (monedas >= 10) {
                        monedas -= 10;
                        partidas++;

                        System.out.println("PIEDRA, PAPEL O TIJERA");
                        System.out.println("1. Piedra");
                        System.out.println("2. Papel");
                        System.out.println("3. Tijera");
                        System.out.print("Elige una opción: ");
                        int jugador = teclado.nextInt();

                        int computadora = random.nextInt(3) + 1;

                        System.out.print("La computadora eligió: ");
                        switch (computadora) {
                            case 1:
                                System.out.println("Piedra");
                                break;
                            case 2:
                                System.out.println("Papel");
                                break;
                            case 3:
                                System.out.println("Tijera");
                                break;
                        }

                        if (jugador == computadora) {
                            monedas += 10;
                            System.out.println("Empate.");
                        } else if ((jugador == 1 && computadora == 3) ||
                                (jugador == 2 && computadora == 1) ||
                                (jugador == 3 && computadora == 2)) {
                            victorias++;
                            monedas += 20;
                            System.out.println("¡Ganaste 20 monedas!");
                        } else {
                            derrotas++;
                            System.out.println("Perdiste.");
                        }

                        System.out.println("Monedas actuales: " + monedas);

                    } else {
                        System.out.println("Falta de monedas, no puedes jugar.");
                    }
                    break;
                case 6:
                    if (monedas < 10) {
                        System.out.println("No tienes suficientes monedas.");
                        break;
                    }
                    monedas -= 10;
                    partidas++;
                    System.out.println("CARRERA DE CABALLOS ");
                    System.out.print("Elige un caballo (1-5): ");
                    int caballo = teclado.nextInt();

                    while (caballo < 1 || caballo > 5) {
                        System.out.print("Elige un número válido (1-5): ");
                        caballo = teclado.nextInt();
                    }
                    teclado.nextLine();
                    int[] posiciones = new int[5];
                    int meta = 20;
                    int ganador = 0;
                    System.out.println("¡Comienza la carrera!");

                    while (ganador == 0) {

                        for (int i = 0; i < 5; i++) {
                            posiciones[i] += random.nextInt(3) + 1;

                            System.out.print("Caballo " + (i + 1) + ": ");

                            for (int j = 0; j < posiciones[i] && j < meta; j++) {
                                System.out.print("■");
                            }

                            System.out.println(" (" + posiciones[i] + "/" + meta + ")");

                            if (posiciones[i] >= meta && ganador == 0) {
                                ganador = i + 1;
                            }
                        }

                        if (ganador == 0) {
                            System.out.println("\nPresiona ENTER para continuar...");
                            teclado.nextLine();
                        }

                        System.out.println();
                    }

                    System.out.println("Ganó el caballo " + ganador);

                    if (caballo == ganador) {
                        monedas += 50;
                        victorias++;
                        System.out.println(" ¡Ganaste 50 monedas!");
                    } else {
                        derrotas++;
                        System.out.println(" Perdiste la apuesta.");
                    }

                    System.out.println(" Monedas: " + monedas);
                    break;
                case 7:
                    System.out.println("===== ESTADÍSTICAS =====");
                    System.out.println("Monedas: " + monedas);
                    System.out.println("Partidas jugadas: " + partidas);
                    System.out.println("Victorias: " + victorias);
                    System.out.println("Derrotas: " + derrotas);

                default:
                    System.out.println("Opcion invalida");
                    break;
                case 8:
                    System.out.println("FIN DEL CASINO");
                    System.out.println("Monedas finales: " + monedas);
                    System.out.println("Partidas jugadas: " + partidas);
                    System.out.println("Victorias: " + victorias);
                    System.out.println("Derrotas: " + derrotas);
                    System.out.println("Gracias por jugar.");
                    System.out.println("======================");
                    break;

            }
        }

    }
}
