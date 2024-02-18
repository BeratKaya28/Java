/*List<String> adlar = new List<string>();
adlar.Add("Ali");
adlar.Add("Veli");
adlar.Add("Ayşe");
yazdir(adlar);

void yazdir(List<string> adlar)
{
    foreach(string ad in adlar)
        Console.WriteLine(ad+"\t");
    Console.WriteLine("\n-------------");

}
adlar.Insert(1, "Nurşen");
yazdir(adlar);
adlar.Remove("Ali");
yazdir(adlar);
adlar.RemoveAt(1);
yazdir(adlar);
adlar.Clear();
yazdir(adlar);
for (int i = 0; i<adlar.Count;i++)
{

    Console.WriteLine(adlar[i]);

}
yazdir(adlar);
Console.WriteLine(adlar.Contains("Veli"));
Console.WriteLine(adlar.Contains("Ahmet"));
Console.WriteLine(adlar.IndexOf("Ali"));
Console.WriteLine(adlar.IndexOf("Ahmet"));
adlar[0] = "Nuray";
yazdir(adlar);*/
using System.ComponentModel.Design;

List<String> ad = new List<string>();
List<int> vn=new List<int>();
List<int> fn=new List<int>();
List<int> bn=new List<int>();
while (true)
{
    Console.WriteLine("1-Kayıt giriş\n2-Listeleme\n3-Arama\n4-Düzeltme\n5-Silme\n6-Ort.\n7-Çıkış");
    int secim;
    if (int .TryParse(Console.ReadLine(), out secim))
    {
        switch (secim)
        {
            case 1: KayitGiris(ad, vn, fn, bn); break;
            case 2: Listeleme(ad, vn, fn, bn); break;
            case 3: Arama(ad, vn,fn, bn); break;
            case 4: Düzeltme(ad, vn, fn, bn); break;
            case 5: Silme(ad, vn, fn, bn); break;
            case 6: Ortalama(bn); break;
            case 7:
                Console.WriteLine("Program bitti");
                Environment.Exit(0);
                break;
            default: Console.WriteLine("Menü değeri yalnış"); break;

        }
      
    }
    else Console.WriteLine("Sadece sayısaş değer giriniz: ");

}

void Ortalama(List<int> bn)
{
    Console.WriteLine("Başarı Not Ortalaması: "+bn.Average());
    Console.WriteLine("Başarı not ortalaması minimum: "+bn.Min());
    Console.WriteLine("Başarı Not ortalamasımax değer: "+bn.Max());


}

void Silme(List<string> ad, List<int> vn, List<int> fn, List<int> bn)
{
   Console.WriteLine("Silmek istediğiniz adı giriniz: ");
    String silmek = Console.ReadLine();
    for (int i = 0; i<ad.Count;i++)
    {
        if (silmek == ad[i])
        {
            ad.Clear();
            vn.Clear();
            fn.Clear();
            bn.Clear();
        }
    }
}

void Düzeltme(List<string> ad, List<int> vn, List<int> fn, List<int> bn)
{
   Console.WriteLine("Düzeltmek istediğiniz adı giriniz: ");
    String setName = Console.ReadLine();
    int vizeNot, finalNot;
    for (int i = 0;i<ad.Count;i++)
    {
        if (setName == ad[i])
        {
            Console.WriteLine("İsim giriniz1: ");
            ad.Clear();
            ad.Add(Console.ReadLine());
            
            if (int.TryParse(Console.ReadLine(), out vizeNot))
            {
                vn.Clear();
                vn.Add(vizeNot);
            }
            else
            {
                Console.WriteLine("Girilen vize notu sayısal olmalıdır.");
            }
            
            if (int.TryParse(Console.ReadLine(), out finalNot))
            {
                fn.Clear();
                fn.Add(vizeNot);
            }
            else
            {
                Console.WriteLine("Girilen final notu sayısal olmalıdır.");
            }
            bn.Clear();
            bn.Add((int)(vizeNot * .4 + finalNot * .6));
            Console.WriteLine("Kayıt yapıldı");

        }

    }

}

void Arama(List<string> ad, List<int> vn, List<int> fn, List<int> bn)
{
    Console.WriteLine("Aramak istediğiniz ismi giriniz: ");
    String aranan = Console.ReadLine();
    for (int i = 0; i<ad.Count;i++)
    {
        if (ad[i] == aranan)
        {
            Console.WriteLine("Adı: " + ad[i]);
            Console.WriteLine("Vize notu: " + vn[i]);
            Console.WriteLine("Final notu: " + fn[i]);
            Console.WriteLine("Başarı notu: " + bn[i]);
            Console.WriteLine("--------------------------");
        }
        else
        {
            Console.WriteLine("Aranan isim bulunamadı");
        }
    }
}

void Listeleme(List<string> ad, List<int> vn, List<int> fn, List<int> bn)
{
    for (int i = 0; i<ad.Count;i++)
    {
        Console.WriteLine("Adı: " + ad[i]);
        Console.WriteLine("Vize notu: " + vn[i]);
        Console.WriteLine("Final notu: " + fn[i]);
        Console.WriteLine("Başarı notu: " + bn[i]);
        Console.WriteLine("--------------------------");
    }
}

void KayitGiris(List<string> ad, List<int> vn, List<int> fn, List<int> bn)
{
    Console.WriteLine("İsim giriniz: ");
    ad.Add(Console.ReadLine());
    int vizeNot, finalNot;
    if (int.TryParse(Console.ReadLine(), out vizeNot))
    {
       
        vn.Add(vizeNot);

    }
    else
    {
        Console.WriteLine("Vize not sadece sayısal olmalı");
    }
    if (int.TryParse(Console.ReadLine(), out finalNot))
    {
        Console.WriteLine("Final notunuzu giriniz: ");
        fn.Add(finalNot);
    }
    else
    {
        Console.WriteLine("Final not sadece sayısal olmalı");
    }
    bn.Add((int)(vizeNot* .4 + finalNot * .6));
    Console.WriteLine("Kayıt yapıldı");

}















