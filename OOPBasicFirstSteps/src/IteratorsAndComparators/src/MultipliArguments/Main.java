package MultipliArguments;


public class Main {
    public static void main(String[] args) {
        print();
       // print("Stamat");
      //  print("Stamat","pesho");
    }
    public static void print(String...args){
        if(args.length == 0){
            throw new IllegalArgumentException("No Arguments here");
        }else{
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
