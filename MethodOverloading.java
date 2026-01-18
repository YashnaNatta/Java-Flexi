class MethodOverloading {
    void add(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    void add(double a,double b){
        System.out.println("Sum: "+(a+b));

    }
    public static void main(String[] arsg){
        MethodOverloading obj = new MethodOverloading();
    obj.add(10,20);
    obj.add(5.5,4.5);
    }
}
