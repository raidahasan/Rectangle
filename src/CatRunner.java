public class CatRunner {
    public static void main (String[] args){

        Cat cat1 = new Cat ("Ava", 5, 10);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat ("Stephanie", 7, 9);
        cat2.printCatInfo();
        cat2.introduce();
    }


}
