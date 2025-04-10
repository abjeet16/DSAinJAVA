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

visited = set()  # Set to keep track of visited nodes


def dfs(visited, graph, node):
    if node not in visited:
        print(node, end=" ")
        visited.add(node)

        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)


print("DFS Traversal starting from node 'A':")
dfs(visited, graph, 'A')
