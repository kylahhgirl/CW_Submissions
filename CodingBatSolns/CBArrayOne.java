//firstLast6
public boolean firstLast6(int[] nums) {
  return (nums[0] == 6 || nums[nums.length - 1] == 6);
}

//sameFirstLast
public boolean sameFirstLast(int[] nums) {
  if (nums.length >= 1 && (nums[0] == nums[nums.length -1]))
  {
    return true;
  }
  else
  {
    return false;
  }
}

//makePi
public int[] makePi() {
  return new int[] {3, 1, 4};
}

//commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if (a[0] == b[0] || a[a.length -1] == b[b.length -1])
  {
    return true;
  }
  else
  {
    return false;
  }
}

//sum3
public int sum3(int[] nums) {
  int sum = nums[0] + nums[1] + nums[2];
  return sum;
}
