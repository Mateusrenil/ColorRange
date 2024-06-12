import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento de onda: ");
        double wavelength = scanner.nextDouble();

        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("A cor é Violeta");
        } else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("A cor é Azul");
        } else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("A cor é Verde");
        } else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("A cor é Amarelo");
        } else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("A cor é Laranja");
        } else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("A cor é Vermelho");
        } else {
            System.out.println("O comprimento de onda inserido não está dentro do espectro visível");
        }
    }
}