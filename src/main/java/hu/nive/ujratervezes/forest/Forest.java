package hu.nive.ujratervezes.forest;



public class Forest {


    public double height;

    public void Trees (double height) {
        this.height = height;

    }



    public double irrigate(){
        return height;
    }


    public double getHeight() {

        return height ;
    }

    public void rain (){
        this.irrigate();
    }

//    public void cutTrees (){
//        this.Lumberjack = Lumberjack;
//    }

//    public boolean isEmpty (){
//        if Forest.
//    }
}


