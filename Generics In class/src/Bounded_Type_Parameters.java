public class Bounded_Type_Parameters {

    public static <T extends  Number> void getsum(T num1, T num2){
        if(num1.getClass().getName().contains("Integer")){
            int sum= num1.intValue()+num2.intValue();
            System.out.println(sum);
        }else{
            System.out.println("type is not Integer");
        }
    }
    public static void main(String[] args) {

        Bounded_Type_Parameters.getsum(20,30);

    }
}
