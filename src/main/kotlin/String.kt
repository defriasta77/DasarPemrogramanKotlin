fun main(args: Array<String>) {
    val myName: String = "Defri Astarido"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    val s = "abc" + 1
    println(s + "def")

    var text = """
for (c in "foo")
print(c)
"""
    println(text)
}