package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);

    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":

                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {

        double flourTypeCoefficient = 0;
        if (this.flourType.equals("White")) {
            flourTypeCoefficient = 1.5;
        }else if(this.flourType.equals("Wholegrain")){
            flourTypeCoefficient=1;
        }

        double bakingTechniqueCoefficient =0;
        if(this.bakingTechnique.equals("Crispy")){
            bakingTechniqueCoefficient=0.9;
        }else if(this.bakingTechnique.equals("Chewy")){
            bakingTechniqueCoefficient=1.1;
        }else if(this.bakingTechnique.equals("Homemade")) {
            bakingTechniqueCoefficient = 1;
        }

                return 2 * this.weight * flourTypeCoefficient * bakingTechniqueCoefficient;

    }
}
