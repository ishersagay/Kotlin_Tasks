import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption


fun main(args: Array<String>) {

    val sourcePath : String = "/home/linuxwithish/TestStart"
    val targetPath : String = "/home/linuxwithish/Test"

    val fSP = Paths.get(sourcePath)
    val fTP = Paths.get(targetPath)

    File(sourcePath).walk().forEach {
        when (it.extension) {
            "txt" -> Files.move(fSP,fTP,StandardCopyOption.REPLACE_EXISTING)
            "pdf" -> Files.move(fSP,fTP,StandardCopyOption.ATOMIC_MOVE)
            "jpeg" -> Files.move(fSP,fTP,StandardCopyOption.ATOMIC_MOVE)
            else ->{
                println("Not a text file")}
        }
    }
}
