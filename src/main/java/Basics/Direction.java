package Basics;

public enum Direction {
    NORTH {
        int getDegree() {return 0;}
    },
    SOUTH{
        int getDegree() {return 180;}
    },
    EAST{
        int getDegree() {return 90;}
    },
    WEST{
        int getDegree() {return 270;}
    };

    abstract int getDegree();
}
