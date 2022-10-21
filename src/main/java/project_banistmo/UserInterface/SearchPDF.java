package project_banistmo.UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPDF extends PageObject {

    public static final Target BUTTON_LEARN_EASY = Target.the("shows more information")
            .located(By.xpath("//*/div[2]/div/div/div[2]/div/ul/li[7]/a"));

    public static final Target BUTTON_LEGALES = Target.the("show information about legales")
            .located(By.xpath("//*/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/section/div[2]/div[2]/div/div/div/div[6]/div/div/div[3]/a"));

    public static final Target BUTTON_FATCA_CRS = Target.the("shows infomation about FATCA & CRS")
            .located(By.xpath("//*[@id=\"layoutContainers\"]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/section/div[2]/div[2]/div/div/div/div[2]/div/div/div[3]/a"));

    public static final Target BUTTON_DOWNLOAD_DOCUMENT = Target.the("show the PDF file")
            .located(By.xpath("//*[@id=\"tab1\"]/table/tbody/tr[3]/td[2]/span/a/img"));

    public static final Target VALIDATION_DOCUMENT = Target.the("the document validation is successful")
            .located(By.id("PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf"));




}
