package r20211110;
//coffee的父类
class Coffee{
    //定义一个制作coffee的方法
    public void CoffeeStyle(){
    }
}

//牛奶coffee
class MikeCoffee extends Coffee{
    @Override
    public void CoffeeStyle() {
        System.out.println("制作牛奶coffee");
    }
}

//黑咖啡
class BlackCoffee extends Coffee{
    @Override
    public void CoffeeStyle() {
        System.out.println("制作blackcoffee");
    }
}
//拿铁
class latteCoffee extends Coffee{
    @Override
    public void CoffeeStyle() {
        System.out.println("制作latteCoffe");
    }
}

//定义一个抽象工厂
abstract class FactoryMethod{
    //定义一个制作coffee的抽象方法
    
    abstract Coffee makeCoffee();
}

//实现抽象工厂的牛奶coffee
class MilkCoffeeFactory extends FactoryMethod{

   @Override
    Coffee makeCoffee() {
        return new MikeCoffee();
    }
}
//实现抽象工厂的blackcoffee
class blackcoffeeFactory extends FactoryMethod{

    public Coffee makeCoffee(){
        return new BlackCoffee();
    }
}

//

//拿铁工厂
class lattecoffeeFactory extends FactoryMethod{

    @Override
    Coffee makeCoffee() {
        return new latteCoffee();
    }
}

//客户端
public class Client {
    public static void main(String[] args) {
        //制作一杯黑coffee
        blackcoffeeFactory blackcoffeeFactory = new blackcoffeeFactory();
        Coffee coffee = blackcoffeeFactory.makeCoffee();
        coffee.CoffeeStyle();


        //制作一被牛奶coffee
        MilkCoffeeFactory milkCoffeeFactory = new MilkCoffeeFactory();
        Coffee coffee1 = milkCoffeeFactory.makeCoffee();
        coffee1.CoffeeStyle();

        new blackcoffeeFactory().makeCoffee().CoffeeStyle();
        //拿铁latte
        new lattecoffeeFactory().makeCoffee().CoffeeStyle();


    }
}
