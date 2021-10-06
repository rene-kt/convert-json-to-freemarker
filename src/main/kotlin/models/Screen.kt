package models

class Screen {

    var id: Int = 0
    var name: String = ""
    var size: Size = Size()
    var backgroundColor: Color? = Color("#fff")
    var startScreen: Boolean = true
    var type: String = "Screen"
    var backgroundImage: Image? = Image()
    var components: Collection<Component>? = null

    constructor(
        id: Int,
        name: String,
        size: Size,
        backgroundColor: Color?,
        backgroundImage: Image,
        startScreen: Boolean,
        type: String,
        components: Collection<Component>?
    ) {
        this.id = id
        this.name = name
        this.size = size
        this.backgroundColor = backgroundColor
        this.backgroundImage = backgroundImage
        this.startScreen = startScreen
        this.type = type
        this.components = components
    }

    override fun toString(): String {
        return "Screen(id=$id, name='$name', size=$size, backgroundColor=$backgroundColor, startScreen=$startScreen, type='$type', backgroundImage=$backgroundImage, components=$components)"
    }


}