/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.logica;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.element.Table;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PDFExporter {
  public static void exportarProductosAPDF(List<Producto> productos, String filePath) {
        try {
            // Crear el archivo PDF
            PdfWriter writer = new PdfWriter(filePath);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Título del reporte
            document.add(new Paragraph("Reporte de Productos")
                .setTextAlignment(TextAlignment.CENTER)
                .setFontSize(18));

            // Crear tabla
            Table table = new Table(5); // Número de columnas
            table.addHeaderCell("ID");
            table.addHeaderCell("Número de Serie");
            table.addHeaderCell("Oficina");
            table.addHeaderCell("Estado");
            table.addHeaderCell("Fecha Registro");

            // Llenar la tabla con datos
            for (Producto producto : productos) {
                table.addCell(String.valueOf(producto.getIdProducto()));
                table.addCell(producto.getNumeroSerie());
                table.addCell(producto.getOficina());
                table.addCell(producto.getEstado());
                table.addCell(producto.getFechaRegistro().toString());
            }

            // Agregar la tabla al documento
            document.add(table);

            // Cerrar el documento
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  

