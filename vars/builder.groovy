
def test(){
  echo "HELLO WORLD"
}

// Iterate over each file in the directory matching the regex pattern
def findPattern(d){
  def dir = new File(d)
  dir.eachFile { file ->
      println "File: ${file.name}"
  }
  
  // def pattern = ~/.*\.txt/
  // dir.eachFileMatch(FileType.FILES, pattern) { file ->
  //     println "Text File: ${file.name}"
}

