public class HouseholdItemPackingVisitor implements HouseholdItemVisitor{
    @Override
    public void visit(Electronic electronic) {
        System.out.println(electronic.getName()+":");
        System.out.println(">should be covered with Polyethylene foam film and packed in a box with dimension: "+electronic.getHeight()+"x"+electronic.getLenght()+"x"+electronic.getWidth());
    }

    @Override
    public void visit(Furniture furniture) {
        System.out.println(furniture.getName()+":");
        System.out.println(">should be covered with waterproof covers with area of: "+furniture.getLenght()+"x"+furniture.getWidth());
    }

    @Override
    public void visit(Glass glass) {
        System.out.println(glass.getName()+":");
        System.out.println(">should be wrapped with Bubble wraps and packed in a box with dimension: "+glass.getHeight()+"x"+glass.getLenght()+"x"+glass.getWidth());
    }

}
