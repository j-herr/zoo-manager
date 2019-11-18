public abstract class Animal {
  protected String name;
  protected String food_type;
  protected int development_stage;
  protected int workers;
  
  public String getName() {
    return name;
  }
  public String getFoodType() {
    return food_type;
  }
  public int getDevelopmentStage() {
    return development_stage;
  }
  public int getWorkers() {
    return workers;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  public void setFoodType(String food) {
    food_type = food;
  }
  public void setDevelopmentStage(int development) {
    development_stage = development;
  }
  public void setWorkers(int workers) {
    this.workers = workers;
  }
  
  abstract int getTemp();
  abstract int toString();
  
