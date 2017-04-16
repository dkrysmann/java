package SayHello;

 class European implements Person{
    private String name;

    public European(String name){
        this.setName(name);
    }
    private void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void sayHello(){
        System.out.println("Hello");
    }
}
