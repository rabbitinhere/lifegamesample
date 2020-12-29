package com.example.kotlinintroduce

/**
00
00
 */
fun makeTestBoard2x2_2(): Array<IntArray>
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
fun makeTestBoard1x1_1(): Array<IntArray>
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
fun makeTestBoard4x4_1(): Array<IntArray>
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
fun makeTestBoard4x4_2(): Array<IntArray>
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
fun makeTestBoard4x4_3(): Array<IntArray>
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


/**信号灯
00000
00100
00100
00100
00000
 */
fun makeTestBoard5x5_light(): Array<IntArray>
{
    val testBoard = Array(5) {
        IntArray(5)
    }
    testBoard[0][0] = 0
    testBoard[0][1] = 0
    testBoard[0][2] = 0
    testBoard[0][3] = 0
    testBoard[0][4] = 0

    testBoard[1][0] = 0
    testBoard[1][1] = 0
    testBoard[1][2] = 1
    testBoard[1][3] = 0
    testBoard[1][4] = 0

    testBoard[2][0] = 0
    testBoard[2][1] = 0
    testBoard[2][2] = 1
    testBoard[2][3] = 0
    testBoard[2][4] = 0

    testBoard[3][0] = 0
    testBoard[3][1] = 0
    testBoard[3][2] = 1
    testBoard[3][3] = 0
    testBoard[3][4] = 0

    testBoard[4][0] = 0
    testBoard[4][1] = 0
    testBoard[4][2] = 0
    testBoard[4][3] = 0
    testBoard[4][4] = 0

    return testBoard
}

/**滑翔机
1010000000
0110000000
0100000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
 */
fun makeTestBoard10x10_flight(): Array<IntArray>
{
    val testBoard = Array(10) {
        IntArray(10)
    }
    testBoard[0][0] = 1
    testBoard[0][1] = 0
    testBoard[0][2] = 1
    testBoard[0][3] = 0
    testBoard[0][4] = 0
    testBoard[0][5] = 0
    testBoard[0][6] = 0
    testBoard[0][7] = 0
    testBoard[0][8] = 0
    testBoard[0][9] = 0

    testBoard[1][0] = 0
    testBoard[1][1] = 1
    testBoard[1][2] = 1
    testBoard[1][3] = 0
    testBoard[1][4] = 0
    testBoard[1][5] = 0
    testBoard[1][6] = 0
    testBoard[1][7] = 0
    testBoard[1][8] = 0
    testBoard[1][9] = 0

    testBoard[2][0] = 0
    testBoard[2][1] = 1
    testBoard[2][2] = 0
    testBoard[2][3] = 0
    testBoard[2][4] = 0
    testBoard[2][5] = 0
    testBoard[2][6] = 0
    testBoard[2][7] = 0
    testBoard[2][8] = 0
    testBoard[2][9] = 0

    testBoard[3][0] = 0
    testBoard[3][1] = 0
    testBoard[3][2] = 0
    testBoard[3][3] = 0
    testBoard[3][4] = 0
    testBoard[3][5] = 0
    testBoard[3][6] = 0
    testBoard[3][7] = 0
    testBoard[3][8] = 0
    testBoard[3][9] = 0

    testBoard[4][0] = 0
    testBoard[4][1] = 0
    testBoard[4][2] = 0
    testBoard[4][3] = 0
    testBoard[4][4] = 0
    testBoard[4][5] = 0
    testBoard[4][6] = 0
    testBoard[4][7] = 0
    testBoard[4][8] = 0
    testBoard[4][9] = 0

    testBoard[5][0] = 0
    testBoard[5][1] = 0
    testBoard[5][2] = 0
    testBoard[5][3] = 0
    testBoard[5][4] = 0
    testBoard[5][5] = 0
    testBoard[5][6] = 0
    testBoard[5][7] = 0
    testBoard[5][8] = 0
    testBoard[5][9] = 0

    testBoard[6][0] = 0
    testBoard[6][1] = 0
    testBoard[6][2] = 0
    testBoard[6][3] = 0
    testBoard[6][4] = 0
    testBoard[6][5] = 0
    testBoard[6][6] = 0
    testBoard[6][7] = 0
    testBoard[6][8] = 0
    testBoard[6][9] = 0

    testBoard[7][0] = 0
    testBoard[7][1] = 0
    testBoard[7][2] = 0
    testBoard[7][3] = 0
    testBoard[7][4] = 0
    testBoard[7][5] = 0
    testBoard[7][6] = 0
    testBoard[7][7] = 0
    testBoard[7][8] = 0
    testBoard[7][9] = 0

    testBoard[8][0] = 0
    testBoard[8][1] = 0
    testBoard[8][2] = 0
    testBoard[8][3] = 0
    testBoard[8][4] = 0
    testBoard[8][5] = 0
    testBoard[8][6] = 0
    testBoard[8][7] = 0
    testBoard[8][8] = 0
    testBoard[8][9] = 0

    testBoard[9][0] = 0
    testBoard[9][1] = 0
    testBoard[9][2] = 0
    testBoard[9][3] = 0
    testBoard[9][4] = 0
    testBoard[9][5] = 0
    testBoard[9][6] = 0
    testBoard[9][7] = 0
    testBoard[9][8] = 0
    testBoard[9][9] = 0

    return testBoard
}

fun makeTestZeroBoard(m: Int, n: Int): Array<IntArray>{
    val itemRow = IntArray(n)
    return Array(m) {
        itemRow
    }
}

/**
01
01
 */
fun makeTestBoard2x2_1(): Array<IntArray>
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