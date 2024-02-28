String tstring = System.in.newReader().readLine()

def tstList = tstring.collect{it as char}

int counter = 1 //counter for a group of symblos
int iterator = 0 //list index, 0-indexed
int size = tstList.size() //list size, to end loop at that value - 1-indexed
//println(tstList)
//println(size)

for (i in tstList) {

char curLetter=tstList.get(iterator)
char nextLetter=tstList.get(iterator+1)
  
  if(curLetter==nextLetter) {
    counter = counter+1
  }
  else {
    print "$curLetter$counter"
    counter = 1
  }
  iterator = iterator+1
  
  if(iterator==size-1) { //final loop, the next one will cause IndexOutOfBoundsException
                         //because nextLetter position doesn't exist in the array
    println "$nextLetter$counter"
    break;
  }
}
//onecompiler.com/groovy/425n8fgpp