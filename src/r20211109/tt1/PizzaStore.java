package r20211109.tt1;

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
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("GreekPizza")) {
                pizza = new GreekPizza();
                pizza.setName("GreekPizza");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else if (orderType.equals("CheesePizza")) {
                pizza = new CheesePizza();
                pizza.setName("CheesePizza");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("输入有误！！");
                System.out.println("请重新输入");

            }

        } while (true);
    }

    public String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入披萨种类：");
        return scanner.next();
    }

}

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
    }
}