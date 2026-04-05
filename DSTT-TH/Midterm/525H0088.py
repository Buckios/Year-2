import numpy as np
import math

# Init
A = np.random.randint(1, 101, size=(10, 10))
B = np.random.randint(1, 31, size=(2, 10))
C = np.random.randint(1, 21, size=(10, 2))

# Task 1a
CB = np.dot(C, B)
BTCT = np.dot(B.T, C.T)
res_a = A + A.T + CB + BTCT

# Task 1b
k = np.random.randint(1, 11)
idx = np.random.choice(10, k, replace=False)
Ap = A[:, idx] 
Cp = C[idx, :] 
M = B @ Ap @ Cp 

# Task 1c
v = A[A % 2 != 0]
res_c = np.unique(v)[::-1]

# Task 1d
def is_p(n):
    if n <= 1: return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0: return False
    return True

v_p = np.vectorize(is_p)
d = A[v_p(A)]
idx_d = np.arange(1, len(d) + 1)
S = np.sum(d * idx_d)

# Task 1e
p_msk = v_p(A)
p_cnt = np.sum(p_msk, axis=1)
max_p = np.max(p_cnt)
res_e = np.where(p_cnt == max_p)[0]

# Task 1f
def odd_seq(row):
    m_len, c_len = 0, 0
    for x in row:
        if x % 2 != 0:
            c_len += 1
            m_len = max(m_len, c_len)
        else:
            c_len = 0
    return m_len

s_lens = [odd_seq(r) for r in A]
max_s = max(s_lens)
res_f = [i for i, l in enumerate(s_lens) if l == max_s]


print("Input Matrix A:\n", A)
print("\nInput Matrix B:\n", B)
print("\nInput Matrix C:\n", C)

print("\nTask 1a Result:\n", res_a)

print(f"\nTask 1b Result with k={k} and indices={idx}:\n", M)

print("\nTask 1c Result for Vector v:\n", res_c)

print(f"\nTask 1d Result for S with {len(d)} primes found: {S}")

print(f"\nTask 1e Result for rows with max prime count of {max_p}:")
for r in res_e:
    print(f"Row {r + 1}: {A[r]}")

print(f"\nTask 1f Result for rows with longest odd sequence of {max_s}:")
for r in res_f:
    print(f"Row {r + 1}: {A[r]}")