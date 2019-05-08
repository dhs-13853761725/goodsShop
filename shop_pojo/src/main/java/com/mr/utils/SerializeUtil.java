package com.mr.utils;

import java.io.*;

/**
 * Created by xu on 2019/2/21.
 */
public class SerializeUtil {

    public static byte[] serialize(Object obj) {


        ObjectOutputStream oos = null;

        ByteArrayOutputStream baos = null;


        try {

            // 序列化

            baos = new ByteArrayOutputStream();

            oos = new ObjectOutputStream(baos);


            oos.writeObject(obj);

            byte[] byteArray = baos.toByteArray();

            return byteArray;


        } catch (IOException e) {

            e.printStackTrace();

        }

        return null;

    }



    /**
     35
     *
     36
     * 反序列化
     37
     *
     38
     * @param bytes
    39
     * @return
    40
     */

    public static Object unSerialize(byte[] bytes) {



        ByteArrayInputStream bais = null;



        try {

            // 反序列化为对象

            bais = new ByteArrayInputStream(bytes);

            ObjectInputStream ois = new ObjectInputStream(bais);

            return ois.readObject();



        } catch (Exception e) {

            e.printStackTrace();

        }

        return null;

    }

}
