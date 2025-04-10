def solveNQueens(n):
    board = [['.' for _ in range(n)] for _ in range(n)]
    solutions = []
    helper(board, 0, n, solutions)
    return solutions


def helper(board, col, n, solutions):
    if col == n:
        saveBoard(board, solutions, n)
        return

    for row in range(n):
        if isSafe(board, row, col, n):
            board[row][col] = 'Q'
            helper(board, col + 1, n, solutions)
            board[row][col] = '.'  # backtrack


def isSafe(board, row, col, n):
    # Check left row
    for i in range(col):
        if board[row][i] == 'Q':
            return False

    # Check upper left diagonal
    i, j = row, col
    while i >= 0 and j >= 0:
        if board[i][j] == 'Q':
            return False
        i -= 1
        j -= 1

    # Check lower left diagonal
    i, j = row, col
    while i < n and j >= 0:
        if board[i][j] == 'Q':
            return False
        i += 1
        j -= 1

    return True


def saveBoard(board, solutions, n):
    temp = []
    for i in range(n):
        row = ""
        for j in range(n):
            row += board[i][j]
        temp.append(row)
    solutions.append(temp)


# Driver Code
n = 4
ans = solveNQueens(n)

for solution in ans:
    for row in solution:
        print(row)
    print()

