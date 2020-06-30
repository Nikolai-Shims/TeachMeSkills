package Lesson6.human;

import Lesson6.human.boots.Boots;
import Lesson6.human.jacket.Jacket;
import Lesson6.human.pants.Pants;

public class Run {
    public static void main(String[] args) {
       Boots bots = new Boots();
        Jacket jacket = new Jacket();
        Pants pants = new Pants();


        Human st = new Human("vasia",jacket,bots,pants);
        st.putOffAllThings();
        st.putOnAllThings();
    }
}
