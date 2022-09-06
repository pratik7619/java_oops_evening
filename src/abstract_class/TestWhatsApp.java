package abstract_class;

//this()
//super()

abstract class WhatsAppV1 {

    WhatsAppV1() {
        System.out.println("WhatsApp v1");
    }

    void doChat() {
        System.out.println("Chatting feature enabled");
    }

    abstract void doVoiceCall();

    abstract void doVideoCall();
}

abstract class WhatsAppV2 extends WhatsAppV1 {
    @Override
    void doVoiceCall() {
        System.out.println("Voice calling feature enabled");
    }
}

//Concrete Class
class WhatsAppV3 extends WhatsAppV2 {
    @Override
    void doVideoCall() {
        System.out.println("Video call feature enabled");
    }
}

public class TestWhatsApp {
    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {
        WhatsAppV3 v3 = new WhatsAppV3();
        v3.doChat();
        v3.doVoiceCall();
        v3.doVideoCall();
    }
}
