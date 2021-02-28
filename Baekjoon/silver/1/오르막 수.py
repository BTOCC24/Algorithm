n = int(input())
nums = [1] * 10
mod = 10007

for _ in range(n - 1):
    for i in range(1, 10):
        nums[i] = (nums[i] + nums[i-1]) % mod

print(sum(nums) % mod)

