public class PracticeMyself {
    // fruit

    String fruitName;

    int fruitPrice;

    int expirationDate;
    public PracticeMyself (String fruitName, int fruitPrice, int expirationDate){
        this.fruitName = fruitName;
        this.expirationDate = expirationDate;
        this.fruitPrice = fruitPrice;
    }


    public static void main(String[] args) {
        PracticeMyself fruit1 = new PracticeMyself("apple",5,5);
        System.out.println(fruit1.expirationDate);
    }




    // ---------------------------------------------------------------

    int w;
    int l;
    public PracticeMyself (int w, int l){
        this.w = w;
        this.l = l;

    }

}
