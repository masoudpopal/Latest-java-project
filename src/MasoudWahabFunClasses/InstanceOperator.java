package MasoudWahabFunClasses;

public class InstanceOperator {
    public static void main(String[] args) {
        InstanceOperator s=new InstanceOperator();
        System.out.println(s instanceof InstanceOperator);
    }
    class animal{

    }
    class monkey extends animal{
        public  void main(String []args) {
            monkey obj = new monkey();
            System.out.println(obj instanceof monkey);

        }
    }
}
