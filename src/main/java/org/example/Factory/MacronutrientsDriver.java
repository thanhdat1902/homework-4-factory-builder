package org.example.Factory;

public class MacronutrientsDriver {
    public static void main(String[] args) {
        Customer dat = new Customer("Thanh Dat",DietPlan.NO_RESTRICTION);
        Customer boi = new Customer("Boi Boi",DietPlan.NO_RESTRICTION);
        Customer huy = new Customer("Quang Huy",DietPlan.PALEO);
        Customer cuong = new Customer("Ngoc Cuong",DietPlan.PALEO);
        Customer quan = new Customer("Minh Quan",DietPlan.VEGAN);
        Customer tai = new Customer("Cong Tai",DietPlan.NUT_ALLERGY);

        System.out.println("-------------------------- Customer 1 ----------------------------");
        dat.createMeal();
        dat.showMeal();

        System.out.println("-------------------------- Customer 2 ----------------------------");
        boi.createMeal();
        boi.showMeal();

        System.out.println("-------------------------- Customer 3 ----------------------------");
        huy.createMeal();
        huy.showMeal();

        System.out.println("-------------------------- Customer 4 ----------------------------");
        cuong.createMeal();
        cuong.showMeal();

        System.out.println("-------------------------- Customer 5 ----------------------------");
        quan.createMeal();
        quan.showMeal();

        System.out.println("-------------------------- Customer 6 ----------------------------");
        tai.createMeal();
        tai.showMeal();


    }
}
