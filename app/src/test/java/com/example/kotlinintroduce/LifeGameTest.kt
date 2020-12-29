package com.example.kotlinintroduce

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class LifeGameTest {

    /**
     * 生命游戏单测
     */
    @Test
    fun testLifeGame()
    {
        val board1 = makeTestBoard2x2_1()
        LifeGame.gameOfLife(board1)
        assertThat(board1).isEqualTo(makeTestBoard2x2_2())


        val board2 = makeTestBoard4x4_2()
        LifeGame.gameOfLife(board2)
        assertThat(board2).isEqualTo(makeTestBoard4x4_3())
    }

    /**
     * 可以模拟输出生命游戏，死循环，需要手动停止
     * 需要在控制台查看输出，把控制台高度调低就可以很美观了
     */
    @Test
    fun printLifeGame()
    {
        val board2 = makeTestBoard10x10_flight()
        while (true) {
            printBoard(board2)
            LifeGame.gameOfLife(board2)
            Thread.sleep(1000)
        }
    }

    private fun printBoard(board: Array<IntArray>)
    {
        var res = "========\n"
        for (m in board.indices){
            var row = ""
            for (n in board[m].indices){
                row += "${board[m][n]} "
            }
            res += "$row\n"
        }
        println(res)
    }



    @Test
    fun testGetNumOfNeighbors()
    {
        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard4x4_1(), 1, 1)).isEqualTo(4)
        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard4x4_1(), 0, 1)).isEqualTo(3)
        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard4x4_1(), 0, 0)).isEqualTo(3)
        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard4x4_1(), 3, 3)).isEqualTo(1)

        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard1x1_1(), 0, 0)).isEqualTo(0)

        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard2x2_1(), 0, 0)).isEqualTo(2)
        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard2x2_1(), 0, 1)).isEqualTo(1)
        assertThat(LifeGame.getNumOfNeighbors(makeTestBoard2x2_1(), 1, 1)).isEqualTo(1)
    }


    @Test
    fun testGetSearchList()
    {
        assert(LifeGame.getSearchList(makeTestZeroBoard(4, 4), 1, 1) == 255)//11111111

        assert(LifeGame.getSearchList(makeTestZeroBoard(4, 4), 1, 0) == 107)//01101011

        assert(LifeGame.getSearchList(makeTestZeroBoard(4, 4), 0, 1) == 31)//00011111

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 2), 1, 1) == 208)//11010000

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 2), 0, 1) == 22)//00010110

        assert(LifeGame.getSearchList(makeTestZeroBoard(1, 2), 0, 1) == 16)//00010000

        assert(LifeGame.getSearchList(makeTestZeroBoard(1, 2), 0, 0) == 8)//00001000

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 1), 0, 0) == 2)//00000010

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 1), 1, 0) == 64)//01000000

        assert(LifeGame.getSearchList(makeTestZeroBoard(1, 1), 0, 0) == 0)//00000000
    }

}