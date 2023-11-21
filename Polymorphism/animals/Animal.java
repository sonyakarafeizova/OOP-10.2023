package Polymorphism.animals;

public abstract class Animal {
   private String name;
    private String favouriteFood;

    protected Animal (String name, String favouriteFood){
        this.setName(name);
        this.setFavouriteFood(favouriteFood);

    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {

    }

    private void setName(String name) {
    }

    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s",this.getName(),this.getFavouriteFood());
    }


}
