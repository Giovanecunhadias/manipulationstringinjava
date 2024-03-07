public class estruturaderepeticao {
    public static void main(String[] args) {
        String a = "Giovane";
        
       
        /*for(int i = 0; a.length(); i--){

        }*/
        String fsi="";
        for(int i = a.length(); i>0; i--){
            fsi = fsi+ a.substring(i-1, i);
        }
        System.out.println(fsi);
        StringBuilder stringBuilder = new StringBuilder(a);
        System.out.println(stringBuilder.reverse().toString());
    }
}
