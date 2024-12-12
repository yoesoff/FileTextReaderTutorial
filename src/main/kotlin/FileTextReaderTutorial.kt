import java.io.File

/**
 * This program demonstrates how to read the content of a text file using Kotlin.
 */
fun main() {
    /**
     * The file is located in the root directory of the project.
     * If you want to read a file from a different location, you need to provide the full path to the file.
     */
    val fileName = "example.txt"
    val file = File(fileName)

    // Reading the entire file as a single string
    val fileContent = file.readText()
    println("File content:\n$fileContent")

    // Reading the file line by line
    val lines = file.readLines()

    // Printing the lines
    println("File lines:")
    lines.forEach { println(it) }
}

