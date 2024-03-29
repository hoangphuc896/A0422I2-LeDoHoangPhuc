package castudymodule2.ultils;

import java.io.*;
import java.util.Collection;

public class ReadAndWrite {
    public static void write(Collection collection, String filler) {
        File file = new File(filler);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object read(String filler) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Object object;
        try {
            fileInputStream = new FileInputStream(filler);
            objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            return object;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Mời bạn thêm danh sách");
        }
        return null;
    }
}
