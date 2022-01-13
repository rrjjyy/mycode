package r20211109.tt3;

import java.util.Scanner;

abstract class Pizza {
    String name;

    //披萨的准备工作
    public abstract void prepare();

    //披萨的烘烤工作
    public void bake() {
        System.out.println(name + " bake");
    }

    //披萨的分割工作
    public void cut() {
        System.out.println(name + " cut");
    }

    //披萨的包装工作
    public void box() {
        System.out.println(name + " box");
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
有很多不同种类的披萨,例如
CheesePizza，GreekPizza
 */
class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza");
    }
}

class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备GreekPizza");
    }
}


class OrderPizza {
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;//订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("GreekPizza")) {
//                pizza = new GreekPizza();
//                pizza.setName("GreekPizza");
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            } else if (orderType.equals("CheesePizza")) {
//                pizza = new CheesePizza();
//                pizza.setName("CheesePizza");
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            } else {
//                System.out.println("输入有误！！");
//                System.out.println("请重新输入");
//
//            }
//
//        } while (true);
//    }

    //定义一个简单工厂对象

    // Pizza pizza =null;

    public OrderPizza() {

//            new SimpleFactory().CreatPizza(getType());


    }




}

//创建一个简单工厂
//class SimpleFactory{
//    public Pizza CreatPizza(String orderType){
//        Pizza pizza =null;
//        System.out.println("使用简单工厂模式");
//        if (orderType.equals("GreekPizza")) {
//            pizza = new GreekPizza();
//            pizza.setName("GreekPizza");
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }
//        if (orderType.equals("CheesePizza")) {
//            pizza = new CheesePizza();
//            pizza.setName("CheesePizza");
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }
//        return pizza;
//    }
//}

abstract class FactoryMethod{
    Pizza pizza= null;
    //定义一个抽象方法，让各个子类实现自己的方法
    public  abstract Pizza creatPizza(String orderType);

    //

    public String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入披萨种类：");
        return scanner.next();
    }
    public FactoryMethod() {
         pizza = creatPizza(getType());
    }
}

class order1 extends FactoryMethod{

    @Override
    public Pizza creatPizza(String orderType) {
        if (orderType.equals("GreekPizza")) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        if (orderType.equals("CheesePizza")) {
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}




public class PizzaStore {
    public static void main(String[] args) {
        new order1();
    }
}
