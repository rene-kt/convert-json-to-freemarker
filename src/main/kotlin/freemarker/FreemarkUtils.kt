package freemarker

import freemarker.template.Configuration
import freemarker.template.DefaultObjectWrapper
import freemarker.template.Template
import freemarker.template.TemplateException
import models.Screen
import java.io.File
import java.io.IOException
import java.io.StringWriter


class FreemarkerUtils {

    private val cfg: Configuration = Configuration()
    private val folder = "src/main/kotlin/templates"


    /**
     * This method is responsible to generate the template from a [Screen] object
     *
     * @param obj the [Screen] object which it's created from the JSON
     * @param templateName the name of the .ftl file
     */
    @Throws(TemplateException::class, IOException::class)
    fun parseTemplate(obj: Screen, templateName: String?): String {

        cfg.setDirectoryForTemplateLoading(File(folder))
        cfg.objectWrapper = DefaultObjectWrapper()
        val t: Template = cfg.getTemplate(templateName)
        val writer = StringWriter()
        t.process(obj, writer)
        writer.flush()
        writer.close()
        return writer.toString()
    }
}