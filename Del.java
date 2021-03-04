public class Del{
  public static void main(String[] args) {

    Parent kid = new Child();
    kid.doSomething(); // line 1



  }
}
class Parent
{
  public void doSomething(){/* Implementation not shown */}
}

class Child extends Parent
{
  public void doAnotherThing(){/* Implementation not shown */}
}