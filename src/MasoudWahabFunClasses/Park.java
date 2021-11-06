package MasoudWahabFunClasses;

class Park {

    String name;
    int age;
    public void print(){
        System.out.println("Name"+name+"  Age"+age);
    }

}
class Test{
    public static void main(String[] args) {
        Park park = new Park();
        park.name = "Masoud";
        park.age = 34;
        park.print();
    }
}



