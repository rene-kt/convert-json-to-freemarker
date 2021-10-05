package jackson

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.*
import freemarker.FreemarkerUtils
import models.Screen
import java.io.File

class Convert {
    private val mapper = jacksonObjectMapper()
    private val freemarker = FreemarkerUtils()
    private val ignoreJson = """{
    "message": "OK",
    "application": {
        "screens": ["""

    fun generateFtlFile() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        val json = """ 
            
    {
        "message": "OK",
        "application": {
            "screens": [
                {
                    "type": "Screen",
                    "id": 1,
                    "name": "photo_2021_09_10_15_33_49",
                    "size": {
                        "width": 1004,
                        "height": 504
                    },
                    "backgroundColor": {
                        "hex": "#ffffff"
                    },
                    "startScreen": true,
                    "backgroundImage": {
                        "name": "Grupo_46_2x"
                    },
                    "components": [
                        {
                            "type": "Button",
                            "id": 10,
                            "name": "Button10",
                            "location": {
                                "x": 517,
                                "y": 406
                            },
                            "size": {
                                "width": 427,
                                "height": 67
                            },
                            "label": "oe\n(avrg Priel",
                            "color": {
                                "hex": "#d45037"
                            },
                            "font": {
                                "family": "Family",
                                "size": 33.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 11,
                            "name": "Button11",
                            "location": {
                                "x": 515,
                                "y": 246
                            },
                            "size": {
                                "width": 432,
                                "height": 68
                            },
                            "label": "",
                            "color": {
                                "hex": "#fdcb0c"
                            },
                            "font": {
                                "family": "Family",
                                "size": 68.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 12,
                            "name": "Button12",
                            "location": {
                                "x": 516,
                                "y": 326
                            },
                            "size": {
                                "width": 430,
                                "height": 67
                            },
                            "label": "Straighten",
                            "color": {
                                "hex": "#9a8479"
                            },
                            "font": {
                                "family": "Family",
                                "size": 25.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 13,
                            "name": "Button13",
                            "location": {
                                "x": 55,
                                "y": 166
                            },
                            "size": {
                                "width": 433,
                                "height": 68
                            },
                            "label": "",
                            "color": {
                                "hex": "#7dd1f6"
                            },
                            "font": {
                                "family": "Family",
                                "size": 68.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 14,
                            "name": "Button14",
                            "location": {
                                "x": 513,
                                "y": 166
                            },
                            "size": {
                                "width": 435,
                                "height": 68
                            },
                            "label": "",
                            "color": {
                                "hex": "#e99c1c"
                            },
                            "font": {
                                "family": "Family",
                                "size": 68.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 15,
                            "name": "Button15",
                            "location": {
                                "x": 55,
                                "y": 406
                            },
                            "size": {
                                "width": 435,
                                "height": 67
                            },
                            "label": "| Repair",
                            "color": {
                                "hex": "#7650b5"
                            },
                            "font": {
                                "family": "Family",
                                "size": 32.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 16,
                            "name": "Button16",
                            "location": {
                                "x": 58,
                                "y": 326
                            },
                            "size": {
                                "width": 431,
                                "height": 67
                            },
                            "label": "Volume",
                            "color": {
                                "hex": "#8cbd48"
                            },
                            "font": {
                                "family": "Family",
                                "size": 19.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 17,
                            "name": "Button17",
                            "location": {
                                "x": 52,
                                "y": 86
                            },
                            "size": {
                                "width": 438,
                                "height": 67
                            },
                            "label": "| Color Protection",
                            "color": {
                                "hex": "#5f7783"
                            },
                            "font": {
                                "family": "Family",
                                "size": 19.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 18,
                            "name": "Button18",
                            "location": {
                                "x": 513,
                                "y": 85
                            },
                            "size": {
                                "width": 429,
                                "height": 68
                            },
                            "label": "Sigciarseatia)",
                            "color": {
                                "hex": "#9a9a9a"
                            },
                            "font": {
                                "family": "Family",
                                "size": 25.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 19,
                            "name": "Button19",
                            "location": {
                                "x": 56,
                                "y": 246
                            },
                            "size": {
                                "width": 434,
                                "height": 67
                            },
                            "label": "| Extra Hydratation\nJ",
                            "color": {
                                "hex": "#0eaebe"
                            },
                            "font": {
                                "family": "Family",
                                "size": 19.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 110,
                            "name": "Button110",
                            "location": {
                                "x": 715,
                                "y": 1
                            },
                            "size": {
                                "width": 235,
                                "height": 54
                            },
                            "label": "",
                            "color": {
                                "hex": "#e8e8e8"
                            },
                            "font": {
                                "family": "Family",
                                "size": 54.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 111,
                            "name": "Button111",
                            "location": {
                                "x": 520,
                                "y": 327
                            },
                            "size": {
                                "width": 424,
                                "height": 145
                            },
                            "label": "Slee 4a)\naT\n\nCurl Define",
                            "color": {
                                "hex": "#ea4c2f"
                            },
                            "font": {
                                "family": "Family",
                                "size": 19.0
                            }
                        },
                        {
                            "type": "Button",
                            "id": 112,
                            "name": "Button112",
                            "location": {
                                "x": 58,
                                "y": 87
                            },
                            "size": {
                                "width": 428,
                                "height": 145
                            },
                            "label": "Color Protection\na\n\nDamage Protection",
                            "color": {
                                "hex": "#02a4f7"
                            },
                            "font": {
                                "family": "Family",
                                "size": 18.0
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
        var screen: Screen = mapper.readValue<Screen>(json.replace(ignoreJson, ""))

        val s: String = freemarker.parseTemplate(screen, "screen.ftl")
        File("src/main/kotlin/templates/output.html").writeText(s)
    }
}