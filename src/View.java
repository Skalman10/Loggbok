import java.io.*;

public class View {
    public static void load() throws IOException, ClassNotFoundException {
        ObjectInputStream ins=new ObjectInputStream(new FileInputStream(new File("testSave")));
        LogEntry l = (LogEntry) ins.readObject();
        ins.close();
        System.out.println(l);

    }

    public static void save() throws IOException {
        LogEntry l = new LogEntry("test","Anders");
        ObjectOutputStream outs=new ObjectOutputStream(new FileOutputStream(new File("testSave")));
        outs.writeObject(l);
        outs.flush();
        outs.close();
    }

}
