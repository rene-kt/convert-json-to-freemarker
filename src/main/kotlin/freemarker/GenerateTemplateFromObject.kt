package freemarker

import jackson.ConvertJsonToObject
import models.Screen
import java.io.File

class GenerateTemplateFromObject {
    private val freemarker = FreemarkerUtils()
    private val convert = ConvertJsonToObject()
    var json = """
           {
    "message": "OK",
    "application": {
        "screens": [
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
                        "type": "Button",
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
                            "size": 14.0
                        }
                    },
                    {
                        "type": "Button",
                        "id": 11,
                        "name": "Button11",
                        "location": {
                            "x": 48,
                            "y": 187
                        },
                        "size": {
                            "width": 328,
                            "height": 44
                        },
                        "label": "Lages lida",
                        "color": {
                            "hex": "#fcb863"
                        },
                        "font": {
                            "family": "Family",
                            "size": 13.0
                        }
                    },
                    {
                        "type": "Button",
                        "id": 12,
                        "name": "Button12",
                        "location": {
                            "x": 44,
                            "y": 15
                        },
                        "size": {
                            "width": 334,
                            "height": 44
                        },
                        "label": "Pe Tela)",
                        "color": {
                            "hex": "#89b1d2"
                        },
                        "font": {
                            "family": "Family",
                            "size": 12.0
                        }
                    },
                    {
                        "type": "Button",
                        "id": 13,
                        "name": "Button13",
                        "location": {
                            "x": 48,
                            "y": 272
                        },
                        "size": {
                            "width": 328,
                            "height": 45
                        },
                        "label": "",
                        "color": {
                            "hex": "#ebedf2"
                        },
                        "font": {
                            "family": "Family",
                            "size": 45.0
                        }
                    }
                ],
                "location": {
                    "x": 0,
                    "y": 0
                }
            }
        ]
    }
}
        """.trimIndent()

    fun generateFtlFileFromJson(): String {

        val screen = convert.convert(this.json)
        val stringHtml: String = freemarker.parseTemplate(screen, "screen.ftl")
        File("src/main/kotlin/templates/output.html").writeText(stringHtml)
        return stringHtml
    }

    fun generateFtlFileFromObject(screen: Screen): String{
        val stringHtml: String = freemarker.parseTemplate(screen, "screen.ftl")
        File("src/main/kotlin/templates/output.html").writeText(stringHtml)
        return stringHtml
    }
}