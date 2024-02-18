Console.WriteLine("Kaç adet kitap gireceksiniz: ");
byte book = Convert.ToByte(Console.ReadLine());

String[] writer = new string[book];
String[] publisher= new string[book];
Int32[] numberPage = new Int32[book];
Int32[] price = new Int32[book];
Int32[] yearPrint = new Int32[book];
String[] nameBook = new string[book];


for(int i = 0; i < book; i++)
{
    Console.WriteLine("Kitabın adını giriniz: ");
    nameBook[i] = Console.ReadLine();

    Console.WriteLine("Kitabın yazarını giriniz: ");
    writer[i] = Console.ReadLine();
    Console.WriteLine("Kitabın ücretini biliyormusunuz? Bilinmiyorsa -1 giriniz, biliniyorsa 1 ");
    Int32 knowledge = Convert.ToInt32(Console.ReadLine());
 
        if (knowledge == -1)
        {
            Console.WriteLine("Kitabın ücreti girilmedi ama işlem devam ediyor.");
        price[i] = -1;
        
        }
        else if (knowledge == 1)
        {
            Console.WriteLine("Kitabın ücretini giriniz: ");
            price[i] = Convert.ToInt32(Console.ReadLine());
        }
        else
        {
            Console.WriteLine("Yalnış tuşlama yaptınız: ");
        }
    
    Console.WriteLine("Kitabın sayfa sayısını giriniz: ");
    numberPage[i] = Convert.ToInt32(Console.ReadLine());
    Console.WriteLine("Kitabın yılını giriniz: ");
    yearPrint[i] = Convert.ToInt32(Console.ReadLine());
    Console.WriteLine("Kitabın yayın evini biliyormusunuz? Bilinmiyorsa belirsiz giriniz belli ise belli ");
     String knowledge2 =Console.ReadLine();
    if (knowledge2 == "belirsiz")
    {
        Console.WriteLine("Kitabın yayınevi girilmedi ama işlem dewam ediyor");
        publisher[i] = "Yayın evi bilinmiyor";
    }
    else if (knowledge2 == "belli")
    {
        Console.WriteLine("Kitabın yayınevini giriniz: ");
        publisher[i] = Console.ReadLine();
    }
}

for (; ; )
{
    Console.WriteLine("1-Listeleme\n2-Kitap adı arama\n3-Ortalama sayfa sayısı\n4-Ücreti bilinmeyen kitabın bilgileri\n5-Ortalama ücret\n6-Çıkış");
    Console.WriteLine("Yapmak istediğiniz işlem seçiniz: ");
    byte choose = Convert.ToByte(Console.ReadLine());

    switch (choose)
    {
        case 1:
            for(int i = 0; i < book; i++)
            {
                Console.WriteLine("Kitabın adı: " + nameBook[i]);
                Console.WriteLine("Kitabın yazarı: " + writer[i]);
                Console.WriteLine("Kitabın sayfa sayısı: " + numberPage[i]);
                Console.WriteLine("Kitabın yılı: " + yearPrint[i]);
                Console.WriteLine("Kitabın ücreti: " + price[i]);
                Console.WriteLine("Kitabın yayınevi: " + publisher[i]);
                
                
            }
            break;

        case 2:
            bool control = false;

            int sayac = 0;
            Console.WriteLine("Aramak istediğiniz kitabın adını giriniz: ");
            String search = Console.ReadLine().ToLower();
            for(int i = 0;i < book; i++)
            {
                if (nameBook[i].ToLower() == search)
                {
                    Console.WriteLine("Kitabın adı: " + nameBook[i]);
                    Console.WriteLine("Kitabın yazarı: " + writer[i]);
                    Console.WriteLine("Kitabın sayfa sayısı: " + numberPage[i]);
                    Console.WriteLine("Kitabın yılı: " + yearPrint[i]);
                    Console.WriteLine("Kitabın ücreti: " + price[i]);
                    Console.WriteLine("Kitabın yayınevi: " + publisher[i]);
                    sayac++;
                    control = true;
                }

                if(control == false)
                {
                    Console.WriteLine("Aranan isim yok.");
                }
                if(sayac == 0)
                {
                    Console.WriteLine("Yalnış isim");
                }
                else
                {
                    Console.WriteLine("Aranan isim: "+sayac+" yerde geçmektedir.");
                }

            }
            break;

        case 3:
            Int32 tpage = 0;
            for(int i = 0; i < book; i++)
            {
                tpage += numberPage[i];
            }
            Console.WriteLine("Ortalama sayfa sayısı: "+tpage/book);

            break;

            case 4:

            for(int i = 0; i < book; i++)
            {
                if (price[i] == -1)
                {
                    Console.WriteLine("Kitabın adı: " + nameBook[i]);
                    Console.WriteLine("Kitabın yazarı: " + writer[i]);
                    Console.WriteLine("Kitabın sayfa sayısı: " + numberPage[i]);
                    Console.WriteLine("Kitabın yılı: " + yearPrint[i]);
                    Console.WriteLine("Kitabın ücreti: " + price[i]);
                    Console.WriteLine("Kitabın yayınevi: " + publisher[i]);
                }
            } 
            break;

        case 5:
            int tprice = 0;
            byte remove = 0;
            for(int i = 0; i < book; i++)
            {
                if (price[i] == -1)
                {
                    remove++;
                    
                }
                else
                {
                    price[i - remove] = price[i];
                }
            }
            book -= remove;
            for(int i = 0; i < book; i++)
            {
                tprice += price[i];
            }
            Console.WriteLine("Ücretlerin ortalaması: "+tprice/book);
            
            break;

        case 6:
            Environment.Exit(0);
            break;

    }

}











