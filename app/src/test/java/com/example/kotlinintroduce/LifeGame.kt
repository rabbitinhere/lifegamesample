package com.example.kotlinintroduce

object LifeGame {

    val A = 128  //10000000
    val B = 64   //01000000
    val C = 32   //00100000
    val D = 16   //00010000
    val E = 8    //00001000
    val F = 4    //00000100
    val G = 2    //00000010
    val H = 1    //00000001

    fun gameOfLife(board: Array<IntArray>): Unit {
        //这个循环会让所有的格子变成二进制状态
        //比如 二进制10 代表原来是0，即将变成1；
        //二进制11 代表原来是1，即将变成1；
        //二进制01和00代表原来是1和0，即将变成0
        for (m in board.indices){
            for (n in board[m].indices){
                val neighbors = getNumOfNeighbors(board, m, n)
                if(board[m][n]==1){
                    if(neighbors==2 || neighbors==3)
                        board[m][n] = 3 //二进制11 代表原来是1，即将变成1
                }else{
                    if(neighbors==3)
                        board[m][n] = 2 //二进制10 代表原来是0，即将变成1；
                }
            }
        }

        //根据所有格子的二进制状态，将格子更新
        for (m in board.indices){
            for (n in board[m].indices){
                board[m][n] = board[m][n] shr 1 //相当于>>
            }
        }
    }

    /**
     * 获取m、n代表的点，在board的平面上的邻居数量加和
     */
    fun getNumOfNeighbors(board: Array<IntArray>, m: Int, n: Int): Int
    {

        var num = 0
        val searchList = getSearchList(board, m, n)
        //此时查找列表里的都是非边界的值，正常找不会越界
        for (i in 0 until 8){
            when{
                i == 0 && matchBit(searchList, A) -> num += originValue(board[m - 1][n - 1])
                i == 1 && matchBit(searchList, B) -> num += originValue(board[m - 1][n])
                i == 2 && matchBit(searchList, C) -> num += originValue(board[m - 1][n + 1])
                i == 3 && matchBit(searchList, D) -> num += originValue(board[m][n - 1])
                i == 4 && matchBit(searchList, E) -> num += originValue(board[m][n + 1])
                i == 5 && matchBit(searchList, F) -> num += originValue(board[m + 1][n - 1])
                i == 6 && matchBit(searchList, G) -> num += originValue(board[m + 1][n])
                i == 7 && matchBit(searchList, H) -> num += originValue(board[m + 1][n + 1])
            }
        }
        return num
    }

    private fun originValue(value: Int): Int
    {
        return value and 1
    }

    private fun matchBit(value: Int, target: Int): Boolean
    {
        return target and value == target
    }

    /**
     * 获取m n的点，查找非边界邻居的列表

       一个Int的八位Bit从高位到地位  依次代表查找时从左到右，然后从上到下数的8个邻居
       例如:
       10011111
        代表
       100
       1 1
       111
     */
    fun getSearchList(board: Array<IntArray>, m: Int, n: Int): Int
    {
        var searchList = 255
        if(m - 1 < 0){
            //当前是第一行，上面三个邻居都是0，不需要查找
            searchList = searchList and 31 //00011111
        }
        if(m + 1 >= board.size){
            //当前是最后一行，下面三个邻居都是0，不需要查找
            searchList = searchList and 248 //11111000
        }
        if(n - 1 < 0){
            //当前是第一列，左边三个邻居都是0，不需要查找
            searchList = searchList and 107 //01101011
        }
        if(n + 1 >= board[0].size){
            //当前是最后一列，右边三个邻居都是0，不需要查找
            searchList = searchList and 214 //11010110
        }
        return searchList
    }

}