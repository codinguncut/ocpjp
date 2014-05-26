import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Paths01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("../09_NIO/../08_IO/Paths01.java"); 
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        System.out.println("normalize " + path.normalize());
        System.out.println("absolute " + path.toAbsolutePath());
        System.out.println("absolute norm" + path.toAbsolutePath().normalize());
        System.out.println("real " + path.toRealPath());

        Path other = Paths.get("..");
        Path syll  = other.resolve("Syllabus.md");
        System.out.println("resolve " + syll); 
        System.out.println("rel " + path.relativize(syll));
        
    }
}
