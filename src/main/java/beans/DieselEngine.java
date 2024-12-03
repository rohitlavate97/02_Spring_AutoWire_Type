package beans;

public class DieselEngine implements IEngine{
    public DieselEngine(){
        System.out.println("Diesel Engine : Constructor");
    }
    @Override
    public int start() {
        System.out.println("Diesel Engine started");
        return 1;
    }
}
