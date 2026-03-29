// interface : interface is a blueprint of a class 
// 

// eg : car[wheels , speed , engine] (interface)
//                 |  
// (classes) :   maruti 
//                 |
// (object) :  car1 , car 2 , car 3


// multiple inheritance
//    A           B
//    \           /
//     \         /
//          C

//need of interfaces in java : ~ multiple inheritance
//                             ~ total abstraction (interface)

// properties : ~ All methods are public , abstract & without implementation
//              ~ Used to achive total abstraction
//              ~ Variables in the interfaces are final , public and static

public class InterFace{
   public static void main(String[] args) {
       Queen q = new Queen();
       q.moves();
   }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up , down , right , left , diagonsl (in all 4 directions)");
    }
}
 
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up , down , right , left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up , down , right , left , diagonal ( by one step )");
    }
}  