# ResourceReader
Technical examination - to demonstrate OOPs concepts 

Steps to Execute the Application

Copy the ResourceReader-1.0-SNAPSHOT.jar file.

Navigate to the directory where the JAR file was copied and open a command prompt from that directory.

Run the following command to test an RSS resource:

java -jar ResourceReader-1.0-SNAPSHOT.jar -i https://tech.uzabase.com/feed -c replace(uzabase/testapp) -o rssoutput.txt
	-i → Specifies the input resource. It can be either an RSS feed or a file.

	-c → Specifies the converter details. Multiple converters can be passed, separated by commas.

	-o → Specifies the output resource. It can be either stdout or a file. The default is stdout.
	
more commands	

java -jar ResourceReader-1.0-SNAPSHOT.jar -i https://tech.uzabase.com/feed -c replace(uzabase/testapp)
java -jar ResourceReader-1.0-SNAPSHOT.jar -i test.txt -c cut -o stdout


Note:
When trimming the resource, the entire file content will be trimmed as a single string, not line by line.
