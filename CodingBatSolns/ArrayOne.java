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

//has23
public boolean has23(int[] nums) {
  if (nums[0] == 2 || nums[1] == 2 ||  nums [0] == 3 || nums[1] == 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//no23
public boolean no23(int[] nums) {
  if (nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//makeLast
public int[] makeLast(int[] nums) {
  int len = nums.length *2;
  int[] newArr = new int[len];
  newArr[len - 1] = nums[nums.length -1];
  return newArr;
}

//double23
public boolean double23(int[] nums) {
  if (nums.length >= 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)
  {
    return true;
  }
  else 
  {
    return false;
  }
}

//fix23
public int[] fix23(int[] nums) {
   for  (int i=0; i<nums.length; i++)
   {
     if (nums[i] == 2 && nums[i+1] == 3)
     {
       nums [i +  1] = 0;
     }
   }
   return nums;
}

//start1
public int start1(int[] a, int[] b) {
  if (a.length  > 0 && b.length > 0)
  return a[0] == 1 && b[0] == 1 ? 2 :  a[0] == 1 || b[0] == 1 ? 1 : 0 ;
  if(a.length == 0 && b.length == 0)
  return 0;
  else
  {
    if (a.length == 0)
    return b[0] == 1 ? 1 : 0;
    return a[0] == 1 ? 1 : 0;
  }
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  return a[0] + a[1] > b[1] + b[0] ? a : a[0] + a[1] == b[0] + b[1] ? a : b;
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
  int[] x = {  nums[nums.length/2 -1]  ,  nums[nums.length/2] };
  return x;
}

//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  return new int[] { a[0] , a[1] , b[0] , b[1] };
  
}

//swapEnds
public int[] swapEnds(int[] nums) {
  int temp = nums[0];
  nums [0]= nums[nums.length-1];
  nums[nums.length-1] = temp;
  return nums;
  
}

//midThree
public int[] midThree(int[] nums) {
  if (nums.length == 3)
  return nums;
  int middle = nums.length / 2;
  return new int[] { nums[middle-1] , nums[middle] , nums [middle  +  1]};
}

//maxTriple
public int maxTriple(int[] nums) {
  if (nums.length == 1)
  return nums[0];
  int beginning = nums[0] , middle = nums.length / 2 , end = nums[nums.length-1];
  middle = nums[middle];
  int large = beginning > middle ? beginning : middle;
  return large > end ? large : end;
}

//frontPiece
public int[] frontPiece(int[] nums) {
  if (nums.length ==  0)
  return new int[] {};
  return nums.length > 1 ? new int[] {nums[0] , nums[1] } : new int[] {nums[0]};
}

//make2
public int[] make2(int[] a, int[] b) {
  if (a.length == 0)
  return b;
  if (b.length == 0)
  return new int[] {a[0] , a[1]};
  if (a.length == 1)
  return new int[] {a[0] , b[0]};
  return new int[] {a[0] , a[1]};
}

//front11
public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0)
  return new int[] { };
  if (a.length == 0)
  return new int[] {b[0]};
  if (b.length == 0)
  return new int[] {a[0]};
  return new int[] {a[0] , b[0]};
}


