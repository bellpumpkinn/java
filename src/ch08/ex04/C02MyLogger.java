package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger = Logger.getLogger("ch08.ex04"); //그냥 써라. 이해하지말고 써라. 반복숙달할것.
	}
	
	public void log() {
		logger.info("로깅을 시작합니다.");
		
		try {
			throw new Exception("일부러 예외를 만들었습니다.");
		} catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("로깅을 끝냅니다.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}

