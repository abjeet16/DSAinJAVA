import math

# Alpha Beta Pruning Function
def alphaBeta(depth, nodeIndex, isMax, values, alpha, beta):
    # Base Case : Leaf Node
    if depth == 3:
        return values[nodeIndex]

    if isMax:
        best = -math.inf

        for i in range(2):
            val = alphaBeta(depth + 1, nodeIndex * 2 + i, False, values, alpha, beta)
            best = max(best, val)
            alpha = max(alpha, best)

            # Beta Cutoff
            if beta <= alpha:
                break
        return best

    else:
        best = math.inf

        for i in range(2):
            val = alphaBeta(depth + 1, nodeIndex * 2 + i, True, values, alpha, beta)
            best = min(best, val)
            beta = min(beta, best)

            # Alpha Cutoff
            if beta <= alpha:
                break
        return best


def main():
    # Leaf Nodes
    values = [3, 5, 6, 9, 1, 2, 0, -1]

    print("The optimal value is :", alphaBeta(0, 0, True, values, -math.inf, math.inf))


if __name__ == "__main__":
    main()
