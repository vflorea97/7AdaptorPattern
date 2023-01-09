package Facade.Electronics;

public class TheaterLights {

    private int dim;

    public void on(){
        System.out.println("The lights are on");
    }
    public void off(){
        System.out.println("The lights are off");
    }
    public void setDim(int dim){
        this.dim = dim;
        System.out.println("The power of lights is " + this.dim);
    }
}
