public class Iphone implements PlayerMusic, Phone, BrowserOnInternet {

    public void touch() {
        System.out.println("Playing music");
    }
    public void pause() {
        System.out.println("Music paused.");
    }
    public void selectMusic(String music) {
        System.out.println("Selecting the music:" + music);
    }
    public void connect(String number) {
        System.out.println("Calling: " + number);
    }
    public void answer() {
        System.out.println("Answering the call.");
    }
    public void startVoicemail() {
        System.out.println("Starting voicemail.");
    }
    public void displayPage(String url) {
        System.out.println("Displaying the page:" + url);
    }
    public void addNewTab() {
        System.out.println("Adding a new tab.");
    }
    public void refreshPage(){
         System.out.println("Refreshing the page.");
    }


    public static void main(String[] args) throws Exception {
       Iphone myIphone = new Iphone();

       // Testing Music Player Features
       System.out.println("<!--=============== PLAYER-MUSIC ===============-->");
       myIphone.selectMusic(" Dark Red");
       myIphone.touch();
       myIphone.pause();
       // Testing Phone Features
       System.out.println("<!--=============== PHONE ===============-->");
       myIphone.connect("9988105045");
       myIphone.answer();
       myIphone.startVoicemail();
       // Testing Internet Browser Features
       System.out.println("<!--=============== BROWSER-ON-INTERNET===============-->");
       myIphone.displayPage(" https://github.com/MarceloHabreu/java-dio");
       myIphone.addNewTab();
       myIphone.refreshPage();

    }
}
