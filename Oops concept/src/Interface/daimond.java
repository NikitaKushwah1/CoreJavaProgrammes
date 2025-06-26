package Interface;

 
interface Device {
 void start();   
}

 
interface Camera {
 void start();  
}


 
class SmartPhone implements Camera, Device {


 public static void main(String[] args) {
     SmartPhone phone = new SmartPhone();
     phone.start();   
 }

@Override
public void start() {

	
}
}
