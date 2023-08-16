package fileHandling;
import  java.io.IOException;
import java.io.File;

public class FileEx
{
    public static void main(String[] args) throws IOException {
        //File newFile1= new File("C:/Users/Neha G/IdeaProjects/JavaProject/src/fileHandlingListOfCourses1.txt");//r
        File newFile= new File("ListOfCourses.txt");//relative
        System.out.println("Absolute path"+newFile.getAbsolutePath());
        System.out.println("Relative path "+newFile.getCanonicalPath());
		System.out.println("Absolute Path "+newFile.getAbsolutePath());
		System.out.println("RW :"+newFile.canRead());
		System.out.println("Read Write :"+newFile.canWrite());
		System.out.println("File Name :"+newFile.getName());
		System.out.println("Size of the file :"+newFile.length());
		System.out.println(newFile.getParent());

        File newFileF2 = new File("D:/File/oops/");//relative
        String[] list = newFileF2.list();
        System.out.println("List of files :"+list.length);
        for(int i =0;i<list.length;i++) {
            System.out.println(list[i]);
        }
        if(newFile.createNewFile()){
            System.out.println("File Created");
        }else {
            System.out.println("file already exists");
        }
    }
}
