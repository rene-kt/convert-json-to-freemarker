package jackson

import com.fasterxml.jackson.module.kotlin.*
import freemarker.FreemarkerUtils
import models.Screen

class Convert {
    private val mapper = jacksonObjectMapper()
    private val freemark = FreemarkerUtils()
    fun teste(){
        val json = """{"id": 1,"name":"teste","startScreen":true, "size": {
                    "width": 448,
                    "height": 838
                }, "components" : [ { "name" : "teste", "id" : 1, "type" : "Button"} ]}"""

        var screen: Screen = mapper.readValue<Screen>(json)

        val s: String = freemark.parseTemplate(screen, "screen.ftl")
        println(s)
    }
}