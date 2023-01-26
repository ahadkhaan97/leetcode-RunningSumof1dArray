fun main() {
    runningSum(intArrayOf(1, 2, 3, 4)).forEach {
        print("$it ")
    }
}

fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] = nums[i] + nums[i - 1]
    }
    return nums
}
