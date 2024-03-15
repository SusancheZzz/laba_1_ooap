import encryption.Enc1Strategy;
import encryption.Enc2Strategy;
import encryption.Enc3Strategy;
import encryption.Encryption;

public class Main {
    public static void main(String[] args){

        Encryption enc1 = new Encryption(new Enc3Strategy());
        enc1.setData("ПАПА МЫЛ ОКНО");

        String res_enc1 = enc1.EncProcess(enc1.input_str);
        System.out.println(res_enc1);

        System.out.println(enc1.DeProcess(res_enc1));
    }
}
