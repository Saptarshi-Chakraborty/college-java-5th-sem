// Write a java program that finds and deletes all the .class file in current directory and all its subdirectories iterativily.

import java.io.File;
import java.util.*;

public class Clean {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        deleteClassFiles(new java.io.File(currentDir));
    }

    private static void deleteClassFiles(java.io.File dir) {
        java.io.File[] files = dir.listFiles();
        if (files == null) return;

        for (java.io.File file : files) {
            if (file.isDirectory()) {
                deleteClassFiles(file);
            } else if (file.getName().endsWith(".class")) {
                if (file.delete()) {
                    System.out.println("Deleted: " + file.getAbsolutePath());
                }
            }
        }
    }
}
