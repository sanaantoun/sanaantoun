using System;
using System.IO;


    public static class TextFileProcessor {

        public static string
         
         public delegate void stringdel(string str);
         public static event stringdel LineRead;

         public static void Read(string file)  
         { string readText = File.ReadAllText(file);
         string[] lines = readText.Split('\n');
         Console.WriteLine("Nr. Of lines in file: " + lines.Length);
         foreach (string i in lines){
            LineRead(i);
         }
        }  
    }