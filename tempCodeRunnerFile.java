class superclass{
    void method(){
        sysrem.out.println("This is superclass method");
    }
}
class subclass extends superclass{
    @override
    void method(){
        System.out.println("This is subclass method");
        throw new arithmeticexception("exception in subclass");
    }
    public static void main(String[] args){
        subclass obj = new subclass();
        try{
            s.method();
        } catch(arithmeticexception e){
            system.out.println("Exception caught" + e.getmessage());
        }
    }
}