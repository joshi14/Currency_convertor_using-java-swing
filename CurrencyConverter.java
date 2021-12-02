package currencyConverter;

import java.awt.EventQueue;
import javax.swing.UIManager;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainWindow mainWindow = new MainWindow();
					mainWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
