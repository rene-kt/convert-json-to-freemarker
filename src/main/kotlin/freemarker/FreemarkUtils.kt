package freemarker

import freemarker.template.Configuration
import freemarker.template.DefaultObjectWrapper
import freemarker.template.Template
import freemarker.template.TemplateException
import java.io.File
import java.io.IOException
import java.io.StringWriter


class FreemarkerUtils {
    private val cfg: Configuration = Configuration()
    private val FOLDER = "src/main/kotlin/templates"
    
    @Throws(TemplateException::class, IOException::class)
    fun parseTemplate(obj: Any, templateName: String?): String {

        //diretório onde estão templates
        cfg.setDirectoryForTemplateLoading(File(FOLDER))
        cfg.setObjectWrapper(DefaultObjectWrapper())

        //recupera o template
        val t: Template = cfg.getTemplate(templateName)
        val writer = StringWriter()
        /** Freemarker  */
        t.process(obj, writer)
        writer.flush()
        writer.close()
        return writer.toString()
    }
}