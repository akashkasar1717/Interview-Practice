package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonCall {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		System.out.println(Singleton2.INSTANCE.hashCode());
//		System.out.println(Singleton2.INSTANCE.hashCode());
        Singleton3 instanceOne = Singleton3.getInstance();
//        System.out.println(instanceOne.hashCode());
//        Singleton3 instanceTwo = Singleton3.getInstance();
//        System.out.println(instanceTwo.hashCode());
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instanceOne);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton3 instanceTwo = (Singleton3) in.readObject();
        System.out.println("instanceOne hashCode: " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode: " + instanceTwo.hashCode());

	}
}
