// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Random;
import java.util.Scanner;

public class avanzado {
   public avanzado() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      int var3 = 100;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      while(var7 != 8) {
         System.out.println("==================");
         System.out.println("     CASINO JAVA  ");
         System.out.println("==================");
         System.out.println("Monedas: " + var3);
         System.out.println("1.Lanzar Dado");
         System.out.println("2.Lanzar Moneda");
         System.out.println("3.Tragamoneda");
         System.out.println("4.Ruleta");
         System.out.println("5.Piedra, Papel o Tijera");
         System.out.println("6.Carrera de Caballos");
         System.out.println("7.Ver estadísticas");
         System.out.println("8.Salir");
         var7 = var1.nextInt();
         switch (var7) {
            case 1:
               if (var3 >= 10) {
                  var3 -= 10;
                  ++var4;
                  System.out.println("Lanzando dado...");
                  int var18 = var2.nextInt(6) + 1;
                  System.out.println("El dado cayó en: " + var18);
                  if (var18 == 6) {
                     ++var5;
                     var3 += 30;
                     System.out.println("¡Ganaste 30 monedas!");
                  } else if (var18 == 5) {
                     ++var5;
                     var3 += 20;
                     System.out.println("¡Ganaste 20 monedas!");
                  } else if (var18 == 4) {
                     ++var5;
                     var3 += 10;
                     System.out.println("¡Ganaste 10 monedas!");
                  } else {
                     ++var6;
                     System.out.println("Perdiste.");
                  }

                  System.out.println("monedas actuales: " + var3);
               } else {
                  System.out.println("Falta de monedas, no puedes jugar.");
               }
               break;
            case 2:
               if (var3 >= 10) {
                  var3 -= 10;
                  ++var4;
                  System.out.println("1. Cara");
                  System.out.println("2. Sello");
                  int var17 = var1.nextInt();
                  System.out.println("Lanzando moneda...");
                  int var22 = var2.nextInt(2) + 1;
                  if (var22 == var17) {
                     var3 += 20;
                     ++var5;
                     System.out.println("Ganaste.");
                  } else {
                     ++var6;
                     System.out.println("Perdiste.");
                  }

                  System.out.println("monedas actuales: " + var3);
               } else {
                  System.out.println("Falta de monedas, no puedes jugar.");
               }
               break;
            case 3:
               if (var3 >= 10) {
                  var3 -= 10;
                  ++var4;
                  int var16 = var2.nextInt(5) + 1;
                  int var21 = var2.nextInt(5) + 1;
                  int var23 = var2.nextInt(5) + 1;
                  switch (var16) {
                     case 1 -> System.out.print("1");
                     case 2 -> System.out.print("2");
                     case 3 -> System.out.print("3");
                     case 4 -> System.out.print("4");
                     case 5 -> System.out.print("5");
                  }

                  switch (var21) {
                     case 1 -> System.out.print("1");
                     case 2 -> System.out.print("2");
                     case 3 -> System.out.print("3");
                     case 4 -> System.out.print("4");
                     case 5 -> System.out.print("5");
                  }

                  switch (var23) {
                     case 1 -> System.out.print("1");
                     case 2 -> System.out.print("2");
                     case 3 -> System.out.print("3");
                     case 4 -> System.out.print("4");
                     case 5 -> System.out.print("5");
                  }

                  System.out.println();
                  if (var16 == var21 && var21 == var23) {
                     var3 += 100;
                     ++var5;
                     System.out.println("¡¡JACKPOT!!");
                     System.out.println("¡Ganaste 100 monedas!");
                     break;
                  }

                  if (var16 != var21 && var21 != var23 && var16 != var23) {
                     ++var6;
                     System.out.println("Perdiste.");
                     break;
                  }

                  var3 += 30;
                  ++var5;
                  System.out.println("¡Ganaste 30 monedas!");
                  break;
               }

               System.out.println("Falta de monedas, no puedes jugar.");
               break;
            case 4:
               if (var3 < 10) {
                  System.out.println("No tienes suficientes monedas para jugar.");
                  break;
               }

               var3 -= 10;
               ++var4;
               System.out.println("Ruleta");
               System.out.print("Apostar un número (0-36): ");

               int var15;
               for(var15 = var1.nextInt(); var15 < 0 || var15 > 36; var15 = var1.nextInt()) {
                  System.out.print("Número invalido. Ingrese un numero entre 0 y 36: ");
               }

               int var20 = var2.nextInt(37);
               System.out.println("La ruleta cayo en: " + var20);
               if (var15 == var20) {
                  var3 += 100;
                  ++var5;
                  System.out.println("¡Adivinaste! Ganaste 100 monedas.");
               } else {
                  ++var6;
                  System.out.println("No adivinaste.");
               }

               System.out.println("Monedas actuales: " + var3);
               break;
            case 5:
               if (var3 >= 10) {
                  var3 -= 10;
                  ++var4;
                  System.out.println("PIEDRA, PAPEL O TIJERA");
                  System.out.println("1. Piedra");
                  System.out.println("2. Papel");
                  System.out.println("3. Tijera");
                  System.out.print("Elige una opción: ");
                  int var14 = var1.nextInt();
                  int var19 = var2.nextInt(3) + 1;
                  System.out.print("La computadora eligió: ");
                  switch (var19) {
                     case 1 -> System.out.println("Piedra");
                     case 2 -> System.out.println("Papel");
                     case 3 -> System.out.println("Tijera");
                  }

                  if (var14 == var19) {
                     var3 += 10;
                     System.out.println("Empate.");
                  } else if ((var14 != 1 || var19 != 3) && (var14 != 2 || var19 != 1) && (var14 != 3 || var19 != 2)) {
                     ++var6;
                     System.out.println("Perdiste.");
                  } else {
                     ++var5;
                     var3 += 20;
                     System.out.println("¡Ganaste 20 monedas!");
                  }

                  System.out.println("Monedas actuales: " + var3);
                  break;
               }

               System.out.println("Falta de monedas, no puedes jugar.");
               break;
            case 6:
               if (var3 < 10) {
                  System.out.println("No tienes suficientes monedas.");
                  break;
               }

               var3 -= 10;
               ++var4;
               System.out.println("CARRERA DE CABALLOS ");
               System.out.print("Elige un caballo (1-5): ");

               int var8;
               for(var8 = var1.nextInt(); var8 < 1 || var8 > 5; var8 = var1.nextInt()) {
                  System.out.print("Elige un número válido (1-5): ");
               }

               var1.nextLine();
               int[] var9 = new int[5];
               byte var10 = 20;
               int var11 = 0;
               System.out.println("¡Comienza la carrera!");

               for(; var11 == 0; System.out.println()) {
                  for(int var12 = 0; var12 < 5; ++var12) {
                     var9[var12] += var2.nextInt(3) + 1;
                     System.out.print("Caballo " + (var12 + 1) + ": ");

                     for(int var13 = 0; var13 < var9[var12] && var13 < var10; ++var13) {
                        System.out.print("*");
                     }

                     System.out.println(" (" + var9[var12] + "/" + var10 + ")");
                     if (var9[var12] >= var10 && var11 == 0) {
                        var11 = var12 + 1;
                     }
                  }

                  if (var11 == 0) {
                     System.out.println("\nPresiona ENTER para continuar...");
                     var1.nextLine();
                  }
               }

               System.out.println("Ganó el caballo " + var11);
               if (var8 == var11) {
                  var3 += 50;
                  ++var5;
                  System.out.println(" ¡Ganaste 50 monedas!");
               } else {
                  ++var6;
                  System.out.println(" Perdiste la apuesta.");
               }

               System.out.println(" Monedas: " + var3);
               break;
            case 7:
               System.out.println("===== ESTADÍSTICAS =====");
               System.out.println("Monedas: " + var3);
               System.out.println("Partidas jugadas: " + var4);
               System.out.println("Victorias: " + var5);
               System.out.println("Derrotas: " + var6);
            default:
               System.out.println("Opcion invalida");
               break;
            case 8:
               System.out.println("FIN DEL CASINO");
               System.out.println("Monedas finales: " + var3);
               System.out.println("Partidas jugadas: " + var4);
               System.out.println("Victorias: " + var5);
               System.out.println("Derrotas: " + var6);
               System.out.println("Gracias por jugar.");
               System.out.println("======================");
         }
      }

   }
}