fibo_n_1 = 1
fibo_n_2 = 2
sum_even = fibo_n_2
fibo_n = 0

while fibo_n < 4000000:
    fibo_n = fibo_n_1 + fibo_n_2
    fibo_n_1 = fibo_n_2
    fibo_n_2 = fibo_n
    if fibo_n % 2 == 0:
        sum_even += fibo_n

print(sum_even)