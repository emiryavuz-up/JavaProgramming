package aHomeTask.day39;

public class FriendlyAnimal extends Animal{

    private boolean isWild, isFriendly, isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public FriendlyAnimal(String name, String breed, String size, String colour, char gender, int age) {
        super(name, breed, size, colour, gender, age);
    }

    public void play(){
        System.out.println(getName() + " is playing.");
    }


}
/*
Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */