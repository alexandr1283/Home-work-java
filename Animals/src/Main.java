public class Main {
    public static void main(String[] args) {

        Dogs dog = new Dogs();
        dog.voices();
        Cats cat = new Cats();
        cat.voice = "Murrr";
        cat.voices();
        Birds vorobey = new Birds();
        vorobey.name = "Chizhik";
        vorobey.voice = "Chik-chirick";
        vorobey.voices();
        System.out.println("What are this?");
    }
}
abstract class Animal{
    String name;
    String voice;
    int age;
    void voices() {
        System.out.println(name + " is " + age + ". Hi can " + voice + ".");
    }
}
class Dogs extends Animal{
    // create Constructor
    Dogs()
    {
        name = "Bobik";
        age = 5;
        voice = "Gav";
    }
}
class Cats extends Animal{
    // create Constructor
    Cats()
    {
        name = "Leo";
        age = 4;
        voice = "Miau";
    }
}
class Birds extends Animal{
    // create Constructor
    Birds()
    {
        name = "Klara";
        age = 7;
        voice = "Kar";
    }
}
