/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitbio;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;
import java.io.IOException;


/**
 *
 * @author AISSAN Francois
 */
public class Impression_vente {
    public static void main(String[] args) throws IOException{
        //https://www.youtube.com/watch?v=5yrKc0Z2SS4 
        String path = "D:\\facture_vente.pdf";
        PdfWriter pdfW = new PdfWriter(path);
        PdfDocument pdfDoc = new PdfDocument(pdfW);
        Document doc = new Document(pdfDoc);
        pdfDoc.setDefaultPageSize(PageSize.A4);
        
        float col = 280f;
        float columnWidth[] = {col,col};
        
        Table tableee = new Table(columnWidth);
        tableee.setBackgroundColor(new DeviceRgb(0,169,54)).setFontColor(new DeviceRgb(255,255,255));
        tableee.addCell(new Cell().add(new Paragraph("Facture d'achat"))
        .setTextAlignment(TextAlignment.CENTER)
                .setVerticalAlignment(VerticalAlignment.MIDDLE)
                .setMarginTop(30f)
                .setMarginBottom(30f)
                .setFontSize(30f)
                .setBorder(Border.NO_BORDER));       
        tableee.addCell(new Cell().add(new Paragraph("Bio Market \n Colobane - Dakar, Rue 345 \n sales@biomarket.com \n +221 786070960 "))
                .setTextAlignment(TextAlignment.RIGHT)
                .setMarginTop(30f)
                .setMarginBottom(30f)
                .setMarginRight(10f)
                .setBorder(Border.NO_BORDER));
        
        float colwidth[] = {80,300,100,80};
        Table customerInfoTable = new Table(colwidth);
        //customerInfoTable.addCell(new Cell(0, 4));
        customerInfoTable.addCell(new Cell(0, 4).add(new Paragraph("Informations du client")).setBold().setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("Client")).setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("AISSAN François")).setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("Facture n°")).setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("BK-00001-22")).setBorder(Border.NO_BORDER));
        
        customerInfoTable.addCell(new Cell().add(new Paragraph("Mo. No")).setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("345678976")).setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("Date")).setBorder(Border.NO_BORDER));
        customerInfoTable.addCell(new Cell().add(new Paragraph("26/08/2022")).setBorder(Border.NO_BORDER));
        
        float itemInfoColWidth[] = {40,226,50,132,132};
        Table itemInfoTable = new Table(itemInfoColWidth);
        itemInfoTable.addCell(new Cell().add(new Paragraph("N°"))
            .setBackgroundColor(new DeviceRgb(0,169,54)).setFontColor(new DeviceRgb(255,255,255)));
        itemInfoTable.addCell(new Cell().add(new Paragraph("Désignation"))
                .setBackgroundColor(new DeviceRgb(0,169,54)).setFontColor(new DeviceRgb(255,255,255)));
        itemInfoTable.addCell(new Cell().add(new Paragraph("Quantité"))
                .setBackgroundColor(new DeviceRgb(0,169,54)).setFontColor(new DeviceRgb(255,255,255)));
        itemInfoTable.addCell(new Cell().add(new Paragraph("Prix Unitaire"))
                .setBackgroundColor(new DeviceRgb(0,169,54))
                .setFontColor(new DeviceRgb(255,255,255))
                .setTextAlignment(TextAlignment.RIGHT));
        itemInfoTable.addCell(new Cell().add(new Paragraph("Montant"))
                .setBackgroundColor(new DeviceRgb(0,169,54))
                .setFontColor(new DeviceRgb(255,255,255))
                .setTextAlignment(TextAlignment.RIGHT));
        
        //Les enregistrements
        for(int i =1; i<=25; i++)
        {
            itemInfoTable.addCell(new Cell().add(new Paragraph(""+i)));
            itemInfoTable.addCell(new Cell().add(new Paragraph("Mange")));
            itemInfoTable.addCell(new Cell().add(new Paragraph("45"))
                    .setTextAlignment(TextAlignment.RIGHT));
            itemInfoTable.addCell(new Cell().add(new Paragraph("200.0"))
                    .setTextAlignment(TextAlignment.RIGHT));
            itemInfoTable.addCell(new Cell().add(new Paragraph("9000"))
                    .setTextAlignment(TextAlignment.RIGHT));
            
        }
        
        itemInfoTable.addCell(new Cell(0,4).add(new Paragraph("Réduction"))
                     .setTextAlignment(TextAlignment.CENTER)
                     .setBold());
        itemInfoTable.addCell(new Cell().add(new Paragraph("11750"))
                .setTextAlignment(TextAlignment.RIGHT));        
               
        itemInfoTable.addCell(new Cell(0,4).add(new Paragraph("Montant total"))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setBold());
        itemInfoTable.addCell(new Cell().add(new Paragraph("0"))
                .setTextAlignment(TextAlignment.RIGHT));        
           
        itemInfoTable.addCell(new Cell(0,4).add(new Paragraph("Montant net à payer"))
                .setBackgroundColor(new DeviceRgb(0,169,54)).setFontColor(new DeviceRgb(255,255,255))
                 .setBorder(Border.NO_BORDER)
                  .setBold()
                  .setTextAlignment(TextAlignment.CENTER));
        itemInfoTable.addCell(new Cell().add(new Paragraph("11750"))
                .setBackgroundColor(new DeviceRgb(0,169,54)).setFontColor(new DeviceRgb(255,255,255))
                .setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.RIGHT));

        doc.add(tableee);
        doc.add(new Paragraph("\n"));
        doc.add(customerInfoTable);
        
        doc.add(new Paragraph("\n"));
        doc.add(itemInfoTable);

        doc.add(new Paragraph("\n Le service commercial").setTextAlignment(TextAlignment.RIGHT));
        
        
        doc.close();
        System.out.println("Facture émise");
        
                
    }
    
}
