import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {

    val sourcePath : String = "/home/linuxwithish/Downloads"
    val targetDPath : String = "/home/linuxwithish/Documents"
    val targetPicPath : String = "/home/linuxwithish/Pictures"


    File(sourcePath).walk().forEach {
        val wtf = it.name
        var currentSFile = it.toPath()
        when (it.extension) {
            "txt" -> Files.move(currentSFile, Paths.get("$targetDPath/$wtf"))
            "pdf" -> Files.move(currentSFile, Paths.get("$targetDPath/$wtf"))
            "docx" -> Files.move(currentSFile, Paths.get("$targetDPath/$wtf"))
            "jpeg" -> Files.move(currentSFile, Paths.get("$targetPicPath/$wtf"))
            "jpg" -> Files.move(currentSFile, Paths.get("$targetPicPath/$wtf"))
            else ->{
                println("Not a text file")}
        }
    }


}
