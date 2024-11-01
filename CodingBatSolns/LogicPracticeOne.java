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
