import binary.tree.BinaryTree
import binary.tree.Node

fun main(args: Array<String>){
    //val tree = BinaryTree(Node(data =  "たこっち",right = Node(data = "パン太"), left = Node(data = "ぴーちゃん")))
    //println(tree.toString())
    println("3".compareTo("2"))
    val tree = BinaryTree(Node(data = "2"))

    tree.put("6")
    tree.put("0")
    tree.put("8")
    tree.put("7")
    tree.put("9")
    println(tree.toString())
    println("8".compareTo("9"))
    println(tree.searchData("0"))
    println(tree.searchData("7"))
    println(tree.searchData("333"))
}

