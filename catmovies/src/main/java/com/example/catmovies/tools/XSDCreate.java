package com.example.catmovies.tools;

import com.example.catmovies.catpo.CatTicketPo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class XSDCreate {

    public CustomSchemaOutputResolver resolver;

    public static void main(String[] args) {
        XSDCreate xsdCreate = new XSDCreate();
        xsdCreate.resolver = xsdCreate.new CustomSchemaOutputResolver("F:", "CatTicketPo.xsd");

        Class[] classes = { CatTicketPo.class };
        xsdCreate.createXSD(classes);

        System.out.println("all done");
    }

    public void createXSD(Class[] classes) {
        try {
            JAXBContext context = JAXBContext.newInstance(classes);
            context.generateSchema(resolver);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class CustomSchemaOutputResolver extends SchemaOutputResolver {

        private File file;

        public CustomSchemaOutputResolver(String dir, String fileName) {
            try {
                file = new File(dir, fileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
            return new StreamResult(file);
        }

    }
}
