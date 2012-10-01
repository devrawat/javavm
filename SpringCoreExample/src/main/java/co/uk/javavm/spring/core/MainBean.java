package co.uk.javavm.spring.core;
public class MainBean {
    private MainBeanDependency1 dependency1;
    private MainBeanDependency2 dependency2;

    public MainBean(MainBeanDependency1 dependency1, MainBeanDependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
}
