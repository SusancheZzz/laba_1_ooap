package encryption;

public class Enc1Strategy implements EncStrategy{

    @Override
    public String EncProcess(String INPUT) {    //Первый способ шифрования -- смещение символов
        System.out.println("1 method -- ENCRYPTION:");
        String result = "";
        for(int i=0; i<INPUT.length(); ++i){
            char symb = INPUT.charAt(i);
            result += (char)(symb+5); //Смещение на 5 символов вправо
        }
        return result;
    }

    @Override
    public String DeProcess(String INPUT) {
        System.out.println("1 method -- DECODER");
        String result = "";
        for(int i=0; i<INPUT.length(); ++i){
            char symb = INPUT.charAt(i);
            result += (char)(symb-5); //Смещение на 5 символов влево
        }
        return result;
    }
}
