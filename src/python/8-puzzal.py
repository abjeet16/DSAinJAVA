from collections import deque

# Goal state
goal = [[1, 2, 3],
        [4, 5, 6],
        [7, 8, 0]]

# Check if current state is goal
def is_goal(state):
    return state == goal

# Find the blank (0) position
def find_blank(state):
    for i in range(3):
        for j in range(3):
            if state[i][j] == 0:
                return i, j

# Generate next possible states
def get_next_states(state):
    next_states = []
    x, y = find_blank(state)
    moves = [(-1, 0), (1, 0), (0, -1), (0, 1)]  # Up, Down, Left, Right

    for dx, dy in moves:
        nx, ny = x + dx, y + dy
        if 0 <= nx < 3 and 0 <= ny < 3:
            new_state = [row[:] for row in state]
            new_state[x][y], new_state[nx][ny] = new_state[nx][ny], new_state[x][y]
            next_states.append(new_state)

    return next_states

# BFS function
def solve(start):
    queue = deque()
    queue.append((start, []))
    visited = set()
    visited.add(str(start))

    while queue:
        current, path = queue.popleft()

        if is_goal(current):
            return path

        for next_state in get_next_states(current):
            state_str = str(next_state)
            if state_str not in visited:
                visited.add(state_str)
                queue.append((next_state, path + [next_state]))

    return None

# Function to print state
def print_state(state):
    for row in state:
        print(row)
    print()

# ---------------- RUN ----------------
start = [[1, 2, 3],
         [4, 0, 5],
         [7, 8, 6]]

print("Start State:")
print_state(start)

solution = solve(start)

if solution:
    print("Solved in", len(solution), "steps!")
    for step in solution:
        print_state(step)
else:
    print("No solution found.")

