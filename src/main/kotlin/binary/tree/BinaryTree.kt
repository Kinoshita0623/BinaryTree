package binary.tree

class BinaryTree(private val tree:Node){
    override fun toString():String{
        return tree.toString()
    }

    fun searchData(data:String):String?{
        return searchEngine(data, tree)
    }

    private tailrec fun searchEngine(data: String, node: Node):String?{
        return when{
            node.data == data ->{
                node.data
            }
            node.data > data && node.left != null ->{
                searchEngine(data, node.left!!)

            }
            node.data < data && node.right != null ->{
                searchEngine(data,node.right!!)

            }else ->{
                null
            }
        }
    }

    fun put(data: String):Boolean{
        return put(data,tree)
    }

    private tailrec fun put(data: String, node: Node):Boolean{

        when{
            node.data == data ->{
                node.data = data
                return true
            }

            node.data < data ->{
                //引数の値の方が大きい場合

                if(node.right == null){

                    node.right = Node(right = null, left = null, data = data)
                    return true
                }else if(node.right != null){

                    return put(data = data, node = node.right!!)
                }
            }
            node.data > data ->{
                //引数の値の方が小さい場合
                if(node.left == null){
                    node.left = Node(right = null, left = null, data = data)

                }else if(node.left != null){
                    return put(data = data, node = node.left!!)
                }
            }
        }

        return true
    }


}
data class  Node(var left:Node? = null,var right:Node? = null,  var data:String){
    override fun toString():String{
        when{
            left == null && right == null ->{
                return data
            }
            left != null && right == null ->{
                return "(data:$data, left:$left, right)"
            }
            left == null && right != null ->{
                return "(data:$data, left, right:$right)"
            }
        }
        return "(data=$data, left:$left ,right:$right )"
    }
}