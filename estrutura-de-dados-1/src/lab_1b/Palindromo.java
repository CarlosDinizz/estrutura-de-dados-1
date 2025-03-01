import java.text.Normalizer;
import java.util.regex.Pattern;

public class Palindromo {
    private String texto;

    public Palindromo(){
        texto = "";
    }

    public Palindromo(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public boolean verificar(){
        texto = texto.toLowerCase();
        texto = removerAcentos();
        texto = removerSimbolos();

        
        char[] temp = new char[texto.length()];

        
        for (int i = texto.length() - 1; i >= 0; i--){
            temp[texto.length()-1 - i] = texto.charAt(i);
        }

        for(int i = 0; i < texto.length(); i++){
            if (temp[i] != texto.charAt(i)){
                return false;
            }
        }
        
        return true;
    }

    private String removerAcentos(){
        String normalizer =  Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }

    private String removerSimbolos(){
        texto = texto.replaceAll("[.!@#$%¨&*, ;^~´`\\'']+", "");
        return texto;
    }

}
