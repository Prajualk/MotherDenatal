package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Md_pages {
	WebDriver driver;
	//module-1 
	By logo=By.xpath("/html/body/div[5]/div/div/div[1]/div/ul/li[1]/a/img");
    By logodis=By.xpath("/html/body/div[5]/div/div/div[1]/div/ul/li[1]/a/img");
    By mobile=By.xpath("/html/body/div[4]/div/div/div/div[1]/ul/li[1]/a");
	By email=By.xpath("/html/body/div[4]/div/div/div/div[1]/ul/li[2]/a[2]");
	By appoinment=By.xpath("/html/body/div[4]/div/div/div/div[2]/div/a/button");
	By fb=By.xpath("/html/body/div[4]/div/div/div/div[3]/ul/li[1]/a");
	By ins=By.xpath("/html/body/div[4]/div/div/div/div[3]/ul/li[2]/a");
	By uou=By.xpath("/html/body/div[4]/div/div/div/div[3]/ul/li[3]/a");
	By link=By.xpath("/html/body/div[4]/div/div/div/div[3]/ul/li[4]/a");
	By Home=By.xpath("//*[@id=\"nav_filter\"]/li[1]");
	By About=By.xpath("//*[@id=\"nav_filter\"]/li[2]/a");
	By Dr=By.xpath("//*[@id=\"nav_filter\"]/li[3]/a");
	By dept=By.xpath("//*[@id=\"nav_filter\"]/li[4]/a");
	By career=By.xpath("//*[@id=\"nav_filter\"]/li[5]/a");
	By Dentalcare=By.xpath("//*[@id=\"nav_filter\"]/li[6]/a");
	By Conactus=By.xpath("//*[@id=\"nav_filter\"]/li[7]/a");
	By arrow=By.xpath("/html/body/div[6]/div/div/div[2]/div[2]");
	By arrowleft=By.xpath("/html/body/div[6]/div/div/div[2]/div[1]");
	By preventive_de_care=By.xpath("/html/body/div[7]/div/div/div[1]/a/div/div[2]");
	By Child_den_care=By.xpath("/html/body/div[7]/div/div/div[2]/a/div/div[2]");
	By smile_correction=By.xpath("/html/body/div[7]/div/div/div[3]/a/div/div[2]/h1");
	By image=By.xpath("/html/body/div[8]/div/div/div[1]/div/img");
	By Readmore=By.xpath("/html/body/div[8]/div/div/div[2]/div[2]/p[3]/a");
	By email2=By.xpath("/html/body/div[9]/div/div[3]/div/div/ul/li/a");
	By s_patients=By.xpath("/html/body/div[10]/div/section/div/div/div[1]/div[1]/a/img");
	By Doc_team=By.xpath("/html/body/div[10]/div/section/div/div/div[2]/div[1]/a/img");
    By Impl_placed=By.xpath("/html/body/div[10]/div/section/div/div/div[3]/div[1]/a/img");
	By branches=By.xpath("/html/body/div[10]/div/section/div/div/div[4]/div[1]/a/img");
	By inv_placed=By.xpath("/html/body/div[10]/div/section/div/div/div[5]/div[1]/a/img");
	By arrow3=By.xpath("/html/body/div[11]/div/div/div[2]/div/div/div[2]/div[2]/i");
	By arrow_left2=By.xpath("/html/body/div[11]/div/div/div[2]/div/div/div[2]/div[1]/i");
	By ed_plly1=By.xpath("/html/body/div[12]/div/div[2]/div/div[1]/div/p[2]/button");
	By ed_plly2=By.xpath("/html/body/div[12]/div/div[2]/div/div[2]/div/p[2]/button");
	By Tr_thara=By.xpath("/html/body/div[12]/div/div[2]/div/div[3]/div/p[2]/button");
	By Tr_kar=By.xpath("/html/body/div[12]/div/div[2]/div/div[4]/div/p[2]/button");
	By Tr_sr=By.xpath("/html/body/div[12]/div/div[3]/div/div[1]/div/p[2]/button");
	By Kotta_kl=By.xpath("/html/body/div[12]/div/div[3]/div/div[2]/div/p[2]/button");
	By Veng=By.xpath("/html/body/div[12]/div/div[3]/div/div[3]/div/p[2]/button");
	By clt=By.xpath("/html/body/div[12]/div/div[3]/div/div[4]/div/p[2]/button");
	By kannure=By.xpath("/html/body/div[12]/div/div[3]/div/div[5]/div/p[3]/button");
	By uae1=By.xpath("/html/body/div[12]/div/div[3]/div/div[6]/div/p[2]/button");
	By back_a=By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/button");
	By back_b=By.xpath("//*[@id=\"myModal01\"]/div/div/div[2]/button");
	By back_c=By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/button");
	By back_d=By.xpath("//*[@id=\"myModal01\"]/div/div/div[2]/button");
	By back_e=By.xpath("//*[@id=\"myModal5\"]/div/div/div[2]/button");
	By back_f=By.xpath("//*[@id=\"myModal4\"]/div/div/div[2]/button");
	By back_g=By.xpath("//*[@id=\"myModal5\"]/div/div/div[2]/button");
	By back_h=By.xpath("//*[@id=\"myModal3\"]/div/div/div[2]/button");
	By back_i=By.xpath("//*[@id=\"myModal6\"]/div/div/div[2]/button");
	By back_j=By.xpath("//*[@id=\"myModal9\"]/div/div/div[2]/button");
	By home_new=By.xpath("/html/body/div[13]/div[1]/div[1]/div/div/div/div[1]/a/img");
	By phone_1=By.xpath("/html/body/div[13]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/a");
	By email_1=By.xpath("/html/body/div[13]/div[1]/div[1]/div/div/div/div[2]/ul/li[3]/a");
	By inst_2=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/h1/a");
	By homea=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[1]/a");
	By about_us1=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[2]/a");
	By doc_1=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[3]/a");
	By dep_1=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[4]/a");
	By  career_1=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[5]/a");
	By Dental_care1=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[6]/a");
	By contact_us1=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[7]/a");
	By privacy_policy=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[8]/a");
	By arrow_6=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div/div[2]/div[1]");
	By arrow_7=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div/div[2]/div[2]");
	By drop_up=By.xpath("//*[@id=\"return-to-top\"]/i");
	By meridian=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[2]/div/div/div[1]/span/a");
	By linka=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[4]/a/i");
	By you_b=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[3]/a/i");
	By instc=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[2]/a/i");
	By fbd=By.xpath("/html/body/div[13]/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[1]/a/i");
	//module-2
	By book_aapnt2=By.xpath("/html/body/div[4]/div/div/div/div[2]/div/a/button");
	By homeapp=By.xpath("/html/body/div[4]/div[2]/div/div/div/div/ol/li[1]/a");
	By whatsapp1=By.xpath("/html/body/div[8]/a/div/img");
	By full_nmae=By.xpath("//*[@id=\"contact-form\"]/div/div[1]/div/input");
	By email_app=By.xpath("//*[@id=\"contact-form\"]/div/div[2]/div/input");
	By phn_no=By.xpath("//*[@id=\"contact-form\"]/div/div[3]/div/input");
	By branches_1=By.xpath("//*[@id=\"contact-form\"]/div/div[4]/div/select");
	By clt2=By.xpath("//*[@id=\"contact-form\"]/div/div[4]/div/select/option[2]");
	By edd_a=By.xpath("//*[@id=\"contact-form\"]/div/div[4]/div/select/option[10]");
	By mess=By.xpath("//*[@id=\"contact-form\"]/div/div[5]/div/textarea");
	By submit=By.xpath("//*[@id=\"contact-form\"]/div/div[6]/div[3]/input");
	//module-3
	By calicut=By.xpath("//*[@id=\"verticalTab\"]/ul/li[1]");
	By doc_cal=By.xpath("//*[@id=\"service-r1\"]/div[1]/div[1]/div[2]/div/ul/li/a");
	By mlp=By.xpath("//*[@id=\"verticalTab\"]/ul/li[2]");
	By doc_mlp=By.xpath("//*[@id=\"service-r1\"]/div[2]/div[1]/div[2]/div/ul/li/a");
	By doc_mlp2=By.xpath("//*[@id=\"service-r1\"]/div[2]/div[2]/div[2]/div/ul/li/a");
	By erklm=By.xpath("//*[@id=\"verticalTab\"]/ul/li[3]");
	By doc_ernk=By.xpath("//*[@id=\"service-r1\"]/div[3]/div[1]/div[2]/div/ul/li/a");
	By doc_erk2=By.xpath("//*[@id=\"service-r1\"]/div[3]/div[2]/div[2]/div/ul/li/a");
	By tsr1=By.xpath("//*[@id=\"verticalTab\"]/ul/li[4]");
	By doc_tsr1=By.xpath("//*[@id=\"service-r1\"]/div[4]/div[1]/div[2]/div/ul/li/a");
	By doc_tsr2=By.xpath("//*[@id=\"service-r1\"]/div[4]/div[2]/div[2]/div/ul/li/a");
	By kannur2=By.xpath("//*[@id=\"verticalTab\"]/ul/li[5]");
	By knnure_doc_1=By.xpath("//*[@id=\"service-r1\"]/div[5]/div[1]/div[2]/div/ul/li/a");
	//module-4
    By pt=By.xpath("//*[@id=\"verticalTab\"]/ul/li[2]");
    By ct=By.xpath("//*[@id=\"verticalTab\"]/ul/li[3]");
	By pd=By.xpath("//*[@id=\"verticalTab\"]/ul/li[4]");
	By od=By.xpath("//*[@id=\"verticalTab\"]/ul/li[5]");
	By ali=By.xpath("//*[@id=\"verticalTab\"]/ul/li[6]");
	//module-5
	By career_f=By.xpath("//*[@id=\"nav_filter\"]/li[5]/a");
	By email_c=By.xpath("/html/body/div[5]/div/div/p[1]/strong/a/span");

	public Md_pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void logodisplay()
	{
		boolean mlogo=driver.findElement(logo).isDisplayed();
		if(mlogo==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
		public void logoclick()
		{
			driver.findElement(logodis).click();
		}
	
	public void phonee()
	{
		driver.findElement(mobile).click();
	}
	public void back()
	{
		driver.navigate().back();
	}
	public void emaill()
	{
		driver.findElement(email).click();
	}
	public void appnmt()
	{
		driver.findElement(appoinment).click();
	}
	public void facebook()
	{
		driver.findElement(fb).click();
	}
	public void instagram()
	{
		driver.findElement(ins).click();
	}
	public void youtube()
	{
		driver.findElement(uou).click();
	}
	public void linkidin()
	{
		driver.findElement(link).click();
	}
	public void homme()
	{
		driver.findElement(Home).click();
	}
	public void aboutus()
	{
		driver.findElement(About).click();
	}
	public void Doctors()
	{
		driver.findElement(Dr).click();
	}
	public void Department()
	{
		driver.findElement(dept).click();
	}
	public void career1()
	{
		driver.findElement(career).click();
	}
	public void dentalcare1()
	{
		driver.findElement(Dentalcare).click();
	}
	public void contactus1()
	{
		driver.findElement(Conactus).click();
	}
	public void arrow1()
	{
	driver.findElement(arrow).click();	
	driver.findElement(arrow).click();
	driver.findElement(arrow).click();
	driver.findElement(arrow).click();
	
	}
	public void arrow2()
	{
		driver.findElement(arrowleft).click();
		driver.findElement(arrowleft).click();
		driver.findElement(arrowleft).click();
		driver.findElement(arrowleft).click();
	}
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)","");
	}
	public void preventive_de_care() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		driver.findElement(preventive_de_care).click();
		Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,500)",""); 
		 js.executeScript("window.scrollBy(0,600)",""); 
		
	}
	public void child_dental_care() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;	
	driver.findElement(Dentalcare).click();	
	Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,500)",""); 
	 js.executeScript("window.scrollBy(0,600)",""); 
	
	}
	public void smile_correction() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(smile_correction).click();
		Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,500)",""); 
		 js.executeScript("window.scrollBy(0,600)",""); 
		}
	public void hover() throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(image);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
	}
	public void redmore1()
	{
		driver.findElement(Readmore).click();
	}
	public void emaill1()
	{
		driver.findElement(email2).click();
	}
	public void patients()
	{
		driver.findElement(s_patients).click();
	}
	public void Doc()
	{
		driver.findElement(Doc_team).click();
	}
	public void  imp_placed2()
	{
		driver.findElement(Impl_placed).click();
	}
	public void branches1()
	{
		driver.findElement(branches).click();
	}
	public void inv_placed1()
	{
		driver.findElement(inv_placed).click();
	}
	public void arrow4()
	{
		driver.findElement(arrow3).click();
		driver.findElement(arrow3).click();
		driver.findElement(arrow3).click();
	
	}
	public void arrow5()
	{
		driver.findElement(arrow_left2).click();
		driver.findElement(arrow_left2).click();
		driver.findElement(arrow_left2).click();
	
	}
	public void scroll2()
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1800)","");
	}
	public void eddpalyy1()
{
	driver.findElement(ed_plly1).click();
}
public void eddappaly2()
{
	driver.findElement(ed_plly2).click();
	
}
public void thrip()
{
	driver.findElement(Tr_thara).click();
}
public void thrikakara()
{
	driver.findElement(Tr_kar).click();
	
}
public void thrissure()
{
	driver.findElement(Tr_sr).click();
	
}
public void Kottakal()
{
	driver.findElement(Kotta_kl).click();
}
public void vengara()
{
	driver.findElement(Veng).click();
}
public void calicut()
{
	driver.findElement(clt).click();
}
public void kannur()
{
	driver.findElement(kannure).click();
}
public void uae()
{
	driver.findElement(uae1).click();
}
public void backa()
{
	driver.findElement(back_a).click();
}
public void backb()
{
	driver.findElement(back_b).click();
}
public void backc()
{
	driver.findElement(back_c).click();
}
public void backd()
{
	driver.findElement(back_d).click();
}
public void backe()
{
	driver.findElement(back_e).click();
}
public void backf()
{
	driver.findElement(back_f).click();
}
public void backg() {
	driver.findElement(back_g).click();
}
public void backh()
{
	driver.findElement(back_h).click();
}
public void backi()
{
	driver.findElement(back_i).click();
}
public void backj()
{
	driver.findElement(back_j).click();
}
public void homenew()
{
	driver.findElement(home_new).click();
}
public void phone1()
{
	driver.findElement(phone_1).click();
}
public void email1()
{
	driver.findElement(email_1).click();
}
public void scroll_new()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
public void instagram_2()
{
	driver.findElement(inst_2).click();
}
public void home_a()
{
	driver.findElement(homea).click();
}
public void about_us_1()
{
	driver.findElement(about_us1).click();
}
public void doc1()
{
	driver.findElement(doc_1).click();
}
public void dept1()
{
	driver.findElement(dep_1).click();
}
public void career_2()
{
	driver.findElement(career_1).click();
}
public void dental_care1()
{
	driver.findElement(About).click();
}
public void contact_us()
{
	driver.findElement(contact_us1).click();
}
public void privacy()
{
	driver.findElement(privacy_policy).click();
}
public void arrow6()
{
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
	driver.findElement(arrow_6).click();
}
public void arrow7()
{
	driver.findElement(arrow_7).click();
	driver.findElement(arrow_7).click();
	driver.findElement(arrow_7).click();
	driver.findElement(arrow_7).click();
	driver.findElement(arrow_7).click();
	driver.findElement(arrow_7).click();
	driver.findElement(arrow_7).click();
}
 public void dropup()
{
	driver.findElement(drop_up);
} 
 public void meridin_1()
 {
	 driver.findElement(meridian).click();
 }
 public void link_a()
 {
	 driver.findElement(linka).click();
 }
 public void yuu_b()
 {
	 driver.findElement(you_b).click();
 }
 public void inst_c()
 {
	 driver.findElement(instc).click();
 }
 public void fb_d()
 {
	 driver.findElement(fbd).click();
 }
 public void scroll_up()
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
 }
 public void appoinmt_a()
 {
	 driver.findElement(book_aapnt2).click();
 }
 public void home_app()
 {
	 driver.findElement(homeapp).click();
 }
 public void whast()
 {
	 driver.findElement(whatsapp1).click();
 }
 public void fullnmae()
 {
	 driver.findElement(full_nmae).sendKeys("arun");
 }
 public void email_a()
 {
	 driver.findElement(email_app).sendKeys("arun00772@yahoo.com");
 }
 public void phon_no1()
 {
	 driver.findElement(phn_no).sendKeys("7510700259");
 }
 public void branches2() throws InterruptedException
 {
	 driver.findElement(branches_1).click();
	 driver.findElement(clt2).click();
	 Thread.sleep(2000);
	 driver.findElement(edd_a).click();
	 
 }
 public  void message()
 {
	 driver.findElement(mess).sendKeys("hey hello");
 }
 public void submit2()
 {
	 driver.findElement(submit).click();
 }
public void location() throws InterruptedException
{ 
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.findElement(calicut).click();
	Thread.sleep(1000);
	driver.findElement(doc_cal).click();
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,300)","");
	js.executeScript("window.scrollBy(0,300)","");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,300)","");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,300)","");
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,300)","");
}
public void location_mlp() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(mlp).click();
	Thread.sleep(3000);
	driver.findElement(doc_mlp).click();
	 js.executeScript("window.scrollBy(0,200)",""); 
	Thread.sleep(3000);
	driver.findElement(doc_mlp2).click();
	Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,250)",""); 
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,300)","");
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,400)","");
	 Thread.sleep(3000); 
}
public void location_ernklm() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(erklm).click();
	Thread.sleep(3000);
	driver.findElement(doc_ernk).click();
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(3000);
	driver.findElement(doc_ernk).click();
	Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,250)",""); 
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(1000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 js.executeScript("window.scrollBy(0,250)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(3000);
}
public void location_tsr() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
    driver.findElement(tsr1).click();
    Thread.sleep(3000);
    driver.findElement(doc_tsr1).click();
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,200)",""); 
    Thread.sleep(3000);
    driver.findElement(doc_tsr2).click();
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,300)",""); 
    Thread.sleep(3000);
}
public void location_kann() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(kannur2).click();
	Thread.sleep(3000);
	driver.findElement(knnure_doc_1).click();
	  js.executeScript("window.scrollBy(0,300)",""); 
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,300)",""); 
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,300)",""); 
	  Thread.sleep(3000);
}
public void depf() throws InterruptedException
{

	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(dept).click();
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 js.executeScript("window.scrollBy(0,200)",""); 
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,500)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,500)",""); 
	 js.executeScript("window.scrollBy(0,600)",""); 
}
public void depf1() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 driver.findElement(pt).click();
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
}
public void depf2() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(ct).click();
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(2000);
}
public void depf3() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(pd).click();
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,200)","");
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(2000);
	
}
public void depf4() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(od).click();
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
}
public void depf5() throws InterruptedException
{
 driver.findElement(ali).click();
 Thread.sleep(3000);
}
public void carre_f() throws InterruptedException
{
	driver.findElement(career_f).click();
	Thread.sleep(3000);
	driver.findElement(email_c).click();
	
	
}
public void de_care() throws InterruptedException
{
	driver.findElement(Dentalcare).click();
	Thread.sleep(4000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)","");
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,200)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,300)",""); 
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(2000);
	
}
public void conatc_us002() throws InterruptedException
{
	driver.findElement(Conactus).click();
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,400)",""); 
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,-500)",""); 
	 driver.findElement(homeapp).click();
	
}
   

}



