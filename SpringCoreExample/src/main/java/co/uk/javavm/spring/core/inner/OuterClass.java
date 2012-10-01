package co.uk.javavm.spring.core.inner;

public class OuterClass {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public InnerClass getInnerClassInstance() {
        return new InnerClass();
    }
    // Public non static inner class
    public class InnerClass {
        private String familyName;

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }
    }
}
