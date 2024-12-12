import java.io.File


fun main() {
    val rootDir = File("src/main/kotlin")
    // Show all files and directories in the root directory
    rootDir.walkTopDown().forEach {
        if (it.isFile) {
            println("File: ${it.name}")
        } else {
            println("Directory: ${it.name}")
        }
    }

    // only show files with the .kt extension and print their names with file size
    rootDir.walkTopDown().filter { it.extension == "kt" }.forEach {
        println("File: ${it.name} (${it.length()} bytes)")
    }
}