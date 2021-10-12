package tests

import freemarker.GenerateTemplateFromObject
import junit.framework.TestCase
import models.Color
import models.Image
import models.Screen
import models.Size
import org.junit.Test

class GenerateTemplateFromObjectTest : TestCase() {
    @Test
    fun testGenerateTemplateFromJson(){
        val generate = GenerateTemplateFromObject()
        val json = """
            {
                    "type": "Screen",
                    "id": 1,
                    "name": "test",
                    "size": {
                        "width": 500,
                        "height": 500
                    },
                    "backgroundColor": {
                        "hex": "#fff"
                    },
                    "backgroundImage": {
                        "name" : "test"
                    },
                    "startScreen": true,
                    "components" : [
                        { 
                        "type" : "Button",
                        "label" : "Test"
                        }
                    ]
                    }
        """.trimIndent()
        val htmlExpected = "<html>\n" +
                "<head>\n" +
                "    <title>test</title>\n" +
                "    <style>*{position:absolute}</style>\n" +
                "    <!-- CSS only -->\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n" +
                "    <!-- JavaScript Bundle with Popper -->\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n" +
                "\n" +
                "</head>\n" +
                "<body style=\"background: #fff\">\n" +
                "    <button class=\"btn\" style=\"width: 1; height: 1; left:0; top:0; background: #fff; font-size: 12\">Test</button>\n" +
                "</body>\n" +
                "</html>"
        generate.json = json
        assertEquals(htmlExpected, generate.generateFtlFileFromJson())
    }


    @Test
    fun testGenerateTemplateFromObjectWithoutJson(){
        val generate = GenerateTemplateFromObject()
        val screen: Screen = Screen(1, "test", Size(500, 500), Color("#fff"), true, "Screen", null, null, null)
        val htmlExpected = "<html>\n" +
                "<head>\n" +
                "    <title>test</title>\n" +
                "    <style>*{position:absolute}</style>\n" +
                "    <!-- CSS only -->\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n" +
                "    <!-- JavaScript Bundle with Popper -->\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n" +
                "\n" +
                "</head>\n" +
                "<body style=\"background: #fff\">\n" +
                "</body>\n" +
                "</html>"
        var htmlString = generate.generateFtlFileFromObject(screen)
        assertEquals(htmlExpected,  htmlString)
    }
}