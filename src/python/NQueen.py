def solveNQueens(n):
    board = []
    for i in range(n):
        row = []
        for j in range(n):
            row.append('.')
        board.append(row)
    helper(board, 0, n)
    return


def helper(board, col, n):
    if col == n:
        printBoard(board, n)
        return

    for row in range(n):
        if isSafe(board, row, col, n):
            board[row][col] = 'Q'
            helper(board, col + 1, n)
            board[row][col] = '.'  # backtrack


def isSafe(board, row, col, n):
    # Check if there's a queen in the same row on the left side
    for j in range(col):
        if board[row][j] == 'Q':
            return False

    # Check upper-left diagonal
    i, j = row - 1, col - 1
    while i >= 0 and j >= 0:
        if board[i][j] == 'Q':
            return False
        i -= 1
        j -= 1

    # Check lower-left diagonal
    i, j = row + 1, col - 1
    while i < n and j >= 0:
        if board[i][j] == 'Q':
            return False
        i += 1
        j -= 1

    # If no conflict is found, it's safe to place a queen here
    return True



def printBoard(board, n):
    for i in range(n):
        for j in range(n):
            print(board[i][j], end=' ')
        print()


# Driver Code
n = 4
solveNQueens(n)


