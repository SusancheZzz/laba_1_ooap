package encryption;
import java.util.Scanner;
public class Encryption {
    public String input_str = "";
    //public String result_str = "";
    EncStrategy encStrategy;

    public String EncProcess(String str){
        return this.encStrategy.EncProcess(str);
    }
    public Encryption(EncStrategy encStrategy){
        this.encStrategy = encStrategy;
    }

    public void setEncStrategy(EncStrategy encStrategy) {
        this.encStrategy = encStrategy;
    }

    public String DeProcess(String str){
        return this.encStrategy.DeProcess(str);
    }

    public void setData(){

        if (this.input_str != "")
            input_str = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");

        this.input_str = scanner.nextLine();

        scanner.close();
    }
    public void setData(String INPUT_STR){

        if (this.input_str != "")
            input_str = "";

        this.input_str = INPUT_STR;

    }
    public void getInputData() {
        System.out.println("Введённая строка: " + this.input_str);
    }
    //public void getOutputData() {
       // System.out.println("Введённая строка: " + this.result_str);
    //}

}
