package aHomeTask.day36.PhoneTask;

public class IPhone extends Phone {

    public void facetime(long phoneNumber){
        System.out.println(model + " is facetiming this number: "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model + " is facetiming this email: " + email);
    }

    public static void main(String[] args) {

        IPhone phone1 = new IPhone();
        phone1.setInfo("iPhone", "20 X 5 6 Pro Ultimate Maximum Plus Premium Diamond", "Enormous", "Midnight Blue",87418475);
        phone1.call(58931589);
        phone1.text(953950);
        System.out.println(phone1);



    }



}

/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */