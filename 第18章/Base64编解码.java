package 第18章;

import java.util.Base64;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: jdk17
 * @className: Base64编解码
 * @createDate: 2024/1/21 23:57
 */
public class Base64编解码 {
    public static void main(String[] args) {
        String str = "vue.js从入门到实战";
        System.out.println("原始字符串是:" + str);
        Base64.Encoder basicEncoder = Base64.getEncoder();
        String basicEncodedStr  = basicEncoder.encodeToString(str.getBytes());
        System.out.println("采用基本类型编码的字符串是:" + basicEncodedStr);
        Base64.Decoder basicDecoder = Base64.getDecoder();
        byte[] basicDecodedByteData = basicDecoder.decode(basicEncodedStr.getBytes());
        System.out.println("采用基本类型解码的字符串是:" + new String(basicDecodedByteData));


        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        byte[] urlEncodedByteData = urlEncoder.encode(str.getBytes());
        System.out.println("采用url类型编码的字符串是:" + new String(urlEncodedByteData));
        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        byte[] urlDecodedByteData = urlDecoder.decode(urlEncodedByteData);
        System.out.println("采用url类型解码的字符串是:" + new String(urlDecodedByteData));

        Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
        byte[] mimeEncodedByteData = mimeEncoder.encode(str.getBytes());
        System.out.println("采用mime类型编码的字符串是:" + new String(mimeEncodedByteData));
        Base64.Decoder mimeDecoder = Base64.getMimeDecoder();
        byte[] mimeDecodedByteData = mimeDecoder.decode(mimeEncodedByteData);
        System.out.println("采用mime类型解码的字符串是:" + new String(mimeDecodedByteData));

    }
}
