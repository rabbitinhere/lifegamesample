package com.example.kotlinintroduce

object LifeGame {

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
        searchList.forEach {
            when(it){
                1 -> num += originValue(board[m - 1][n - 1])
                2 -> num += originValue(board[m - 1][n])
                3 -> num += originValue(board[m - 1][n + 1])
                4 -> num += originValue(board[m][n - 1])
                6 -> num += originValue(board[m][n + 1])
                7 -> num += originValue(board[m + 1][n - 1])
                8 -> num += originValue(board[m + 1][n])
                9 -> num += originValue(board[m + 1][n + 1])
            }
        }
        return num
    }

    private fun originValue(value: Int): Int
    {
        return value and 1
    }

    /**
     * 获取m n的点，查找非边界邻居的列表

       1,2,3,4,6,7,8,9依次代表从左到右，然后从上到下数的8个邻居
       例如:
       123
       4 6
       789
     */
    fun getSearchList(board: Array<IntArray>, m: Int, n: Int): MutableList<Int>
    {
        val mutableList = mutableListOf(1,2,3,4,6,7,8,9)
        if(m - 1 < 0){
            //当前是第一行，上面三个邻居都是0
            mutableList.removeAll { it == 1 || it == 2 || it == 3 }
        }
        if(m + 1 >= board.size){
            //当前是最后一行，下面三个邻居都是0
            mutableList.removeAll { it == 7 || it == 8 || it == 9 }
        }
        if(n - 1 < 0){
            //当前是第一列，左边三个邻居都是0
            mutableList.removeAll { it == 1 || it == 4 || it == 7 }
        }
        if(n + 1 >= board[0].size){
            //当前是最后一列，右边三个邻居都是0
            mutableList.removeAll { it == 3 || it == 6 || it == 9 }
        }
        return mutableList
    }

}