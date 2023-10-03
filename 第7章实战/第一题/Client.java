package 第7章实战.第一题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Client
 * @createDate: 2023/10/3 23:28
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("azx");
        Person.PersonEmotion personEmotion = person.new PersonEmotion();
        person.setEmotion(personEmotion);
        person.happy();
        System.out.println(personEmotion.getHappy());

        person.sad();
        System.out.println(personEmotion.getHappy());
    }
}
