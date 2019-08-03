import re

class FileNameExtractor:
 def extract_file_name(file_name):
   return re.search('^\d+_(.*)\..*$', file_name).group(1)

//Gonna redo with Java