package encryption;

public class Enc2Strategy implements EncStrategy{

    @Override
    public String EncProcess(String INPUT) {   //Второй способ шифрования -- отзеркаливание русского алфавита БОЛЬШИХ БУКВ**
        System.out.println("2 method -- ENCRYPTION:");
        String result = "";
        for(int i=0;i<INPUT.length();++i){
            char symb = INPUT.charAt(i);
            result += (char)('Я'-(symb-'А'));
        }
        return result;
    }

    @Override
    public String DeProcess(String INPUT) {
        System.out.println("2 method -- DECODER");
        String result = "";
        for(int i=0;i<INPUT.length();++i){
            char symb = INPUT.charAt(i);
            result += (char)('Я'-(symb-'А'));
        }
        return result;
    }
}
