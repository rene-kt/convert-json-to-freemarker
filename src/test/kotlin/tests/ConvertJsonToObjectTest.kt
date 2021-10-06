package tests

import freemarker.GenerateTemplateFromObject
import jackson.ConvertJsonToObject
import junit.framework.TestCase
import models.Color
import models.Image
import models.Screen
import models.Size
import org.junit.Test

class ConvertJsonToObjectTest : TestCase() {

    @Test
    fun testConvertJsonToObject() {
        val convert = ConvertJsonToObject()
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
                    "startScreen": true
                    
                    }
        """.trimIndent()

        val screenExpected: Screen = Screen(1, "test", Size(500, 500), Color("#fff"), Image("test"), true, "Screen", null)
        val screen = convert.convert(json)
        assertEquals(screenExpected.toString(), screen.toString())

    }



}