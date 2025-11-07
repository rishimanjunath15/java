

class AssignmentOperators{
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        // int result = a+b;
        // int result = b-a;
        //  int result = b/a;
        //  int result = b*a;
         int result = b%a;
        System.out.println(result);


        int x = 10;
        // x++;
        // x = x+1;
        // x+=1;
        ++x;
        System.out.println(x);


        int y =10;
        System.out.println(++y);  //first it will increment then fetch the value  -- pre-increment
        System.out.println(y++);  //first it will fetch the value then it will increment -- post-increment



    }
}