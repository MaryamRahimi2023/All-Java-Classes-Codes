package class22;

public class FinalKeyword {

    final double gravity=9.8;// the value of gravity on earth, something which is fixed and no one can change it
    final double pI=3.14; // pai value
    final double lightSpeed=299792458;

   final void tryChangingGravity(){
       // gravity=1.6; we get an error because this variable is marked final
    }
}
class Child extends FinalKeyword{

   /* @Override
      void tryChangingGravity() { if we put final with methods or class(we can not incinerate it) we can not use it again
        99% time final keyword used by static keyword, we make class final sometimes to speed up when there are lots of lasses inherited
        } */

}