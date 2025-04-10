# Adjacency list
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F', 'G'],
    'D': ['H'],
    'E': ['H'],
    'F': ['H'],
    'G': ['H'],
    'H': []
}

visited = []  # List to keep track of visited nodes.
queue = []    # Queue for BFS


def bfs(visited, graph, node):
    visited.append(node)
    queue.append(node)

    print("BFS traversal starting from node 'A':")

    while queue:
        s = queue.pop(0)
        print(s, end=" ")

        for neighbour in graph[s]:
            if neighbour not in visited:
                visited.append(neighbour)
                queue.append(neighbour)


# Driver code
bfs(visited, graph, 'A')
