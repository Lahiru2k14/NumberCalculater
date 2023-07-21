class CalculatorController {
    private NumberObserver[] observerArray = new NumberObserver[0];

    private int addNum1;
    private int addNum2;


    public void addNumberObserver(NumberObserver numberObserver) {
        NumberObserver[] temp = new NumberObserver[observerArray.length + 1];
        for (int i = 0; i < observerArray.length; i++) {
            temp[i] = observerArray[i];
        }
        temp[observerArray.length] = numberObserver;
        observerArray = temp;
    }


    public void calculateFunction(int addNum1, int addNum2) {
        this.addNum1=addNum1;
        this.addNum2=addNum2;
        notifyObservers();

    }

    public void notifyObservers() {
        for (NumberObserver ob : observerArray) {
            ob.update(addNum1,addNum2);

        }
    }

}
