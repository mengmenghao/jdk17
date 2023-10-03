package 第7章实战.第一题;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Person
 * @createDate: 2023/10/3 23:23
 */
public class Person {

    private String name;
    private PersonEmotion emotion;

    public Person(String name) {
        this.name = name;
    }

    public void happy(){
        System.out.println(name + "happy");
        emotion.happy = true;
    }

    public void sad(){
        System.out.println(name + "sad");
        emotion.happy = false;
    }

    public void setEmotion(PersonEmotion personEmotion){
        this.emotion = personEmotion;
    }

    class PersonEmotion{
        private boolean happy;

        public boolean getHappy(){
            return happy;
        }
    }
}
