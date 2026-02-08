public class Luhn {
    public int converterTipagem(char c) {
        switch (c) {
            case '0': 
                return 0;
            case '1': 
                return 1;
            case '2': 
                return 2;
            case '3': 
                return 3;
            case '4': 
                return 4;
            case '5': 
                return 5;
            case '6': 
                return 6;
            case '7': 
                return 7;
            case '8': 
                return 8;
            case '9': 
                return 9;
            default:  
                return -1; 
        }
    }

    public String numValido(String numeroCartao) {
        String soNumeros = "";

        for (int i = 0; i < numeroCartao.length(); i++) {
            char c = numeroCartao.charAt(i);

            if (c == ' ') {
                continue; 
            }

            int valor = converterTipagem(c);

            if (valor == -1) {
                return "Caracter não permitido!"; 
            }
            soNumeros = soNumeros + c; 
        }

        if (soNumeros.length() <= 1) {
            return "Strings de comprimento 1 ou menos não são válidas!";
        }

        int soma = 0;
        boolean dobrar = false;

        for (int i = soNumeros.length() - 1; i >= 0; i--) {
            char c = soNumeros.charAt(i);
            
            int digito = converterTipagem(c);

            if (dobrar) {
                digito = digito * 2;
                if (digito > 9) {
                    digito = digito - 9;
                }
            }

            soma = soma + digito;
            
            if (dobrar == true) {
                dobrar = false;
            } else {
                dobrar = true;
            }
        }
        if (soma % 10 == 0){
            return "O número " + numeroCartao + " número é válido!";
        }  
        else {
            return "O número " + numeroCartao + " é inválido!";
        }     
    }
}