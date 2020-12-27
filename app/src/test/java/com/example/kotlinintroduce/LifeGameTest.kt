package com.example.kotlinintroduce

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class LifeGameTest {

    @Test
    public fun lifeGame()
    {
        val board1 = makeTestBoard2x2_1()
        LifeGame.gameOfLife(board1)
        assertThat(board1).isEqualTo(makeTestBoard2x2_2())


        val board2 = makeTestBoard4x4_2()
        LifeGame.gameOfLife(board2)
        assertThat(board2).isEqualTo(makeTestBoard4x4_3())

    }



    private fun makeTestZeroBoard(m: Int, n: Int): Array<IntArray>{
        val itemRow = IntArray(n)
        return Array(m) {
            itemRow
        }
    }


    @Test
    public fun testGetNumOfNeighbors()
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



    /**
    01
    01
     */
    private fun makeTestBoard2x2_1(): Array<IntArray>
    {
        val testBoard = Array(2) {
            IntArray(2)
        }
        testBoard[0][0] = 0
        testBoard[0][1] = 1

        testBoard[1][0] = 0
        testBoard[1][1] = 1

        return testBoard
    }

    /**
    00
    00
     */
    private fun makeTestBoard2x2_2(): Array<IntArray>
    {
        val testBoard = Array(2) {
            IntArray(2)
        }
        testBoard[0][0] = 0
        testBoard[0][1] = 0

        testBoard[1][0] = 0
        testBoard[1][1] = 0

        return testBoard
    }

    /**
    1
     */
    private fun makeTestBoard1x1_1(): Array<IntArray>
    {
        val testBoard = Array(1) {
            IntArray(1)
        }
        testBoard[0][0] = 1

        return testBoard
    }

    /**
    0100
    1110
    1001
    1000
     */
    private fun makeTestBoard4x4_1(): Array<IntArray>
    {
        val testBoard = Array(4) {
            IntArray(4)
        }
        testBoard[0][0] = 0
        testBoard[0][1] = 1
        testBoard[0][2] = 0
        testBoard[0][3] = 0

        testBoard[1][0] = 1
        testBoard[1][1] = 1
        testBoard[1][2] = 1
        testBoard[1][3] = 0

        testBoard[2][0] = 1
        testBoard[2][1] = 0
        testBoard[2][2] = 0
        testBoard[2][3] = 1

        testBoard[3][0] = 1
        testBoard[3][1] = 0
        testBoard[3][2] = 0
        testBoard[3][3] = 0

        return testBoard
    }

    /**
    1010
    1000
    0000
    0000
     */
    private fun makeTestBoard4x4_2(): Array<IntArray>
    {
        val testBoard = Array(4) {
            IntArray(4)
        }
        testBoard[0][0] = 1
        testBoard[0][1] = 0
        testBoard[0][2] = 1
        testBoard[0][3] = 0

        testBoard[1][0] = 1
        testBoard[1][1] = 0
        testBoard[1][2] = 0
        testBoard[1][3] = 0

        testBoard[2][0] = 0
        testBoard[2][1] = 0
        testBoard[2][2] = 0
        testBoard[2][3] = 0

        testBoard[3][0] = 0
        testBoard[3][1] = 0
        testBoard[3][2] = 0
        testBoard[3][3] = 0

        return testBoard
    }

    /**
    0100
    0100
    0000
    0000
     */
    private fun makeTestBoard4x4_3(): Array<IntArray>
    {
        val testBoard = Array(4) {
            IntArray(4)
        }
        testBoard[0][0] = 0
        testBoard[0][1] = 1
        testBoard[0][2] = 0
        testBoard[0][3] = 0

        testBoard[1][0] = 0
        testBoard[1][1] = 1
        testBoard[1][2] = 0
        testBoard[1][3] = 0

        testBoard[2][0] = 0
        testBoard[2][1] = 0
        testBoard[2][2] = 0
        testBoard[2][3] = 0

        testBoard[3][0] = 0
        testBoard[3][1] = 0
        testBoard[3][2] = 0
        testBoard[3][3] = 0

        return testBoard
    }

    @Test
    public fun testGetSearchList()
    {
        assert(LifeGame.getSearchList(makeTestZeroBoard(4, 4), 1, 1) == listOf(1, 2, 3, 4, 6, 7, 8, 9))

        assert(LifeGame.getSearchList(makeTestZeroBoard(4, 4), 1, 0) == listOf(2, 3, 6, 8, 9))

        assert(LifeGame.getSearchList(makeTestZeroBoard(4, 4), 0, 1) == listOf(4, 6, 7, 8, 9))

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 2), 1, 1) == listOf(1, 2, 4))

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 2), 0, 1) == listOf(4, 7, 8))

        assert(LifeGame.getSearchList(makeTestZeroBoard(1, 2), 0, 1) == listOf(4))

        assert(LifeGame.getSearchList(makeTestZeroBoard(1, 2), 0, 0) == listOf(6))

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 1), 0, 0) == listOf(8))

        assert(LifeGame.getSearchList(makeTestZeroBoard(2, 1), 1, 0) == listOf(2))

        assert(LifeGame.getSearchList(makeTestZeroBoard(1, 1), 0, 0) == emptyList<Int>())
    }

}