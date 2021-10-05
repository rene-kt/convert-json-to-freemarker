package models

class Screen {

    var id: Int = 0
    var name: String = ""
    var size: Size = Size()
    var backgroundColor: Color? = Color()
    var startScreen: Boolean = true
    var type: String = "Screen"
    val backgroundImage: Image? = Image()
    var components: Collection<Component>? = null

    override fun toString(): String {
        return "Screen(id=$id, name='$name', size=$size, startScreen=$startScreen, type='$type', components=$components)"
    }


}