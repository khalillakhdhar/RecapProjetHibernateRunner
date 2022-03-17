package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Document;
import com.demo.repository.DocumentRepository;

@Service
public class DocumentService {
@Autowired
DocumentRepository documentRepository;
public Document addDocument(Document doc)
{
return documentRepository.save(doc);	

}
public List<Document> getdocuments()
{
return documentRepository.findAll();	

}
public void deleteDoc(int id)
{
documentRepository.deleteById(id);	

}


}
