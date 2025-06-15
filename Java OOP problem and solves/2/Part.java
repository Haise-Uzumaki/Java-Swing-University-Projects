class Part {
    private int empID;
    public double salary;
    public double overTimePay;


    public void setEmpID(int empID){
        this.empID = empID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setOverTimePay(double oTP){
        this.overTimePay = oTP;
    }

    public int getEmpID(){
        return empID;
    }

    public double getSalary(){
        return salary;
    }

    public double getOverTimePay(){
        return overTimePay;
    }
}
