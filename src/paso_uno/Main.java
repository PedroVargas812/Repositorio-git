package paso_uno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            int x = 0,y=0;
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                    "octubre", "noviembre", "diciembre"};
            String[] ciudades = {"Quito", "Guayaquil", "Cuenca"};
            int[][] lluvias = {{23,18,24},{15,20,16},{34,30,15},{51,51,50},{68,43,31},{20,22,14},{10,8,9},
                    {15,15,19},{120,115,120},{180,175,130},{90,93,73},{68,72,58}};


            for (int i = 0; i < 3; i++) {
                System.out.println("Ciudad de "+ciudades[i]);
                for (int j = 0; j < 12; j++) {
                    System.out.println(meses[j]+" "+lluvias[j][i]+" l/m2");
                    x += lluvias[j][i];
                    y += lluvias[j][i]/12;
                }
                System.out.println(ciudades[i]+" acumulado: "+x+"l/m2");
                System.out.println(ciudades[i]+" promedio: "+y+"l/m2");

            }


            System.out.println("el acumulado en un año es de: "+ x + " l/m2");
            System.out.println("el promedio mensual es de: "+ y + " l/m2");



        }
    }
}