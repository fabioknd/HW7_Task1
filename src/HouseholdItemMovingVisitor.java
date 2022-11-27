public class HouseholdItemMovingVisitor implements HouseholdItemVisitor{
    @Override
    public void visit(Electronic electronic) {
        double totalCost;

        // Assuming weight is given in kilograms
        if (electronic.getFragile()) {
            totalCost = electronic.getWeight() / 10.0 * 5;
        } else {
            totalCost = electronic.getWeight() / 15.0 * 5;
        }

        System.out.println("Total Cost for "+electronic.getName()+" is: "+totalCost);
    }

    @Override
    public void visit(Furniture furniture) {
        // The given values for Bed and Bookshelf in the solution seems wrong, because if the bed weights 26 units, it's not possible for the total cost to be 26 Euros. I think my calculation is correct though.
        double totalCost = furniture.getWeight() / 20.0 * 5;

        System.out.println("Total Cost for "+furniture.getName()+" is: "+totalCost);
    }

    @Override
    public void visit(Glass glass) {
        // I can't figure out how the values in the solution are come about.
        // For example the wineglass must be calculated with 33 (lenght) devided by 20 would be 1.65 but logically it should be 33 (lenght) * 2 (price for metre by thickness 1) = 66. How?
        double totalCost = switch (glass.getTickness()) {
            case 1 -> glass.getLenght() * 2.0;
            case 2 -> glass.getLenght() * 1.2;
            case 3 -> glass.getLenght() * 0.7;
            default -> 0.0;
        };

        System.out.println("Total Cost for "+glass.getName()+" is: "+totalCost);
    }

}
