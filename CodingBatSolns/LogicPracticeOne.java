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

//alarmClock
public String alarmClock(int day, boolean vacation) {
  if(!vacation)
  {
    if (day == 1 ||  day == 2 || day ==  3 || day == 4 || day ==  5)
    {
      return  "7:00";
    }
  
  else if (day == 0 || day == 6)
  {
    return "10:00";
  }
}

if (vacation)
{
  if (day == 1 ||  day == 2 || day ==  3 || day == 4 || day ==  5)
{
  return "10:00";
}

else if (day == 0 || day == 6)
{
  return "off";
}
}

return "ok";
}

//in1To10
public boolean in1To10(int n, boolean outsideMode) {
  if (!outsideMode)
  {
    if (n >= 1 &&  n <= 10)
    {
      return true;
    }
  }
  
  if (outsideMode)
  {
    if (n <= 1 || n>= 10)
    {
      return true;
    }
    else  
    {
      return false;
    }
  }
  return false;
}

//old35
public boolean old35(int n) {
  if (n %  3 == 0 && n % 5 == 0)
  {
    return false;
  }
  
  else if (n %  3 == 0 || n % 5 == 0)
  {
    return true;
  }
  
  return false;
}
