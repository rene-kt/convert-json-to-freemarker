import freemarker.template.Configuration
import jackson.Convert

fun main(args: Array<String>) {
   val convert: Convert = Convert()
    convert.generateFtlFile()
}