package org.utils

class FileUtils {
    def listFilesInDirectory(dirPath) {
        def dir = new File(dirPath)
        dir.listFiles().each { file ->
            println "File: ${file.name}"
        }
    }
}
