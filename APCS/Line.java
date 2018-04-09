public class Line{
  double x1;
  double y1;
  double x2;
  double y2;

  public Line(Vect2 a, Vect2 b){
      this.x2=a.getX();
      System.out.println(this.x2);
      this.y2=a.getY();
      this.x1=b.getX();
      this.y1=b.getY();
  }
  // public Line(){
  //     this(0,0);
  // }
  public double length(){
    return Math.sqrt(Math.pow((this.x1-this.x2),2) + Math.pow((this.y1-this.y2),2));
  }
  public Line translate(Vect2 transform){
    Vect2 first = new Vect2((this.x1+transform.getX()),(this.y1+transform.getY()));
    Vect2 second = new Vect2((this.x2+transform.getX()),(this.y2+transform.getY()));
    return new Line(first,second);
  }
}
