public class IgnoraPar{

    public static void main(String... a){

        for(int x = 0; x<10; x++){
            if(x % 2 == 0){
                continue;
            }

            System.out.print("\t"+x);
        }

    }
}
