import java.io.File

/**
 * This program demonstrates how to write content to a text file using Kotlin.
 */
fun main() {
    /**
     * The file is located in the root directory of the project.
     * If you want to write a file to a different location, you need to provide the full path to the file.
     */
    val fileName = "example.txt"
    val file = File(fileName)

    // Writing a single string to the file
    val content = "Hei, hallo my world!"
    file.writeText(content)

    // Appending a string to the file
    val additionalContent = "\nThis is just an additional line."
    file.appendText(additionalContent)

    println("Content has been written to the file.")

    // Reading the entire file as a single string
    val fileContent = file.readText()
    println("File content:\n$fileContent")

}

