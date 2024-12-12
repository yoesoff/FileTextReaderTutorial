import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class FileBinaryWriterTutorial {
    fun writeBinaryFile(fileName: String, data: ByteArray) {
        val file = File(fileName)
        try {
            FileOutputStream(file).use { outputStream ->
                outputStream.write(data)
                println("Data has been written to the file.")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}

fun main() {
    val fileName = "testfile.bin"
    val data = byteArrayOf(0x01, 0x02, 0x03, 0x04, 0x05) // Example binary data

    val writer = FileBinaryWriterTutorial()
    writer.writeBinaryFile(fileName, data)
}