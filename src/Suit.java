public enum Suit {

    CLUB {
        @Override
        public String sign() {
            return "(♣)";
        }
    },
    DIAMOND {
        @Override
        public String sign() {
            return "(♦)";
        }
    },
    HEART {
        @Override
        public String sign() {
            return "(♥)";
        }
    },
    SPADE {
        @Override
        public String sign() {
            return "(♠)";
        }
    };
    public abstract String sign();

//    public static String getSign(int element) {
//        String [] sings = {CLUB.sign(), DIAMOND.sign(), HEART.sign(), SPADE.sign()};
//        return sings[element];
//    }
}
