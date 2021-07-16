package ru.postlife.java3.reflectionAPI;

public class Developer {
    @Test
    public void info() {
        System.out.println(this);
    }

    @BeforeSuite
    @Test(priority = 11)
    public void getOrder() {
        System.out.println("Разработчик получил заказ на разработку приложения");
    }

    @Test(priority = 9)
    public void createArchitectureApp() {
        System.out.println("Разработчик продумывает архитектуру приложения");
    }

    @Test(priority = 7)
    public void developFirstMethod() {
        for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
            System.out.println("Разработчик создает первый модуль");
        }
    }

    @Test(priority = 7)
    public void developSecondMethod() {
        for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
            System.out.println("Разработчик создает второй модуль");
        }
    }

    @Test
    public void testApp() {
        for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
            System.out.println("Разработчик тестирует приложение");
        }
    }

    @Test(priority = 3)
    public void fixApp() {
        for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
            System.out.println("Разработчик исправляет баги в приложении");
        }
    }

    @Test(priority = 1)
    public void deployApp() {
        System.out.println("Разработчик делает деплой приложения и передает его заказчику");
    }

    @AfterSuite
    @Test(priority = 0)
    public void getReward() {
        System.out.println("Разработчик получил $$$награду$$$ за свои старания!");
    }
}
