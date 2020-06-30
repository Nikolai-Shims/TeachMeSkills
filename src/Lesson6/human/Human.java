package Lesson6.human;

import Lesson6.human.boots.IBoots;
import Lesson6.human.jacket.IJacket;
import Lesson6.human.pants.IPants;

public class Human implements IHuman{
    private String name;
    private IJacket jacket;
    private IBoots boots;
    private IPants pants;

    public Human(String name, IJacket jacket, IBoots boots, IPants pants){
        this.name = name;
        this.jacket = jacket;
        this.boots = boots;
        this.pants = pants;
    }
    public Human(){}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public IBoots getBoots() { return boots; }
    public void setBoots(IBoots boots) { this.boots = boots; }

    public IJacket getJacket() { return jacket; }
    public void setJacket(IJacket jacket) { this.jacket = jacket; }

    public IPants getPants() { return pants; }
    public void setPants(IPants pants) { this.pants = pants; }

    @Override
    public void putOnAllThings() {
        boots.putOn();
        pants.putOn();
        jacket.putOn();
    }

    @Override
    public void putOffAllThings() {
        boots.putOff();
        pants.putOff();
        jacket.putOff();
    }




}
