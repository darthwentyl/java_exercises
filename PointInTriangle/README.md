# Description
For given point and given vertices of triangle the program checks if point is in triangle.

# Solution
The solution uses Heron's formula (https://en.wikipedia.org/wiki/Heron%27s_formula).
The algorithm has five steps:
1. Calculate area for given triangle.
2. Calculate area for triangle created by points A, B, p.
3. Calculate area for triangle created by points A, p, C.
4. Calculate area for triangle created by points A, B, p.
5. If sum of small triangles created with point p is the same like given triangle area the point is in triangle.