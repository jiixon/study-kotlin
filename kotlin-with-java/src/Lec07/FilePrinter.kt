package Lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    //kotlin에서는 checked, unchecked exception -> 모두 unchecked exception
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    //kotlin에는 try-with-resources 구문 존재X => use 함수 사용
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}