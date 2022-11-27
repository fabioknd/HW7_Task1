public interface HouseholdItemVisitor {
        void visit(Electronic electronic);
        void visit(Furniture furniture);
        void visit(Glass glass);
}
