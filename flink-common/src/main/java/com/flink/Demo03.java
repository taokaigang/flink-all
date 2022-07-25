package com.flink;

import java.io.*;

public class Demo03 {

    public static void main(String[] args) {
        String filePath = "/Users/kgt/code/github/flink-all/flink-common/src/main/resources/reader.txt";

        String txtStr = reader(filePath);
        System.out.println(txtStr);
//        if (txtStr != null) {
//            process(txtStr);
//        } else {
//            System.out.println("Read the content is empty!");
//        }
        System.out.println("--- end ---");

    }

    public static String reader(String filePath) {

        try {
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
//                System.out.println(lineTxt);
                StringBuffer sb = new StringBuffer();
                while((lineTxt = bufferedReader.readLine()) != null){
                    sb.append(lineTxt)
                      .append("\n");
//                    System.out.println(lineTxt);
                }
                  sb.toString();
            }
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            System.out.println("Cannot find the file specified!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file content!");
            e.printStackTrace();
        }
        return null;
    }
}
