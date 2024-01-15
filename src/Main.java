public class Main {

    public static void main(String[] args) {

        System.out.println("Testing Singleton Class");

        ClassSingleton classSingleton = ClassSingleton.getInstance();

        System.out.println(classSingleton.getInfo());

        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton.getInfo());
        System.out.println(classSingleton2.getInfo());

        System.out.println();
        System.out.println("Testing Singleton Enum");

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton.getInfo());

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton.getInfo());
        System.out.println(enumSingleton2.getInfo());

    }

}