package freemarker

import jackson.ConvertJsonToObject
import java.io.File

class GenerateTemplateFromObject {
    private val freemarker = FreemarkerUtils()
    private val convert = ConvertJsonToObject()

    fun generateFtlFile() {
        val json = """
            {
                "type": "Screen",
                "id": 1,
                "name": "buttons",
                "size": {
                    "width": 399,
                    "height": 342
                },
                "backgroundColor": {
                    "hex": "#fafafa"
                },
                "startScreen": true,
                "backgroundImage": {
                    "name": "Grupo_46"
                },
                "components": [
                    {
                        "type": "TextView",
                        "id": 10,
                        "name": "Button10",
                        "location": {
                            "x": 48,
                            "y": 102
                        },
                        "size": {
                            "width": 328,
                            "height": 44
                        },
                        "label": "Circle Button",
                        "color": {
                            "hex": "#050675"
                        },
                        "font": {
                            "family": "Family",
                            "size": 54.0
                        }
                    }
                    ]
                    }
        """.trimIndent()
        val screen = convert.convert(json)
        val stringHtml: String = freemarker.parseTemplate(screen, "screen.ftl")
        File("src/main/kotlin/templates/output.html").writeText(stringHtml)
    }
}