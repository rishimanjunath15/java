


class Calculator{
    public int add(int n1,int n2){
        int result = n1 + n2;
        return result;
    }
}


public class Hello {

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result = calc.add(2,3);
        System.out.println(result);
    }
}




