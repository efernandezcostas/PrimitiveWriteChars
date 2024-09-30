import java.io.*;

public class Main {
    public static void main(String[] args) {

        String cadea = "o tempo está xélido";

        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/dam/Work/Clase/AccesoDatos/ExercicioPrimitiveWriteChars/texto5.txt", true)));
            for (int i=0; i<2; i++){
                dos.writeChars(cadea);
                System.out.println((i+1)+" vez: "+cadea+"\nTamano do ficheiro: "+dos.size()+" bytes");
            }
            System.out.println("Tamano final do ficheiro: "+dos.size()+" bytes");
            dos.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("/home/dam/Work/Clase/AccesoDatos/ExercicioPrimitiveWriteChars/texto5.txt")));

            while (dis.available() != 0) {
                for (int i=0; i<cadea.length(); i++){
                    System.out.print(dis.readChar());
                }
                System.out.println("\nQuedan: "+dis.available()+" bytes");
            }
            System.out.println("Xa non queda nada por ler");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}