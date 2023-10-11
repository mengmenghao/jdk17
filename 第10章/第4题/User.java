package 第10章.第4题;

import java.awt.image.ImageConsumer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: User
 * @createDate: 2023/10/11 23:07
 */
public class User implements Cloneable, Serializable {

    private String[] interests;

    public String[] getInterests() {
        return interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "interests=" + Arrays.toString(interests) +
                '}';
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆
        //return super.clone();

        // 序列化深克隆
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);
            User cloned = (User) in.readObject();
            in.close();
            return cloned;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
