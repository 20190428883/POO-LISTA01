
public class DistanciaHamming {
    public int calcularDistancia(String fita1, String fita2) {
        if (fita1.length() != fita2.length()) {
            System.out.println("As cadeias de DNA devem ter o mesmo tamanho.");
        }

        int distancia = 0;

        for (int i = 0; i < fita1.length(); i++) {
            if (fita1.charAt(i) != fita2.charAt(i)) {
                distancia++;
            }
        }
        return distancia;
    }  
}

