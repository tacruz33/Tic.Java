package pontoflutuante;

class exemplo {
    private int x;
    private int y;

    public void exibirInfo() {
        System.out.println(" " + x + " " + y);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 0;
        do {
            y = x;
            x = x / 2;
        } while (x > 0);
        System.out.println("y: " + y);
    }
}


// 