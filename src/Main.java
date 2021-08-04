public class Main {
    public static void main(String[] args) {
    Body myBody= new Body();
        myBody.name= "Nargiza";
        myBody.weight=60;
        myBody.age=30;
        Body body2 = new Body();
        Body body3 = new Body();
        Body body4 = new Body();
        Body body5 = new Body();
        body2.name="Malika";
        body2.weight=55;
        body2.age= 20;
        body3.name="Nakim";
        body3.weight=70;
        body3.age=41;
        body4.name="Make";
        body4.weight=52;
        body4.age=18;
        body5.name="Kamil";
        body5.weight=90;
        body5.age=50;
        double sum = myBody.age+ body2.age+ body3.age+ body4.age+ body5.age;
        double result = sum/2;
        System.out.println( "Сред ариф age" + result);
    }
}
