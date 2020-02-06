package select;

import java.io.*;

public class SelectMachine {
    public static void main(String[] args) {
        try {
            DataOutputStream out =new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("b.dat")));
            int i=0xcafebabe;
            out.writeInt(i);
            out.close();
           DataInputStream in =new DataInputStream(
                   new BufferedInputStream(new
                           FileInputStream("b.dat"))
           );
           int j=in.readInt();
            System.out.println(j);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
