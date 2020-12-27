package com.example.kotlinintroduce

object LifeGame {
    fun gameOfLife(board: Array<IntArray>): Unit {
        val tempBoard = board.clone()
        for(rowIndex in board.indices){
            tempBoard[rowIndex] = board[rowIndex].clone()  //必须这样才能完成真正的clone二维数组
        }

        for (m in tempBoard.indices){
            for (n in tempBoard[m].indices){
                board[m][n] = nextStatus(board[m][n], getNumOfNeighbors(tempBoard, m, n))
            }
        }
    }

    /**
     * 计算一个原始点的下一代的状态
     * 实现生命游戏规则
     * @param originStatus 原始状态 0死亡 1生存
     * @param numOfNeighbors 它当前的邻居数量
     */
    fun nextStatus(originStatus: Int, numOfNeighbors: Int): Int {
        return when {
            numOfNeighbors <= 1 -> {
                0
            }
            numOfNeighbors == 2 -> {
                originStatus
            }
            numOfNeighbors == 3 -> {
                1
            }
            else -> {
                0
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
                1 -> num += board[m - 1][n - 1]
                2 -> num += board[m - 1][n]
                3 -> num += board[m - 1][n + 1]
                4 -> num += board[m][n - 1]
                6 -> num += board[m][n + 1]
                7 -> num += board[m + 1][n - 1]
                8 -> num += board[m + 1][n]
                9 -> num += board[m + 1][n + 1]
            }
        }
        return num
    }

    /**
     * 获取m n的点，查找非边界邻居的列表
     */
    fun getSearchList(board: Array<IntArray>, m: Int, n: Int): MutableList<Int>
    {
        val mutableList = mutableListOf(1,2,3,4,6,7,8,9)//依次代表从左到右，然后从上到下数的8个邻居
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