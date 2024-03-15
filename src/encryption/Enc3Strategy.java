package encryption;

public class Enc3Strategy implements EncStrategy{

    @Override
    public String EncProcess(String INPUT) {
        System.out.println("3 method -- ENCRYPTION:"); //Третий способ шифрования -- вывод кодировки ЮНИКОД
        String result = "";
        for(int i=0;i<INPUT.length();++i){
            char symb = INPUT.charAt(i);
            result += (int)symb + " ";
        }
        return result;
    }
    @Override
    public String DeProcess(String INPUT) {
        String result = "";
        String word = "";

        System.out.println("3 method -- DECODER");
        for(int i=0;i<INPUT.length();++i){

            if(INPUT.charAt(i)==32) {
                if(!word.isEmpty()) {
                    int tmp = Integer.valueOf(word);
                    result += (char) tmp;
                }
                word = "";
            }
            else {
                word += INPUT.charAt(i);
            }

        }
        return result;
    }

}
