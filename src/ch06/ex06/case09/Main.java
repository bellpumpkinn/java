package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();  //객체.out
		browser.out();
		
		UI.in();
		
		System.out.println();
		Chrome chrome = new Chrome();
		//chrome.in(); 객체.메서드는 불가능하도록 막아놨다.
		chrome.out(); //가능
		chrome.play(); //가능은한데 권장하지는 않는다.
		Chrome.play(); 
		Browser.play();
		
	}
}


/*


*/