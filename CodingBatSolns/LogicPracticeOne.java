//CigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend)
{
 if (cigars >=40)
 {
   return true;
 }
}

if (!isWeekend)
{
 if (cigars <= 60 && cigars >= 40)
 {
   return true;
 }
}
 return false;
}

//dateFashion
public int dateFashion(int you, int date) {
if (you <=2 || date <=2)
  {
    return 0;
  }
else if (you >=8 || date >=8)  
  {
    return 2;
  }
else 
{
  return 1;
}
}

//SquirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer)
{
 if (temp  >= 60 &&temp <= 100)
  {
    return true;
  }
  
  }
  
  if (!isSummer)
  {
    if (temp >=  60 && temp <=  90)
    {
        return true;
    }
  }
  return false;
  }

//caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday)
{
 if (speed <= 65)
 {
   return 0;
 }

else if (speed <= 85)
{
  return 1;
}

else 
{
  return 2;
}

}

if (!isBirthday)
{
  if (speed <= 60)
  {
    return 0;
  }
  
  else if (speed <= 80)
  {
    return 1;
  }
  
  else
  {
    return 2;
  }
}
return 0;
}

//sortaSum
public int sortaSum(int a, int b) {
  int sum = a+b;
  
  if (sum  >= 10 && sum <= 19)
  {
    return 20;
  }
  
  else
  {
    return sum;
  }
}