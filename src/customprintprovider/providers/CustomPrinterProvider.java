package customprintprovider.providers;

import java.io.File;
import javax.activation.DataSource;

public interface CustomPrinterProvider {

	void cmd_customPrint(File attachment, int m_WindowNo);
	void cmd_customPrintBads(int m_WindowNo, DataSource bads);
}
