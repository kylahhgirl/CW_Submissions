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

//rotateLeft3
public int[] rotateLeft3(int[] nums) {
  return new int [] {nums[1] , nums[2] , nums[0]};
}

//reverse3
public int[] reverse3(int[] nums) {
  return new int[] {nums[2] , nums [1] , nums[0]};
}

//maxEnd3
public int[] maxEnd3(int[] nums) {
  int max = (nums[0] > nums[nums.length - 1]) ? nums[0] : nums[nums.length - 1];
  return new int [] {max, max, max};
  
}

//sum2
public int sum2(int[] nums) {
  if (nums.length >= 2)
  {
    return nums[0]+ nums[1];
  }
  else if (nums.length ==1)
  {
    return nums[0];
  }
  else 
  {
    return 0;
  }
}

//middleWay
public int[] middleWay(int[] a, int[] b) {
  return new int [] {a[1] , b[1]};
}

//makeEnds
public int[] makeEnds(int[] nums) {
  int firstElem = nums[0];
  int lastElem = nums[nums.length - 1];
  return new int[] {firstElem , lastElem};
}
