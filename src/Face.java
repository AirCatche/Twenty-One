public enum Face {
    ACE{
        @Override
        public int points() {
            return 1;
        }
        @Override
        public String face() {
            return "ACE";
        }
    },
    TWO{
        @Override
        public int points() {
            return 2;
        }
        @Override
        public String face() {
            return "2";
        }
    },
    THREE{
        @Override
        public int points() {
            return 3;
        }
        @Override
        public String face() {
            return "3";
        }
    },
    FOUR{
        @Override
        public int points() {
            return 4;
        }
        @Override
        public String face() {
            return "4";
        }
    },
    FIVE{
        @Override
        public int points() {
            return 5;
        }
        @Override
        public String face() {
            return "5";
        }
    },
    SIX{
        @Override
        public int points() {
            return 6;
        }
        @Override
        public String face() {
            return "6";
        }
    },
    SEVEN{
        @Override
        public int points() {
            return 7;
        }
        @Override
        public String face() {
            return "7";
        }
    },
    EIGHT{
        @Override
        public int points() {
            return 8;
        }
        @Override
        public String face() {
            return "8";
        }
    },
    NINE{
        @Override
        public int points() {
            return 9;
        }
        @Override
        public String face() {
            return "9";
        }
    },
    TEN{
        @Override
        public int points() {
            return 10;
        }
        @Override
        public String face() {
            return "10";
        }
    },
    JACK{
        @Override
        public int points() {
            return 10;
        }
        @Override
        public String face() {
            return "JACK";
        }
    },
    QUEEN{
        @Override
        public int points() {
            return 10;
        }
        @Override
        public String face() {
            return "QUEEN";
        }
    },
    KING{
        @Override
        public int points() {
            return 10;
        }

        @Override
        public String face() {
            return "KING";
        }
    };

    public abstract int points();
    public abstract String face();

//    public static String getFace(int element) {
//        String[] faces = {ACE.face(), TWO.face(), THREE.face(), FOUR.face(), FIVE.face(), SIX.face(), SEVEN.face(), EIGHT.face(), NINE.face(), TEN.face(), JACK.face(), QUEEN.face(), KING.face() };
//        return faces[element];
//    }
//    public static int getPoints(int element){
//        int[] points = {ACE.points(), TWO.points(), THREE.points(), FOUR.points(), FIVE.points(), SIX.points(), SEVEN.points(), EIGHT.points(), NINE.points(), TEN.points(), JACK.points(), QUEEN.points(), KING.points()};
//        return points[element];
//    }
}
