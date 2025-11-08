

class LogicalOperators{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 43;
        int d = 15;

        // boolean result = a>b && c<d;
        //  boolean result = a<b && c>d && b>d;

         boolean result = a<b || c<d;
        System.out.println(result);

        boolean res = a>b || c<d || c!=d;
        System.out.println(!res);
    }
}