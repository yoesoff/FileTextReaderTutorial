import java.io.File
import java.io.FileInputStream
import java.io.IOException

fun main() {
    val fileName = "testfile.bin"
    val file = File(fileName)

    try {
        FileInputStream(file).use { inputStream ->
            val fileContent = inputStream.readBytes()
            println("File content (in bytes): ${fileContent.joinToString(", ")}")
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}