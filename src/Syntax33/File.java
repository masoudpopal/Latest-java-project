package Syntax33;

public  abstract class File {
    public void Edit(){
        System.out.println(" I am editing");
    }
    public void Close(){
        System.out.println(" I am closing");
    }
    public abstract void Open();
}
