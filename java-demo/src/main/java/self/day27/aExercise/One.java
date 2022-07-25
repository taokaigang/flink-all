package self.day27.aExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class One {
    /**
     *      去除集合中id重复的数据，只保留重复id的第一个数据
     *      计算这些用户的平均等级、最高等级、最低等级
     *      将集合中的数据按照等级降序排序
     *      查询集合中等级为[7,15]范围内的第[4,8]个，并将结果按照id升序
     *      将这个集合序列化到本地，并反序列化遍历
     * @param args
     */
    public static void main(String[] args) {
        //oneCopyFile();
        List<User> list = getDataSource();
        System.out.println(list);
        //去除集合中id重复的数据，只保留重复id的第一个数据
        list.stream().distinct().forEach(System.out::println);

        //计算这些用户的平均等级、最高等级、最低等级
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(User::getLevel).summaryStatistics();
        System.out.println("最高等级："+intSummaryStatistics.getMax());
        System.out.println("最低等级："+intSummaryStatistics.getMin());
        System.out.println("平均等级："+intSummaryStatistics.getAverage());

        //将集合中的数据按照等级降序排序
        list.stream().sorted((u1,u2)->u2.getLevel()-u1.getLevel());

        //查询集合中等级为[7,15]范围内的第[4,8]个，并将结果按照id升序
        list.stream().filter(user -> user.getLevel()>=7 && user.getLevel()<=15)
                .limit(8)
                .skip(3)
                .sorted((u1,u2)->u1.getId()-u2.getId())
                .forEach(System.out::println);

        //将这个集合序列化到本地，并反序列化遍历
        //save(list);
        //load();

    }
    private static void load(){
        try(ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("file\\day27\\source-save"))){
            Object object=inputStream.readObject();
            if (object instanceof  List){
                List<User> list=(List<User>) object;
                list.forEach(System.out::println);
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void save(List<User> list){
        try(ObjectOutputStream OutputStream=new ObjectOutputStream(new FileOutputStream("file\\day27\\source-save"))){
            OutputStream.writeObject(list);
            OutputStream.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    private static List<User> getDataSource(){
        try(Scanner scanner=new Scanner(new File("file\\day27\\source-副本"))){
            List<User> list=new ArrayList<>();
            while(scanner.hasNextLine()){
                list.add(new User(scanner.nextLine()));
            }
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    private static void oneCopyFile(){
        //1.创建目标文件夹
        String dirPath = "file\\day27\\";
        new File(dirPath).mkdir();

        //2.拷贝
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\tao2720\\Desktop\\source.txt")));
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dirPath+"source-副本")))){
            String line="";
            while((line=reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
