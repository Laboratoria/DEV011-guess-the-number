public abstract class Player {
    String name;//nombre jugadora

    int[] guesses;//intentos de adivinar nro

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public void setGuesses(int number) {
        if(this.guesses==null){
            guesses = new int[]{number};//array de un solo elemento
        }
        else{
            int[] newArray = new int[guesses.length + 1];//array nuevo mas largo
            System.arraycopy(guesses, 0, newArray, 0, guesses.length);//copiar array
            newArray[guesses.length] = number;//add element
            guesses= newArray;
        }

    }

    abstract int makeGuess();

}
